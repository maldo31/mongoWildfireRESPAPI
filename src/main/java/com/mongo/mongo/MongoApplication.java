package com.mongo.mongo;

import com.mongo.mongo.model.Wildfire;
import com.mongo.mongo.repository.WildfireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(WildfireRepository repository) {
		return args -> {
			LocalDate localDate = LocalDate.parse("2000-05-31");
			Wildfire wildfire = new Wildfire(
					"Poland",
			"big",
			"bigfire",
			2000,
			"A",
			"B",
			"human ignition",
			localDate,
			"local",
			20.0
			);

			repository.insert(wildfire);
		};
	}

}
