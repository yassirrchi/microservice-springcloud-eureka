package org.sid.billingservice.feing;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {
    @GetMapping("/products")
    PagedModel<Product> pageProduct();
    @GetMapping(path = "/products/{id}")
    Product getProductById(@PathVariable("id") Long id);
}

