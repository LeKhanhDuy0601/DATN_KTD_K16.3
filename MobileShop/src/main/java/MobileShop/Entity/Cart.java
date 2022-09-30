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
@Table(name = "carts")
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long	id;

Long	account_id;
Long	session_id;
String	fullname;
String	phone;
String	email; 
String	address;
Long	city_id;
Long	district_id;

@OneToMany(mappedBy = "cart_id")
List<Cart_detail> details;

}
