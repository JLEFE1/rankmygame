package org.homegrown.service;

import org.homegrown.test.config.ServiceTestConfig;
import org.homegrown.test.listener.ServiceTestExecutionListener;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by JoLe on 05/05/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceTestConfig.class})
@TestExecutionListeners({ServiceTestExecutionListener.class})
public abstract class AbstractServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests{

    @PersistenceContext
    protected EntityManager em;

}
