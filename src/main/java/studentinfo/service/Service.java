package studentinfo.service;

import java.util.List;

import studentinfo.entity.Student;

public interface Service {
	public boolean checkLogin(String user, String pass);

	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudent(Integer id);

}
