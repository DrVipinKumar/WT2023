package edu.kiet.student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface {
	public List<Student> getStudents();
	public Student addStudent(Student s);
	public Student updateStudent(Student s);
	public Optional<Student> deleteStudent(Long sid);
	public Optional<Student> getStudent(Long sid);
}
