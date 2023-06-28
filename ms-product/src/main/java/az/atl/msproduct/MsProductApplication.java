package az.atl.msproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsProductApplication {
	@GetMapping("/product")
	public String sayHello(){
		return "Hello Product";
	}
	public static void main(String[] args) {
		SpringApplication.run(MsProductApplication.class, args);
	}

}
