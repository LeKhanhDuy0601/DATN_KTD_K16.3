package MobileShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MobileShop.Entity.Verification;

public interface VerificationDAO extends JpaRepository<Verification, Integer>{

}