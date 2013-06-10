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
	public void repositoryCreateEmployeeTest() {
		repository.createEmployee("Test");
		repository.createEmployee("Test2");
	}
	
	@Test
	public void repositoryEntityAutoIdTest() {
		repository.createEntityAutoId("Test");
		repository.createEntityAutoId("Test2");
	}
	
	@Test
	public void repositoryEntityTableId1() {
		repository.createEntityTableId1("Test");
		repository.createEntityTableId1("Test2");
	}
	
	@Test
	public void repositoryEntityTableId2() {
		repository.createEntityTableId2("Test");
		repository.createEntityTableId2("Test2");
	}
	
	@Test
	public void repositoryEntitySequenceId() {
		repository.createEntitySequence("Test");
		repository.createEntitySequence("Test2");
	}
	
	@Test
	public void repositoryEntityIdentity() {
		repository.createEntityIdentity("Test");
		repository.createEntityIdentity("Test2");
	}
}
