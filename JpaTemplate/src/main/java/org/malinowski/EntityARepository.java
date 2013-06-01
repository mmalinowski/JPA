package org.malinowski;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class EntityARepository {
	
	@PersistenceContext(unitName="db1-unit")
	private EntityManager em;
	
	public void create(String name) {
		EntityA entity = new EntityA();
		entity.setName(name);
		em.persist(entity);
		em.flush();
		System.out.println(entity.getId());
	}
}
