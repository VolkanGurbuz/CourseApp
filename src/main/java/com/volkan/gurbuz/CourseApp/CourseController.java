package com.volkan.gurbuz.CourseApp;

import com.volkan.gurbuz.CourseApp.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getCourses(){

        return Arrays.asList(new Course("100", "Data Structures" , " Arjan"),
        new Course("101", "Object Oriented and Programming", "Baris"),
        new Course("102", "Software Construction", "Korhan"));

    }


}
