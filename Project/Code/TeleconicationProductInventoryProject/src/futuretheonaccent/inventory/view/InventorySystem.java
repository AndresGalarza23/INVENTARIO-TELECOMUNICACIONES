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
    

