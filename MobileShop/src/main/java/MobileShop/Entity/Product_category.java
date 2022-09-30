package MobileShop.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_categories")
public class Product_category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;

@ManyToOne
@JoinColumn(name="product_id")
Product product_id_2 ;

@ManyToOne
@JoinColumn(name="category_id")
Category category_id ;
}
