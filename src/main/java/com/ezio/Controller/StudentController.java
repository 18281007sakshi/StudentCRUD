package com.ezio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ezio.Entity.Student;
import com.ezio.Service.StudentSer;

@RestController
public class StudentController {
	@Autowired
	StudentSer ser;

	@PostMapping("/save-student")
	public String save(@RequestBody Student s) {
		System.out.println(s);
		ser.savestudent(s);
		return "Save";

	}

	@GetMapping("/get-student")
	public List<Student> getstudent() {
		return ser.get1();
	}

	@GetMapping("/Find-student/{id}")
	public Student find(@PathVariable("id") Long id) {
		return ser.Findid(id);

	}

	@DeleteMapping("/delete-student/{id}")
	public Student deletestud(@PathVariable("id") Long id) {
		return ser.deletes(id);
	}

	@PutMapping("/update-student")
	public String updatestudent(@RequestBody Student s) {
		ser.updatestudent1(s);
		return "updated";

	}

}
