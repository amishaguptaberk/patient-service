package com.amisha.patient_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientManagementApplication.class, args);
	}

}
	docker run --name amisha-postgres -e POSTGRES_PASSWORD=test123 -d postgres

		docker run --name amisha-postgres -p 5432:5432 -e POSTGRES_USER=amisha -e POSTGRES_PASSWORD=test123 -e POSTGRES_DB=postgresDB -d postgres

localhost:5432
