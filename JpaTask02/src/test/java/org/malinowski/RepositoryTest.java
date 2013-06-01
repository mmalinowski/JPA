package org.malinowski;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/appContext.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
public class RepositoryTest {
	
	@Autowired
	private Repository repository;
	
	@Test
	public void createATest() {
		repository.createA("Test");
		repository.createA("Test2");
	}
	
	@Test
	public void createBTest() {
		repository.createB("Test");
		repository.createB("Test2");
	}
	
	@Test
	public void createCTest() {
		repository.createC("Test", 123);
		repository.createC("Test2", 124);
	}
	
	@Test
	public void createEmployeeTest() {
		repository.createEmployee("6431234567");
		repository.createEmployee("1234567");
	}
}
