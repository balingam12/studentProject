package studentProject;

import java.util.ArrayList;
import java.util.List;


public class StudentImplementation implements StudentService{

	List<Student> listStudent= new ArrayList<Student>();
	@Override
	public void addStudent(Student s) {
		listStudent.add(s);
		
		
	}

	@Override
	public void deleteStudent(int id) {
		listStudent.remove(id=1);
		
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		Student fs=null;
		for(Student s: listStudent)
		{ 
			if(s.getSid()==id) {
				fs=s;
			}
		}
		return fs;
	}

	@Override
	public ArrayList<Student> getStudents() {
		// TODO Auto-generated method stub
		ArrayList<Student> slist=(ArrayList<Student>) listStudent;
		return slist;
	}

	@Override
	public void updateName(int id, String newName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countStudents() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	


}
