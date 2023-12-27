package org.shaman.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Invoice {

    @Autowired
    private Customer customer;

    @Value("${invoice.description}")
    private String description;

    @Autowired
    @Qualifier("default")
    private List<Item> items;


    //el postconstructor se ejecuta cuando
    // - se haya instanciado
    // - se hayan inyectado todos los valores
    @PostConstruct
    public void init(){
        System.out.println("creando el componente de la factura");
        //System.out.println(this.customer.getFirstname() + " " + this.customer.getLastname());
        //System.out.println(this.description);
        this.customer.setFirstname(customer.getFirstname().concat(" dios negro de merak")); 
    }

    @PreDestroy
    public void destroy(){
        System.out.println("desrtuyendo el componente");
    }

    /*
    Recien en el constructor aun no se han inyectado los 
    valores con autowired
    */
    public Invoice() {
        System.out.println("creando el componente de la factura");
        System.out.println(this.customer);
        System.out.println(this.description);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        //int total = 0;
        /*for (Item item : this.items) {
            total += item.getImporte();
        }*/
        int total = items.stream()
                    .map(item -> item.getImporte())
                    .reduce(0, (sum , importe)->sum + importe);

        return total;
    }

}
