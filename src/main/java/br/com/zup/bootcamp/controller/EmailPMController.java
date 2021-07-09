package br.com.zup.bootcamp.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailPMController {

	
	@Profile("dev")
	@GetMapping("/beagle")
	public void envioDeEmailsBrincadeira()
	{
		System.out.println("Email");
	}
	
	@Profile("prod")
	@GetMapping("/ot")
	public void envioDeEmailsSerio()
	{
		System.out.println("Os emails foram enviados");
	}
}
