package org.malinowski;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class Repository {
	
	@PersistenceContext(unitName="db1-unit")
	private EntityManager em;
	
	public void createEmployee(String name) {
		Employee entity = new Employee();
		entity.setName(name);
		em.persist(entity);
		System.out.println(entity.getId());
	}
	
	public void createEntityAutoId(String name) {
		EntityAutoID entity = new EntityAutoID();
		entity.setName(name);
		em.persist(entity);
		System.out.println(entity.getId());
	}
}
