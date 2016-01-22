package com.btisystems.pronx.ems.model;

import org.junit.Before;
import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.CoreMatchers.allOf;
import static org.junit.Assert.*;

public class DeviceGroupTest {
    @Before
    public void setUp() {
    }

    @Test
    public void shouldContainBeanMethods() {
        assertThat(DeviceGroup.class,
                allOf(
                        hasValidGettersAndSetters()
                )
        );
    }
}