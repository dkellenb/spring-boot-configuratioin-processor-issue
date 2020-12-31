package ch.oneo.playground.spring.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("app.config")
public class SampleConfiguration {

    private FileBasedSource certificate;

    private String message;

}
