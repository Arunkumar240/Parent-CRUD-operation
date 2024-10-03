package com.parents.parentsdemo.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parents.parentsdemo.entity.ParentsEntity;
import com.parents.parentsdemo.service.ParentsService;

@RestController
@RequestMapping("/api/parents")
public class ParentsController {
	@Autowired
	ParentsService parentsService;
	
	@PostMapping("/post")
	public String save (@RequestBody ParentsEntity entity) {
		parentsService.saves(entity);
		return "success";
		
	}
		
	@PostMapping("/postall") 
	public String saveAll (@RequestBody List< ParentsEntity> entity) {
		parentsService.saveall(entity);
		return "success";
	}
	
	@GetMapping("/get")
	public Optional<ParentsEntity> get(@RequestParam UUID id) {
		return parentsService.get(id);
	}
	
	@GetMapping("/getall")
	public List<ParentsEntity>getall(){
		return parentsService.getall();
	}
	
	@PutMapping("/update")
	public ParentsEntity update(@RequestBody ParentsEntity parentsEntity) {
		return parentsService.update(parentsEntity);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam UUID id) {
		parentsService.delete(id);
		return "successfully deleteted";
	}
}




