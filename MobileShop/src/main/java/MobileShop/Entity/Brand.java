package MobileShop.Entity;


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
@Table(name = "brands")
public class Brand {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
Long cart_id;
Long product_id;
Long product_variant_id;
Long qty;
Long price;
Long total;

@OneToMany(mappedBy = "brand_id")
List<Product> products;
}
