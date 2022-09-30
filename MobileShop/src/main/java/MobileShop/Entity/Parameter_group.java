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
@Table(name = "parameter_groups")
public class Parameter_group {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long	id;
String	name ;
Long	level;
String	decription;
Boolean activity;
Boolean	deleted;
Long	deleted_by;

@OneToMany(mappedBy = "parameter_group_id")
List<Parameter> parameter;
}
