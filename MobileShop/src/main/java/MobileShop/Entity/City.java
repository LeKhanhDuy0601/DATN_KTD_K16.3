package MobileShop.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String code;
	String name;
	String type;
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	List<Account> accounts;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	List<District> districts ;
	
}
