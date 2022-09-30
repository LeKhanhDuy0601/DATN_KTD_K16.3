package MobileShop.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import MobileShop.Dao.AccountDAO;
import MobileShop.Entity.Account;
import MobileShop.Message.ResponseMessageAccount;
import MobileShop.Message.ResponseMessageError;
import MobileShop.Validation.AccountCreateValidation;
import MobileShop.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDAO accountDAO;

	@Override
	public ResponseEntity<?> create(@Valid AccountCreateValidation accountCreateValidation) {
		if (accountDAO.existsByUsername(accountCreateValidation.getUsername())) {
			return ResponseEntity.badRequest()
					.body(new ResponseMessageError("Tên đăng nhập đã được sử dụng!", "username"));
		}
		if (accountDAO.existsByPhone(accountCreateValidation.getPhone())) {
			return ResponseEntity.badRequest()
					.body(new ResponseMessageError("Số điện thoại đã được sử dụng!", "phone"));
		}
		if (accountDAO.existsByEmail(accountCreateValidation.getEmail())) {
			return ResponseEntity.badRequest().body(new ResponseMessageError("Email đã được sử dụng!", "email"));
		}
		if (!accountCreateValidation.getPassword().equals(accountCreateValidation.getConfirm_password())) {
			return ResponseEntity.badRequest()
					.body(new ResponseMessageError("Xác nhận mật khẩu không chính xác!", "confirm_password"));
		}
		Account account = new Account(accountCreateValidation.getUsername(), accountCreateValidation.getFullname(),
				accountCreateValidation.getPassword(), accountCreateValidation.getPhone(),
				accountCreateValidation.getEmail(), accountCreateValidation.getBirthday(),
				accountCreateValidation.getGender(), accountCreateValidation.getAddress(), true,
				accountCreateValidation.getAvatar(), false, accountCreateValidation.getCity(),
				accountCreateValidation.getDistrict(), accountCreateValidation.getWard(),
				accountCreateValidation.getRoles());
		accountDAO.save(account);
		return ResponseEntity.ok(new ResponseMessageAccount("Tài khoản đã đăng ký thành công!", account));
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountDAO.findAll();
	}
}
