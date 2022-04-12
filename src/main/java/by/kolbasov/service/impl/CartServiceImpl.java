package by.kolbasov.service.impl;

import by.kolbasov.entity.Cart;
import by.kolbasov.entity.Camera;
import by.kolbasov.entity.Intercom;
import by.kolbasov.entity.Registrator;
import by.kolbasov.repository.CamRepository;
import by.kolbasov.repository.CartRepository;
import by.kolbasov.repository.IntercomRepository;
import by.kolbasov.repository.RegistratorRepository;
import by.kolbasov.service.CamService;
import by.kolbasov.service.CartService;
import by.kolbasov.service.IntercomService;
import by.kolbasov.service.RegistratorService;
import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CamRepository camRepository;
    @Autowired
    private CamService camService;
    @Autowired
    private UserService userService;
    @Autowired
    private RegistratorService registratorService;
    @Autowired
    private IntercomService intercomService;
    @Autowired
    private RegistratorRepository registratorRepository;
    @Autowired
    private IntercomRepository intercomRepository;

    @Override
    public List<Cart> findByUserId(String login) {
        return cartRepository.findAllByUser_Login(login);
    }

    @Override
    public void delete(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        List<Camera> cameras = cart.getCamera();
        cameras.remove(camService.findById(id));
        cart.setCamera(cameras);
        cartRepository.save(cart);
    }

    @Override
    public void saveCamera(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        if (cart == null) {
            cart = new Cart();
            List<Camera> cameras = new LinkedList<>();
            cameras.add(camRepository.findById(id).orElseThrow());
            cart.setCamera(cameras);
            cart.setUser(userService.findByLogin(login));
        } else {
            cart.getCamera().add(camRepository.findById(id).orElseThrow());
        }
        cartRepository.save(cart);
    }

    @Override
    public void saveRegistrator(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        if (cart == null) {
            cart = new Cart();
            List<Registrator> registrators = new LinkedList<>();
            registrators.add(registratorRepository.findById(id).orElseThrow());
            cart.setRegistrator(registrators);
            cart.setUser(userService.findByLogin(login));
        } else {
            cart.getRegistrator().add(registratorRepository.findById(id).orElseThrow());
        }
        cartRepository.save(cart);
    }

    @Override
    public void saveIntercom(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        if (cart == null) {
            cart = new Cart();
            List<Intercom> intercoms = new LinkedList<>();
            intercoms.add(intercomRepository.findById(id).orElseThrow());
            cart.setIntercom(intercoms);
            cart.setUser(userService.findByLogin(login));
        } else {
            cart.getIntercom().add(intercomRepository.findById(id).orElseThrow());
        }
        cartRepository.save(cart);
    }

    @Override
    public Cart findCartByUserId(String login) {
        return cartRepository.findByUser_Login(login);

    }
}
