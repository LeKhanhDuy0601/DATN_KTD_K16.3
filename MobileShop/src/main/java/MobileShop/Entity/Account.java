package MobileShop.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import MobileShop.Common.EGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String username;
	String fullname;
	String password;
	String phone;
	String email;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	EGender gender;
	String birthday;
	String address;
	String avatar;
	Boolean deleted;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Authority> authorities;
	
	@ManyToOne 
	@JoinColumn(name = "city_id")
	City city;
	
	@ManyToOne 
	@JoinColumn(name = "district_id")
	District district;
	
	@ManyToOne
	@JoinColumn(name = "ward_id")
	Ward ward;
	
	
}
