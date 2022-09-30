package MobileShop.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MobileShop.Entity.Authority;
import MobileShop.service.AuthorityService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/authorites")
public class AuthorityRestController {
	@Autowired
	AuthorityService authorityService;
	
	@GetMapping()
	public List<Authority> findAll() {
		return authorityService.findAll();
	}
}
