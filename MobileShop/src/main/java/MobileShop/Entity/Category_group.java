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
@Table(name = "category_groups")
public class Category_group {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long	id;
String	code;
String	name;
Long	level;
String	icon;
Boolean	activity;
Boolean	deleted;
Long	deleted_by;

@OneToMany(mappedBy = "group_id")
List<Category> categories;
}
