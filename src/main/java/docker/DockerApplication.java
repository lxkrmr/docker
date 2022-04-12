package docker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {

	@Value("${ENV_VARIABLE:aDefaultEnvVariable}")
	private String envVariable;

	@RequestMapping("/")
	public String home() {
		return """
				Hello Docker World,
				with env variable: %s
				""".formatted(envVariable);
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
