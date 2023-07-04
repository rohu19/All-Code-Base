package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServices {
	@Autowired
	private SkillRepository skillRepository;

	public Skill save(Skill skill) {

		return skillRepository.save(skill);
	}

	public Iterable<Skill> list() {
		return skillRepository.findAll();
	}
}
