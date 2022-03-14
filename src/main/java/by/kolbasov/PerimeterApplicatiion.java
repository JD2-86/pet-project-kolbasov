package by.kolbasov;

import by.kolbasov.config.RootConfig;
import by.kolbasov.config.WebConfig;
import by.kolbasov.dao.CamerasDaoImpl;

import by.kolbasov.dao.UserDaoIml;
import by.kolbasov.dao.inreface.CamerasDao;
import by.kolbasov.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PerimeterApplicatiion extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
