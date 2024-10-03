package com.parents.parentsdemo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parents.parentsdemo.entity.ParentsEntity;
import com.parents.parentsdemo.repository.ParentsRepository;

@Service
public class ParentsService {
	
	@Autowired
	ParentsRepository parentsRepository;

	public void saves(ParentsEntity entity) {
		parentsRepository.save(entity);
		
		
	}

	public void saveall(List<ParentsEntity> entity) {
		parentsRepository.saveAll(entity);
		
	}

	public Optional<ParentsEntity> get(UUID id) {
		return parentsRepository.findById(id);
		
	}

	public List<ParentsEntity> getall() {
		return parentsRepository.findAll();
	}

	public ParentsEntity update(ParentsEntity parentsEntity) {
		Optional<ParentsEntity> optional =parentsRepository.findById(parentsEntity.getFamilyId());
		ParentsEntity parentsEntity2 =optional.get();
		parentsEntity2.setFatherName(parentsEntity.getFatherName());
		parentsEntity2.setMotherName(parentsEntity.getMotherName());
		return parentsRepository.save(parentsEntity2);
		
	}

	public void delete(UUID id) {
		parentsRepository.deleteById(id);
		
	}
	
	
	
}
