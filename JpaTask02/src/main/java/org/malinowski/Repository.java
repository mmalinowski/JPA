package org.malinowski;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public class Repository {
	
	@PersistenceContext(unitName="db1-unit")
	private EntityManager em;
	
	public void createA(String name) {
		EntityA entity = new EntityA();
		entity.setName(name);
		em.persist(entity);
		System.out.println(entity.getId());
	}
	
	public void createB(String name) {
		EntityB entity = new EntityB();
		entity.name = name;
		em.persist(entity);
		System.out.println(entity.id);
	}
	
	public void createC(String name, int salary) {
		EntityC entity = new EntityC();
		entity.setName(name);
		entity.setSalary(salary);
		em.persist(entity);
		System.out.println(entity.getId());
	}
	
	public void createEmployee(String phoneNumber) {
		Employee entity = new Employee();
		entity.setPhoneNumber(phoneNumber);
		em.persist(entity);
		System.out.println(entity.getId());
	}
}
