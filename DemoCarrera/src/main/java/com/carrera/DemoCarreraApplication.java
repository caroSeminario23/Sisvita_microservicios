package com.carrera;

import com.carrera.model.Carrera;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class DemoCarreraApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCarreraApplication.class, args);
	}  
}
