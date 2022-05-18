/*
 * Name: Srujitha Reddy Mekala
 * This the app service file 
 */

package com.springboot.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.exception.UserNotFoundException;
import com.springboot.backend.model.Student;
import com.springboot.backend.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class AppService {
	private final StudentRepository studentRepository;

    @Autowired
    public AppService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepository.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id)
                .orElseThrow(() -> new UserNotFoundException("User" + id + " was not found"));
    }

    public void deleteStudent(Long id){
    	studentRepository.deleteStudentById(id);
    }

}
