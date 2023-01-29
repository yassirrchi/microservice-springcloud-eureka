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
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class InverntoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InverntoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepo productRepo, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Product.class);
        productRepo.save(new Product(null,"Ceramic Lion Statue",44,330));
        productRepo.save(new Product(null,"Canon Marocain d Essaouira",30,592));
        productRepo.save(new Product(null,"Bateau en bois dargane",320,21));
        productRepo.save(new Product(null,"Tajine en bois",10,341));
        productRepo.findAll().forEach(product -> {System.out.println(product);});
        return null;
    }

}
