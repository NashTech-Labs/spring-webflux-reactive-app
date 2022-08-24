package com.knoldus.springWebflux.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PersonControllerTest {
    /**
     * Method under test: {@link PersonController#findPersonsJson()}
     */
    @Test
    void testFindPersonsJson() {

        (new PersonController()).findPersonsJson();
    }

    /**
     * Method under test: {@link PersonController#findPersonsStream()}
     */
    @Test
    void testFindPersonsStream() {
        // TODO: Complete this test.

        (new PersonController()).findPersonsStream();
    }

    /**
     * Method under test: {@link PersonController#findPersonsStreamBackPressure()}
     */
    @Test
    void testFindPersonsStreamBackPressure() {
        // TODO: Complete this test.

        (new PersonController()).findPersonsStreamBackPressure();
    }

    /**
     * Method under test: {@link PersonController#findPersonsIntegration(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindPersonsIntegration() {
        // TODO: Complete this test.

        (new PersonController()).findPersonsIntegration("Param");
    }

    /**
     * Method under test: {@link PersonController#findPersonsIntegrationInDifferentPool(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindPersonsIntegrationInDifferentPool() {
        // TODO: Complete this test.

        (new PersonController()).findPersonsIntegrationInDifferentPool("Param");
    }
}

