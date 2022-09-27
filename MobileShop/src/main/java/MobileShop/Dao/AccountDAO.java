package MobileShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MobileShop.Entity.Account;

public interface AccountDAO extends JpaRepository<Account,Integer> {

}
