package com.example.prog4td1p1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassSingletonTest {
    @Test
    void can_get_description () {
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        Assertions.assertEquals(classSingleton1.getDescription(), "Initial description class");
    }
    @Test
    void can_set_description () {
        String new_description = "New description class";
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        classSingleton1.setDescription(new_description);
        Assertions.assertEquals(classSingleton1.getDescription(), new_description);
    }
}
