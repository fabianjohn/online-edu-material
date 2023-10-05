package com.fabiscode.edumaterials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEduMaterialsApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEduMaterialsApplication.class, args);
		
		System.out.println("Main thread start");
		
		myThread mt = new myThread();
		mt.run();
	
		
		System.out.println("Main thread finish");
	}

}

