package studentProject;

import java.util.ArrayList;

public interface StudentService {
	void addStudent(Student s);      
    void deleteStudent(int id);     
    Student findStudent(int id);     
    ArrayList<Student> getStudents();
    void updateName(int id, String newName); 
    int countStudents();
}
