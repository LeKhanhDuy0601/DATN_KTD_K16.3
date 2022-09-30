package MobileShop.Dao;

import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;

import MobileShop.Entity.Account;

public interface AccountDAO extends JpaRepository<Account, Integer> {

	boolean existsByUsername(String username);

	boolean existsByPhone(String phone);

	boolean existsByEmail(String email);

}
