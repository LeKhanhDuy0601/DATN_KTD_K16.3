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
@Table(name = "verifications")
public class Verification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String password;
	String code;
	String Expiry;
	Integer Type;
	boolean activity;

	@ManyToOne
	@JoinColumn(name = "account_id")
	Account account;
}
