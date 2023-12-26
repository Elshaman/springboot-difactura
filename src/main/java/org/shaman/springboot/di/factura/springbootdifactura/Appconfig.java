package org.shaman.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.shaman.springboot.di.factura.springbootdifactura.models.Item;
import org.shaman.springboot.di.factura.springbootdifactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
public class Appconfig {

    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony", 800);
        Product p2 = new Product("Bicicleta Bianchi", 1200);
        return Arrays.asList(
            new Item (p1 , 2) , 
            new Item (p2 , 4)
        );


    }

}
