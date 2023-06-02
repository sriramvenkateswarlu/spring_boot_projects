package com.example.demo.restController;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.Country;

@RestController
public class CountryRestController {

	private HashOperations<String, Integer, Country> opsForHash = null;

	// constructor injection 
	public CountryRestController(RedisTemplate<String, Country> rt) {

		this.opsForHash = rt.opsForHash();

	}

	@PostMapping("/country")
	public String addContry(@RequestBody Country country) {

		opsForHash.put("COUNTRIES", country.getSno(), country);

		return "country addedd";

	}

	@GetMapping("/countries")
	public Collection<Country> getContry() {

		Map<Integer, Country> entries = opsForHash.entries("COUNTRIES");

		Collection<Country> values = entries.values();

		return values;

	}

	@GetMapping("/delete/{id}")
	public String deleteContry(@PathVariable Integer id) {

		Long delete = opsForHash.delete("COUNTRIES", id);

		return "country deleted";

	}
}
