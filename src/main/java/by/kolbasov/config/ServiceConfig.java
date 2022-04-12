package by.kolbasov.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"by.kolbasov.service.impl", "by.kolbasov.mapper"})
@EnableTransactionManagement
@Import(RootConfig.class)
public class ServiceConfig {
}
