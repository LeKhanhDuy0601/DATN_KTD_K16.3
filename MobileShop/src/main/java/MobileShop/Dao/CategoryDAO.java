package MobileShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MobileShop.Entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Long>{

}
