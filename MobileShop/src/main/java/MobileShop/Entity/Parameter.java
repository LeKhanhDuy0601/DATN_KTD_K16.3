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
@Table(name = "parameters")
public class Parameter {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long	id;

@ManyToOne
@JoinColumn(name="parameter_group_id")
Parameter_group	parameter_group_id;

String	name ;
Long	level; 
String	decription;
Boolean	activity;
Boolean	deleted;
Long	deleted_by;

@OneToMany(mappedBy = "product_parameter_id")
List<Product_parameter_detail> parameter_details;


}
