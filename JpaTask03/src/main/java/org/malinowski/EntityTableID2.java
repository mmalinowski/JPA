package org.malinowski;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class EntityTableID2 {
	@Id
	@TableGenerator(name="IDs_Generator", table="IDs_Table", pkColumnValue="IDs", pkColumnName="ID_Name", valueColumnName="ID_Value")
	@GeneratedValue(strategy = GenerationType.TABLE, generator="IDs_Generator")
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
