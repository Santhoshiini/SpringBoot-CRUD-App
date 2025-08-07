package com.example.project2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.project2.EntityDB.EntityDB;
import com.example.project2.Repositorys.RepoDB;

@Service
public class ServiceDB {
	
	@Autowired
	RepoDB rd;
	
	public EntityDB methodservices1(EntityDB ed) {
		return this.rd.save(ed);
	}
	
	public List<EntityDB> methodservices2(){
		return rd.findAll();
	}
	
	public Optional<EntityDB> methodservices3(int id){
		return rd.findById(id);
	}
	
	public EntityDB methodservices4(EntityDB newData,Integer id) {
		EntityDB oldData= rd.findById(id).orElseThrow(()-> new NullPointerException("No ID is Found"));
		oldData.setName(newData.getName());
		oldData.setB_name(newData.getB_name());
		oldData.setSweet(newData.getSweet());
		oldData.setSavory(newData.getSavory());
		oldData.setB_no(newData.getB_no());
		return rd.save(oldData);
		
	}
	
	public String methodservices5(int id) {
		if(rd.existsById(id)) {
			return "Deleted Successfully";
		}
		else {
			return "Id is not Found";
		}
	}

}
