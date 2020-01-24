package com.aquicard.src.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aquicard.src.Entities.Time;

@RestController
public class TimeController {

	@GetMapping("/time/{id}")
	public String Get(@PathVariable(value = "id") int id) {
		return Time.getTime(id);
	}
}
