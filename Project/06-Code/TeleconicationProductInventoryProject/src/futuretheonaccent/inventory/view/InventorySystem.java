/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.view;

import futuretheonaccent.inventory.model.Product;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class InventorySystem {

    static Product product[]= null;
    static int cont = 0;
    
    public static void main(String[] args) {
        
        product = new Product[10];
        
        int option = 0;
        
        do{
            System.out.println("--MENU--");
            System.out.println("1. Enter Product");
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

    private static void enterProduct() {
        
        String productName = "" ;
          String brand = "";
          float pvp = 0;
          int amount = 0;
          int id = 0 ;
        
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
           
    }

    private static void searchProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void listProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
      
}
