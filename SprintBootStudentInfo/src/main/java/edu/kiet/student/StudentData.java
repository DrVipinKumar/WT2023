package edu.kiet.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentData implements StudentInterface {

	@Autowired
	StudentDAO student;
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return student.findAll();
	}
	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		student.save(s);
		return s;
	}
	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		student.save(s);
		return s;
	}
	@Override
	public Optional<Student> deleteStudent(Long sid) {
		// TODO Auto-generated method stub
		Optional<Student> s=student.findById(sid);
		student.deleteById(sid);
		return s;
	}
	@Override
	public Optional<Student> getStudent(Long sid) {
		// TODO Auto-generated method stub
		Optional<Student> s=student.findById(sid);
		return s;
	}

}
