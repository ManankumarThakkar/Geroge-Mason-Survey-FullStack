/*
 * Name: Yaksh Shah
 * JPA repository in which the database properties are implemented
 */

package com.springboot.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	void deleteStudentById(Long id);

    Optional<Student> findStudentById(Long id);

}
