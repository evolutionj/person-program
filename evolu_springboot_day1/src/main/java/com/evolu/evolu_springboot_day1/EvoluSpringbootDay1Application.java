package com.evolu.evolu_springboot_day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author guoqi7
 */
@SpringBootApplication
public class EvoluSpringbootDay1Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(EvoluSpringbootDay1Application.class);

    public static void main(String[] args) {
        LOGGER.error("aaaaaaaaaaaa");
        LOGGER.warn("bbbbbbbbbbb");
        LOGGER.trace("cccccccccccc");
        SpringApplication.run(EvoluSpringbootDay1Application.class, args);
    }

}
