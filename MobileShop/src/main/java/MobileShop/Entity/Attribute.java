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
@Table(name = "attributes")
public class Attribute {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long	id;

@ManyToOne
@JoinColumn(name = "attribute_group_id")
Attribute_group	attribute_group_id;

String	name;
String	description;
String	value;
Boolean	activity;
Boolean	deleted;
Long	deleted_by;

@OneToMany(mappedBy = "attribute_id")
List<Product_attribute> product_attribute;
}
