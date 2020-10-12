package com.rina.codechallenge;

import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomAddressController {

	@GetMapping("/randomizer/address")
	public Address address() {
		Locale locale = Randomizer.getLocale();
		return Randomizer.getAddress(locale);
	}
}
