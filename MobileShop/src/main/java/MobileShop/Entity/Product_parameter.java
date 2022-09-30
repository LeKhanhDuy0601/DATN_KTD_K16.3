package MobileShop.Entity;

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
@Table(name = "product_parameters")
public class Product_parameter {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;

@ManyToOne
@JoinColumn(name="product_id")
Product product_id;

@ManyToOne
@JoinColumn(name="product_variant_id")
Product_variant product_variant_id_2 ;

String name;
String decription;

@OneToMany(mappedBy = "product_parameter_id")
List<Product_parameter_detail> parameter_details;


}
