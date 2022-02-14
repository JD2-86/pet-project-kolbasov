
import dao.CamerasDaoImpl;

import dao.inreface.CamerasDao;
import entity.Cameras;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PerimeterApplicatiion {
    private static CamerasDao camerasDao = CamerasDaoImpl.getInstance();

    public static void main(String[] args) {
        //  Cameras cameras =new Cameras(1L,160,"Hikvision","https://images.by.prom.st/131956947_w640_h640_videokamera-hikvision-ds-2cd2042wd-i.jpg","123","123","123","123");

        //  CamerasDaoImpl em_cam =new CamerasDaoImpl();
//        Image image =new Image(1L,"https://avant.by/upload/iblock/715/00_00009254.jpg");
//        ImageDaoImpl em_img =new ImageDaoImpl();
//        em_img.save(image);
//        cameras.setImage(image);
        //  em_cam.save(cameras);


//        CamerasDaoImpl camerasDao =new CamerasDaoImpl();
//        List<Cameras> cameras =camerasDao.findAll();
//        List<String> cam_names = cameras.stream().map(Cameras::cam_name).collect((toList()));
//        cam_names.forEach(System.out::println);


    }
}
