package org.homegrown.web.controller;

import org.homegrown.test.config.ControllerTestConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by JoLe on 04/05/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ControllerTestConfig.class})
@ActiveProfiles("test")
public class AbstractControllerTest {
}
