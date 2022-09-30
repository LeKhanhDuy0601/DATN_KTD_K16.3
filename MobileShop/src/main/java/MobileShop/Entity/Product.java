package MobileShop.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String code;
	String name;
	String slug;
	Long qty;
	Long price;
	String type;
	String short_description;
	String description;
	String size_chart;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	Brand brand_id;
	
	@ManyToOne
	@JoinColumn(name="unit_id")
	Unit unit_id;
	
	
	Long weight;
	String weight_unit;
	String height;
	String height_unit;
	Long width;
	String width_unit;
	Long sold_count;
	Long warranty_period;
	Boolean activity;
	Long created_by;
	Date created_date;
	Boolean deleted;
	Long deleted_by;
	
	@OneToMany(mappedBy = "product_id")
	List<Cart_detail> details;
	
	@OneToMany(mappedBy = "product_id_1")
	List<Product_image> images;
	
	@OneToMany(mappedBy = "product_id_2")
	List<Product_category> categories;
	
}
