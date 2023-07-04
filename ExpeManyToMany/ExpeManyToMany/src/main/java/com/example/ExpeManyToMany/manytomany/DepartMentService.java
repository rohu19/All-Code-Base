package com.example.ExpeManyToMany.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartMentService {

	@Autowired
	private DepartMentRepository departMentRepository;

	public DepartMent save(DepartMent departMent) {
		return departMentRepository.save(departMent);
	}

	public Iterable<DepartMent> list() {
		return departMentRepository.findAll();
	}
}
