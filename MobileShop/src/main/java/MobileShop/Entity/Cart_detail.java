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
@Table(name = "cart_details")
public class Cart_detail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id; 

@ManyToOne
@JoinColumn(name = "cart_id")
Cart cart_id;

@ManyToOne
@JoinColumn(name = "product_id")
Product product_id;

@ManyToOne
@JoinColumn(name = "product_variant_id")
Product_variant product_variant_id;

Long qty;
Long price;
Long total;
}
