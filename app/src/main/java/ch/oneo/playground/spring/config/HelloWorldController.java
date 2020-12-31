package ch.oneo.playground.spring.config;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloWorldController {

    private final SampleConfiguration sampleConfiguration;

    @GetMapping
    private Mono<String> getConfig() {
        return Mono.just(sampleConfiguration.getMessage() + ": " + sampleConfiguration.getCertificate().toString());
    }

}
