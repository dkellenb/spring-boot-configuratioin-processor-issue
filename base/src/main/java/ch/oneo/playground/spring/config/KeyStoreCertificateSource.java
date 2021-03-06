package ch.oneo.playground.spring.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = true)
@Validated
public class KeyStoreCertificateSource extends CertificateSource {

    @NotBlank
    public String keystore;
    @NotBlank
    public String alias;

}
