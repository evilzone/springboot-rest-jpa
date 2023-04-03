package com.springrest.springrest.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentResource {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> retrieveAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student retrieveAllStudents(@PathVariable long id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isEmpty()) {
            throw new StudentNotFoundException("id - " + id);
        }
        return student.get();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return new ResponseEntity<Student>(savedStudent, HttpStatus.OK);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isEmpty())
            return ResponseEntity.notFound().build();

        student.setId(id);
        studentRepository.save(student);
        return ResponseEntity.noContent().build();
    }

}
