package MobileShop.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_variants")
public class Product_variant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String name;
Long price; 
Long qty; 
Long weight;
String	weight_unit;
Long height;
String	height_unit; 
Long	width; 
String	width_unit;
Long	sold_count;
String	image;
Long	product_id;
Boolean	activity;
Date create_date;
Long	created_by; 
Boolean	deleted;
Double	deleted_by;

@OneToMany(mappedBy = "product_variant_id")
List<Cart_detail> details;

@OneToMany(mappedBy = "product_variant_id_1")
List<Product_attribute> product_attributes;

@OneToMany(mappedBy = "product_variant_id_2")
List<Product_parameter> Product_parameter;

}
