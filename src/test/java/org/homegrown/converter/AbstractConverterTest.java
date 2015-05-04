package org.homegrown.converter;

import org.homegrown.test.config.ConverterTestConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by JoLe on 04/05/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConverterTestConfig.class})
@ActiveProfiles("test")
public class AbstractConverterTest {
}
