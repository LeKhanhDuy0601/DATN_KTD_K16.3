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
Long	id;
String	code;
String	name;

@ManyToOne
@JoinColumn(name="group_id")
Category_group	group_id;

Long	level;
Boolean	view;
Boolean	activity;
Boolean	deleted;
Long	deleted_by;
}
