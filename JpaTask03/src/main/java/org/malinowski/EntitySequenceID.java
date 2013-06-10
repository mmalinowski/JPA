package org.malinowski;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class EntitySequenceID {
	@Id
	@SequenceGenerator(name="ID_Gen", sequenceName="test_seq", allocationSize=1, initialValue=10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ID_Gen")
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
