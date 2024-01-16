package edu.kiet.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @Autowired
	StudentInterface studentinf;
    @GetMapping("/students")
    public List<Student> getStudents(){
    	return studentinf.getStudents();
    }
    @GetMapping("/student/{sid}")
    public Optional<Student> getStudent(@PathVariable Long sid){
    	return studentinf.getStudent(sid);
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student s){
    	return studentinf.addStudent(s);
    }
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student s){
    	return studentinf.updateStudent(s);
    }
    @DeleteMapping("/students/{sid}")
    public Optional<Student> deleteStudent(@PathVariable Long sid){
    	return studentinf.deleteStudent(sid);
    }
}
