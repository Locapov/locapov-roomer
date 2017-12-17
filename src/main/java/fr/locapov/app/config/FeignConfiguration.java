package fr.locapov.app.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "fr.locapov.app")
public class FeignConfiguration {

}
