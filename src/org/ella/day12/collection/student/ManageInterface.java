package org.ella.day12.collection.student;

import java.util.List;

public interface ManageInterface {

	void registerStudent(Student student);
	
	List<Student> searchOneByName(String name);
	
	List<Student> selectAllStudents();
	
	void modifyStudent(int index, Student student);
	
	void deleteStudent(int index);
}
