package com.investment.engine.demo;

import com.investment.engine.demo.config.PetStoreIntegrationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PetStoreIntegrationConfig.class)
public class InvestmentEngineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentEngineDemoApplication.class, args);
	}
}
