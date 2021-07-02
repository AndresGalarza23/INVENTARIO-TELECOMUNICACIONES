/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import futuretheonaccent.inventory.model.Product;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class InventorySystem {

    static Product product[]= null;
    static int cont = 0;
    
    public static void main(String[] args) throws IOException {
        
        product = new Product[10];
        
        int option = 0;
        
        do{
            System.out.println("--MENU--");
            System.out.println("1. Enter Product and json file");
            System.out.println("2. Search Product");
            System.out.println("3. List Products");
            System.out.println("4. Out");
            option = Read.factInt();
            
       switch(option){
                case 1: 
                    if (cont<10){
                       enterProduct();
                      
                    }else{
                       System.out.println("No more Products");
                    }
                    break;
                case 2: 
                    searchProduct();
                     break;
                     
                case 3: 
                    listProducts();
                    break;
                case 4:
                   System.out.println("Out Sys");
            
            
            }
            
            
        }while(option != 4);
        System.exit(0);
        
        }

    private static void enterProduct() throws IOException {
        
        String productName = "" ;
          String brand = "";
          float pvp = 0;
          int amount = 0;
          int id = 0 ;
          String jsonProduct;
          FileWriter file = new FileWriter("./files/Product Telecomunication.json");
          
          System.out.print("Enter Products Facts\n");
          System.out.print("--------------------\n");
          System.out.print("Id: ");
          id = Read.factInt();
          System.out.print("Product Name: ");
          productName = Read.fact();
          System.out.print("P.V.P: ");
          pvp = Read.factFloat();
          System.out.print("Amount: ");
          amount = Read.factInt();
          System.out.print("Brand: ");
          brand = Read.fact();
          
          product[cont] = new Product(productName, pvp, amount, brand, id);
          cont++;
          System.out.println("Product in List" + cont);
          GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonProduct = gson.toJson(product[cont]);

            Product product1;
            product1 = gson.fromJson(jsonProduct,Product.class);
            jsonProduct = gson.toJson(product);

            System.out.println("jsonGame ->" + jsonProduct); 
            try {
            file.append(jsonProduct);
            file.flush();
            file.close();

        } catch (IOException e) {
        }
    }

    private static void searchProduct() {
        
    
            int id ;
            int pos= -1;
            int action = 0;
                  System.out.println("Enter Id Product");
                  id = Read.factInt();
                  pos = search(id);
                  
                  if (pos >=0){
                      System.out.println("Product: " + product[pos].toString());
                  
                  }
    
    
    }

    private static void listProducts() {
      
         int id ;
            int pos= -1;
            int action = 0;
                  System.out.println("Enter Id Product");
                  id = Read.factInt();
                  pos = search(id);
                  
                  if (pos >=0){
                      System.out.println("Product: " + product[pos].toString());
                  
                  }
        
    }

    private static int search(int id) {
        
            int pos=-1;
        
        for(int i = 0; i <cont; i++){
        
            if (product[i].getId() == id){
                System.out.println("Product Found ");
                pos = i;
                
        }else{
                System.out.println("Product Not Found");            }
    
        }
        return pos;
        
        }
        
      
        
      
}
