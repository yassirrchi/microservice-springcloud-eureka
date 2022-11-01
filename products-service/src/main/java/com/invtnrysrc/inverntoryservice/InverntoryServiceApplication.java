package com.invtnrysrc.inverntoryservice;

import com.invtnrysrc.inverntoryservice.Entities.Product;
import com.invtnrysrc.inverntoryservice.Reporitories.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class InverntoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InverntoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepo productRepo){
        productRepo.save(new Product(null,"cocacolla",23,22));
        productRepo.save(new Product(null,"bepis",21,22));
        productRepo.save(new Product(null,"chamoy",1,0));
        productRepo.findAll().forEach(product -> {System.out.println(product);});
        return null;
    }

}
