package com.example.prog4td1p1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnumSingletonTest {
    @Test
    void can_get_description () {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        Assertions.assertEquals(enumSingleton1.getClick(), 1);
    }
    @Test
    void can_set_description () {
        int new_click = 2;
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton1.setClick(new_click);
        Assertions.assertEquals(enumSingleton1.getClick(), new_click);
    }
}
