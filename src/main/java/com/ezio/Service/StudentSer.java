package com.ezio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezio.Entity.Student;
import com.ezio.Repository.StudentRep;

@Service
public class StudentSer {

	
	@Autowired  StudentRep rep;
	public void savestudent(Student s){
		rep.save(s);
	}
	public List<Student> get1(){
		return rep.findAll();
	}
	public Student Findid(Long id) {
		return rep.findById(id).get();
		
	}
    public Student deletes(Long id) {
    	rep.deleteById(id);
    	return null;
    }
    public void updatestudent1(Student s){
		rep.save(s);
	}
}
