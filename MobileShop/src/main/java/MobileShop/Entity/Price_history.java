package MobileShop.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "price_histories")
public class Price_history {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
Long product_id; 
Long product_variant_id;
Long price_old;
Long price;
Date created_at;
Long created_by;
}
