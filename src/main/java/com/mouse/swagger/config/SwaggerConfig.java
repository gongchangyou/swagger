package com.mouse.swagger.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author
 */
@Configuration
@Profile({"dev","local"})
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {
}