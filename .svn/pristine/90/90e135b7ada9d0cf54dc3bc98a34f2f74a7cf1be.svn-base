package com.example.sixday002.service.impl;

import com.example.sixday002.domain.Student;
import com.example.sixday002.mapper.StudentMapper;
import com.example.sixday002.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper StudentMapper;

    public List<Student> selectAllStudents() {
        return StudentMapper.selectAllStudents();
    }
    public List<Student> selectNamefromStudent(){
        return StudentMapper.selectNamefromStudent();
    }
}
