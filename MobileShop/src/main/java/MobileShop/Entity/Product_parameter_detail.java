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
@Table(name = "product_parameter_details")
public class Product_parameter_detail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long bigint; 

@ManyToOne
@JoinColumn(name="product_parameter_id")
Product_parameter product_parameter_id;

@ManyToOne
@JoinColumn(name="parameter_id")
Parameter parameter_id; 


String value;
}
