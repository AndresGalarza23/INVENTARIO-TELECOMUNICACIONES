/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.view;

import ec.edu.espe.invetory.controller.InventoryManagement;
import ec.edu.espe.invetory.controller.InvoiceManagement;
import ec.edu.espe.invetory.controller.ProviderManagement;
import ec.edu.espe.invetory.controller.SaleManagement;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class SystemInventory {
    
    public static void main(String[] args) throws IOException, ParseException, java.text.ParseException {
        InventoryManagement inventory = new InventoryManagement();
        ProviderManagement provider = new ProviderManagement();
        InvoiceManagement invoice = new InvoiceManagement();
        SaleManagement saleManagement = new SaleManagement();
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        while (!exit) {
            System.out.println("1. Add to Inventory");
            System.out.println("2. Add Provider");
            System.out.println("3. Sale");
            System.out.println("4. Exit");
            System.out.println("Write a correct option");
            option = sn.nextInt();
            
            switch (option) {
                case 1:
                    inventory.inputInventory();
                    break;
                case 2:
                    provider.inputProvider();
                    break;
                case 3:
                    saleManagement.sale();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Only numbers");
                    
            }
              
        }
    
    }
    
}
