package org.homegrown.web.controller;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

import static org.junit.Assert.*;

/**
 * Created by JoLe on 04/05/15.
 */
public class HomeControllerTest extends AbstractControllerTest {

    @Test
    public void testPrintWelcome() throws Exception {

        HomeController homeController = new HomeController();

        ExtendedModelMap uiMap = new ExtendedModelMap();

        String result = homeController.printWelcome(uiMap);

        assertNotNull(result);
        assertEquals(result, "home");

    }

    @Test
    public void testDisclaimer() throws Exception {
        HomeController homeController = new HomeController();

        ExtendedModelMap uiMap = new ExtendedModelMap();

        String result = homeController.contact(uiMap);

        assertNotNull(result);
        assertEquals(result, "contact");
    }

    @Test
    public void testContact() throws Exception {
        HomeController homeController = new HomeController();

        ExtendedModelMap uiMap = new ExtendedModelMap();

        String result = homeController.disclaimer(uiMap);

        assertNotNull(result);
        assertEquals(result, "disclaimer");
    }
}