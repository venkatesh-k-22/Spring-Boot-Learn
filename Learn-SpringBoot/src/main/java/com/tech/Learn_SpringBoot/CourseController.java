package com.tech.Learn_SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// For RESTFUL API's
@RestController
public class CourseController {
    // /course uri
    // id, name, author

    @RequestMapping("/courses")
    public List<Course> getCourses(){

        return Arrays.asList(
                new Course(1, "JAVA", "Sun Micro"),
                new Course(2, "Python", "Guido")
        );
    }
}
