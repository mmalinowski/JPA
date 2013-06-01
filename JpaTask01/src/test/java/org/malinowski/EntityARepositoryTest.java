package org.malinowski;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/appContext.xml"})
@TransactionConfiguration(transactionManager="txManager1", defaultRollback=false)
@Transactional
public class EntityARepositoryTest {
	
	@Autowired
	private EntityARepository repository;
	
	@Test
	public void repositoryCreateTest() {
		repository.create("Test");
		repository.create("Test2");
	}
}
