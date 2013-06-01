package org.malinowski;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EntityB {
	@Id
	@GeneratedValue
	int id;
	
	String name;
}
