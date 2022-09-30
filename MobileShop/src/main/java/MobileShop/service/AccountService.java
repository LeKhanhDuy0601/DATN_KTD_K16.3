package MobileShop.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import MobileShop.Entity.Account;
import MobileShop.Validation.AccountCreateValidation;

public interface AccountService {

	ResponseEntity<?> create(@Valid AccountCreateValidation accountCreateValidation);

	List<Account> findAll();

}
