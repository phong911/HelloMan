package com.phung.citest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    public void should_return_HelloWorld_when_param_is_toto() {
        HelloController helloController = new HelloController();
        String result = helloController.index("toto");

        assertThat(result).isEqualTo("Hello toto !");

    }

}
