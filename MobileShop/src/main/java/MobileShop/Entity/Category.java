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
@Table(name = "categories")
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer	id;
String	code;
String	name;

@ManyToOne
@JoinColumn(name="group_id")
CategoryGroup	categoryGroup;

Integer	level;
Boolean	view;
Boolean	activity;
Boolean	deleted;
Integer	deleted_by;
public Category(String code, String name,Integer level, Boolean view, Boolean activity,Boolean deleted,
		CategoryGroup categoryGroup) {
	super();
	this.code = code;
	this.name = name;
	this.level = level;
	this.view = view;
	this.activity = activity;
	this.deleted = deleted;
	this.categoryGroup = categoryGroup;
}

}
