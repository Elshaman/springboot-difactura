package org.shaman.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.shaman.springboot.di.factura.springbootdifactura.models.Item;
import org.shaman.springboot.di.factura.springbootdifactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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

     @Bean("default")
    List<Item> itemsInvoiceOficina(){
        Product p1 = new Product("Monitor Asus 24", 700);
        Product p2 = new Product("NoteBook Razer", 2400);
        Product p3 = new Product("Impresora Hp", 800);
        Product p4 = new Product("Escritorio Oficina", 900);
        return Arrays.asList(
            new Item (p1 , 4) , 
            new Item (p2 , 6) ,
            new Item (p3 , 4) ,
            new Item (p4 , 1) 
        );
    }

}
