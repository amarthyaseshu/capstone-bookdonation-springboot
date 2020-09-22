package com.prograd.BookDonation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.prograd.controller.RegistrationController;

@SpringBootApplication()
@EntityScan({"com.prograd.model"})
@EnableJpaRepositories({"com.prograd.dao"})
//@ComponentScan(basePackageClasses=RegistrationController.class)
@ComponentScan({"com.prograd.controller"})
@ComponentScan({"com.prograd.service"})
public class BookDonationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDonationApplication.class, args);
	}

}
