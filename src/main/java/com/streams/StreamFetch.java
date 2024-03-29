package com.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    @Override
    public String toString() {
    	return String.valueOf(id)+"name:"+name;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
}  


public class StreamFetch {
public static void main(String[] args) {
	List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    
    List<Float> productsList2 = productsList.stream().filter(p -> p.id>2).map(p->p.price).collect(Collectors.toList());
    
    System.out.println(productsList2);
    
    Float totalPrice = productsList.stream()  
            .map(product->product.price)  
            .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
System.out.println(totalPrice);  
    
int totalPrice1 = productsList.stream()  
.mapToInt(product->(int)product.price)  
.sum();   // accumulating price  
System.out.println(totalPrice1);  

    
    Map<Integer, Product> proMap = new HashMap<Integer, Product>();
    proMap.put(1, new Product(1,"HP Laptop",25000f));
    proMap.put(2, new Product(4,"Sony Laptop",28000f));
    
    List<Product> productsList3 =  productsList.stream().filter(p->p.getName().equals("HP Laptop")).collect(Collectors.toList());
    System.out.println(productsList3);
    
}
}
