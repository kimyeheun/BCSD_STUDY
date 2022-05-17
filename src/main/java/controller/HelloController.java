package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.LectureService;
import service.UserServiceImpl;

import java.sql.SQLException;

@Controller
public class HelloController {

    private final LectureService lectureService;
    private final UserServiceImpl userService;

    @Autowired
    public HelloController(LectureService lectureService, UserServiceImpl userService) {
        this.lectureService = lectureService;
        this.userService = userService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloBody() throws SQLException, ClassNotFoundException {
        lectureService.getLectures();
        return "hello";
    }
}