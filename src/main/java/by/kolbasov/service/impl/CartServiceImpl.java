package by.kolbasov.service.impl;

import by.kolbasov.Status;
import by.kolbasov.dto.CartDto;
import by.kolbasov.entity.Camera;
import by.kolbasov.entity.Cart;
import by.kolbasov.entity.Intercom;
import by.kolbasov.entity.Registrator;
import by.kolbasov.mapper.CartMapper;
import by.kolbasov.repository.*;
import by.kolbasov.service.*;
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
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> findByUserId(String login) {
        return cartRepository.findAllByUser_Login(login);
    }

    @Override
    public void deleteCamera(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        List<Camera> cameras = cart.getCamera();
        cameras.remove(camRepository.findById(id).orElseThrow());
        cart.setCamera(cameras);
        cartRepository.save(cart);
    }

    @Override
    public void deleteIntercom(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        List<Intercom> intercoms = cart.getIntercom();
        intercoms.remove(intercomRepository.findById(id).orElseThrow());
        cart.setIntercom(intercoms);
        cartRepository.save(cart);
    }

    @Override
    public void deleteRegistrator(Long id, String login) {
        Cart cart = cartRepository.findByUser_Login(login);
        List<Registrator> registrators = cart.getRegistrator();
        registrators.remove(registratorRepository.findById(id).orElseThrow());
        cart.setRegistrator(registrators);
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
            cart.setUser(userRepository.findByLogin(login));
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
            cart.setUser(userRepository.findByLogin(login));
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
            cart.setUser(userRepository.findByLogin(login));
        } else {
            cart.getIntercom().add(intercomRepository.findById(id).orElseThrow());
        }
        cartRepository.save(cart);
    }

    @Override
    public CartDto findCartByUserId(String login) {

        return cartMapper.cartToCartDto(cartRepository.findByUser_Login(login));

    }

    @Override
    public void setOrder(Long id) {
       Cart cart = cartRepository.findById(id).orElseThrow();
       cart.setStatus(Status.ORDER);
       cartRepository.save(cart);
    }

    @Override
    public List<CartDto> findByStatus(Status status) {
        return cartMapper.cartListToCartListDto(cartRepository.findAllByStatus(status));
    }

}
