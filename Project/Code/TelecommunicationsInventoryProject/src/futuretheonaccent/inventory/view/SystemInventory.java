/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import futuretheonaccent.inventory.model.Product;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class SystemInventory {
    public static void main(String[] args) {
        
          String productName;
               float price;
               int amount;
               String brand;
               int id;
               String jsonProduct = "";
               Product product []= new Product[10];
              
            for(int i=0; i<2; i++){  
                 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Product name:");
        productName= sc.next();
        System.out.println("Enter price:");
        price= sc.nextFloat();
        System.out.println("Enter amount:");
        amount= sc.nextInt();
        System.out.println(" Enter brand:");
        brand= sc.next();
        System.out.println("Enter Id:");
        id= sc.nextInt();
        sc.nextLine();
        
        product[i] = new Product(productName,price,amount,brand,id); 
   
        
    }
            
       
            for(int i=0; i<2; i++){
            GsonBuilder gsonBuilder = new  GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonProduct = gson.toJson(product[i]);
            
               
            Product product1; 
            product1 = gson.fromJson(jsonProduct, Product.class);
                                                                                                                                                                                                                                                                                                                                                         
            System.out.println("jsonProduct ->" + jsonProduct);
            System.out.println("product object productName ->" + product1.getProductName());
            System.out.println("product object price ->" + product1.getPrice());
             
            
            
            
            
            }

    }
}