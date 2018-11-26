package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PoliceTest {
    @Test
    void check_if_driver_age_is_legal_to_drive(){
        Police police = new Police();
        assertFalse(police.checkDriverAge(new Driver(17)));
        assertTrue(police.checkDriverAge(new Driver(18)));
    }
}
