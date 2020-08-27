package multi.profile.document;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MultiProfileDocumentExampleApplication {

	@Value("${creds.first}")
	String value;

	public static void main(String[] args) {
		SpringApplication.run(MultiProfileDocumentExampleApplication.class, args);
	}

	@GetMapping(value = "/greet")
	public String greet() {
		return value;
	}

}
