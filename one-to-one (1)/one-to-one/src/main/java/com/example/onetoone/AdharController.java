package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("adhar")
public class AdharController {
	@Autowired
	private AdharCardRepository adharCardRepository;

	@PostMapping
	public AdharCard save(@RequestBody AdharCard adharCard) {
		return adharCardRepository.save(adharCard);
	}
}