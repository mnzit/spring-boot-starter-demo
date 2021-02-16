package com.sudreeshya.day27.repository;

import com.sudreeshya.day27.controller.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
