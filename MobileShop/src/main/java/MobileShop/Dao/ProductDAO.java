package MobileShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MobileShop.Entity.Product;


public interface ProductDAO extends JpaRepository<Product, Long>{

}
