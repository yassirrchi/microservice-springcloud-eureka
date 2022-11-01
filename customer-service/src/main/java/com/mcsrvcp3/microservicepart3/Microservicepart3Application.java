package com.mcsrvcp3.microservicepart3;

import com.mcsrvcp3.microservicepart3.Entities.Customer;
import com.mcsrvcp3.microservicepart3.Repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Microservicepart3Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservicepart3Application.class, args);
    }
    @Bean
    CommandLineRunner init(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"test","test@email.com"));
            customerRepository.save(new Customer(null,"test2","test3@email.com"));
            customerRepository.save(new Customer(null,"test","test4@email.com"));
            customerRepository.findAll().forEach(customer -> System.out.println(customer));

         };
    }

}
