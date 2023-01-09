package gil.log.cloudclient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Setter
@Getter
@ConfigurationProperties("test.value")
@RefreshScope
@ToString
public class TestValueConfiguration {
    private String gil;
    private String log;
}
