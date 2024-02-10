package service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "service.implementations" })
@Configuration // spring
public class ServiceConfig {

}
