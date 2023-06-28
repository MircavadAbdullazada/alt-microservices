package az.atl.msuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsUserApplication {
	@GetMapping("/user")
	public String sayHello(){
		return "Hello User";
	}
	public static void main(String[] args) {
		SpringApplication.run(MsUserApplication.class, args);
	}

}
