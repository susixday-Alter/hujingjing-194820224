package com.example.sixday002.controllrt;
import com.example.sixday002.domain.Student;
import com.example.sixday002.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private StudentService StudentService;

    @GetMapping
    public List<Student> hello(){
        return StudentService.selectAllStudents();
    }

    @GetMapping("/hello2")
    public List<Student> hello2(){
        return StudentService.selectNamefromStudent();
    }

    @GetMapping("/*")
    public String error(){
        return "404";
    }

}
