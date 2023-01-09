package gil.log.cloudclient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final TestValueConfiguration testValueConfiguration;

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(testValueConfiguration.toString());
    }
}
