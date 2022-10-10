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
@Table(name = "product_attributes")
public class Product_attribute {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;

@ManyToOne
@JoinColumn(name = "product_variant_id")
Product_variant product_variant; 

@ManyToOne
@JoinColumn(name = "attribute_id")
Attribute attribute;

Integer level;
}
