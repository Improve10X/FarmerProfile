package com.improve10x.profile;

import junit.framework.TestCase;

public class ProfileControllerTest extends TestCase {

    public void testIsValidName() {
        ProfileController profileController = new ProfileController();
        assertEquals(true, profileController.isValidName("Sowmya"));
        assertEquals(false, profileController.isValidName("7676"));
        assertEquals(false, profileController.isValidName("@jhjh"));
        assertEquals(false, profileController.isValidName("Letters1234"));
        assertEquals(false, profileController.isValidName("లో"));
        assertEquals(true, profileController.isValidName("G Narayanamma"));
        assertEquals(false, profileController.isValidName(""));
    }
}