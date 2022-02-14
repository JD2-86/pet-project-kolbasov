package controllers;

import dao.CamerasDaoImpl;
import dao.inreface.CamerasDao;
import entity.Cameras;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/cameras/*")
public class CamDetailsServlet extends HttpServlet {
    private CamerasDao camerasDao = CamerasDaoImpl.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer pathinfo =Integer.parseInt(req.getPathInfo().replaceAll("/", ""));
        pathinfo--;
        req.setAttribute("index",pathinfo);
        List<Cameras> cam = camerasDao.findAll();
        req.setAttribute("cam", cam);
        getServletContext().getRequestDispatcher("/camera_details.jsp").forward(req, resp);

    }
}
