package com.sudreeshya.day27.service.impl;

import com.sudreeshya.day27.builder.ResponseBuilder;
import com.sudreeshya.day27.controller.model.Student;
import com.sudreeshya.day27.dto.GenericResponse;
import com.sudreeshya.day27.repository.StudentRepository;
import com.sudreeshya.day27.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }

    @Override
    public GenericResponse getAllStudents() {
        final List<Student> students = studentRepository.findAll();

        if (students.isEmpty()) {
            return ResponseBuilder.buildFailure("Students not found");
        }

        return ResponseBuilder.buildSuccess("Students not found", students);
    }


}
