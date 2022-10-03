package MobileShop.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import MobileShop.Entity.Category;
import MobileShop.Validation.CategoryCreateValidation;
import MobileShop.Validation.CategoryUpdateValidation;

public interface CategoryService {

	List<Category> findAllCategory();

	ResponseEntity<?> createCategory(@Valid CategoryCreateValidation categoryCreateValidation);

	ResponseEntity<?> updateCategory(@Valid CategoryUpdateValidation categoryUpdateValidation);

}
