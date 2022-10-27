package net.dynamic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String product_name;  
    private String product_description;
    private int product_price;
    private int stock;
    
    
    
	public Product() {
		super();		
	}
	public Product(Long id, String product_name, String product_description, int product_price,int stock) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
		this.stock = stock;
	}	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
