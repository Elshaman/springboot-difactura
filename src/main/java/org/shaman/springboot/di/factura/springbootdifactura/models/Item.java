package org.shaman.springboot.di.factura.springbootdifactura.models;

public class Item {

    private Product product;
    private Integer Quantity;


    public Item(Product product, Integer quantity) {
        this.product = product;
        Quantity = quantity;
    }
    public Item() {
    }

    public int getImporte(){
        return this.Quantity * this.product.getPrice();
    }



    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return Quantity;
    }
    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
    

}
