/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import futuretheonaccent.inventory.model.Product;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
<<<<<<< HEAD:Project/Code/TeleconicationProductInventoryProject/src/futuretheonaccent/inventory/view/InventorySystem.java
public class InventorySystem {
    
     public static void main(String[] args) throws IOException {
        InventorySystem bus =  new InventorySystem();
       
        Scanner enter = new Scanner(System.in);
        
        boolean out = false;
        int option;
         
        
        while(!out){  
                        
            System.out.println("Wellcome To Inventory\n");
            
            
         
            System.out.println("1. Producto Information Json");
            System.out.println("2. Product Information and Search");
            System.out.println("3. Exit");
            
            try{
            
            
            System.out.println("Enter Opcion to Use");
            option = enter.nextInt();
            
            switch (option){
               
                
        case 1:
           
            bus.searchAndEnter();
            
        break;    
            
        case 2:
            bus.searchJson();
            break;
            
        case 3:
        
             out = true;    
                    break;
                default:
                    System.out.println("Select Valid Opion ");
          }
        
            }catch (InputMismatchException e){
                System.out.println("Enter Number");
                enter.next();
            }
        }
    }
      
        
    }
    

=======
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
             
             System.out.println("product object amount ->" + product1.getAmount());
            System.out.println("product object brand ->" + product1.getBrand());
            System.out.println("product object id ->" + product1.getId());
   
            System.out.println("\n  ");
    

           
            
            
            }

    }
}
>>>>>>> 18cb6328ea2a18ff932b7b31d65bdd18f1662dbe:Project/Code/TelecommunicationsInventoryProject/src/futuretheonaccent/inventory/view/SystemInventory.java
