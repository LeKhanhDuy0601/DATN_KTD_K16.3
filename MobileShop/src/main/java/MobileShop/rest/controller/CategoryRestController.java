package MobileShop.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MobileShop.Entity.Category;
import MobileShop.Validation.CategoryCreateValidation;
import MobileShop.Validation.CategoryUpdateValidation;
import MobileShop.service.CategoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categories")
public class CategoryRestController {
@Autowired
CategoryService categoryService;
@GetMapping()
public List<Category> findAllCategory(){
	return categoryService.findAllCategory();
}
@PostMapping()
public ResponseEntity<?> createCategory(@RequestBody @Valid CategoryCreateValidation categoryCreateValidation){
	return categoryService.createCategory(categoryCreateValidation);
}
@PutMapping()
public ResponseEntity<?> updateCategory(@RequestBody @Valid CategoryUpdateValidation categoryUpdateValidation){
	return categoryService.updateCategory(categoryUpdateValidation);
}
}
