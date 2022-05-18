/*
 * Name: Gopan Doshi
 * This is the student resource page, which contains restful services for retrieving and saving student data.
 */

package com.springboot.backend.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springboot.backend.model.Student;
import com.springboot.backend.service.AppService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResource {
	private final AppService appService;

    public StudentResource(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents () {
        List<Student> students = appService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Student> getStudentById (@PathVariable("id") Long id) {
        Student student = appService.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = appService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updateStudent = appService.updateStudent(student);
        return new ResponseEntity<>(updateStudent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id) {
        appService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
