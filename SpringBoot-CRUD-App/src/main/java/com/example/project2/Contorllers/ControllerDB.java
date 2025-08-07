package com.example.project2.Contorllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.project2.EntityDB.EntityDB;
import com.example.project2.Services.ServiceDB;

@RequestMapping("/welcome")
@RestController
public class ControllerDB {
	@Autowired
	ServiceDB sd;
	
	@PostMapping("/post")
	public EntityDB method1(@RequestBody EntityDB ed) {
		return sd.methodservices1(ed);
	}
	
	@GetMapping("/gets")
	public List<EntityDB> method2(){
		return sd.methodservices2();
	}
	@GetMapping("/getid/{id}")
	public Optional<EntityDB> method3(@PathVariable(value="id")int ids){
		return sd.methodservices3(ids) ;
	}
	
	@PutMapping("/update/{data}")
	public EntityDB method4(@RequestBody EntityDB ed,@PathVariable(value="data")int id) {
		return sd.methodservices4(ed, id);
	}
	
	@DeleteMapping("/delete/{data}")
	public String method5(@PathVariable(value="data")int del) {
		return sd.methodservices5(del);
		
	}
	

}
