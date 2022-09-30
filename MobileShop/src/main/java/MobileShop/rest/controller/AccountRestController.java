package MobileShop.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MobileShop.Entity.Account;
import MobileShop.Validation.AccountCreateValidation;
import MobileShop.service.AccountService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/account")
public class AccountRestController {
	@Autowired
	AccountService accountService;

	@PostMapping()
	public ResponseEntity<?> createAccount(@RequestBody @Valid AccountCreateValidation accountCreateValidation) {
		return accountService.create(accountCreateValidation);
	}
	
	@GetMapping()
	public List<Account> findAll() {
		return accountService.findAll();
	}
	
}
