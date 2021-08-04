/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.invetory.model.Inventory;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class InventoryManagement {

    public void inputInventory() throws IOException, ParseException, org.json.simple.parser.ParseException {

        boolean flag = false;
        String data = FileManager.read("data/Inventory.json");
        String dataProviders = FileManager.read("data/Provider.json");
        Inventory inventory = new Inventory();
        JSONArray array = (JSONArray) new JSONParser().parse(data);
        JSONArray arrayProviders = (JSONArray) new JSONParser().parse(dataProviders);
        JSONObject jsonObject = new JSONObject();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID");
        String id = sc.nextLine();
        inventory.setId(id);

        System.out.println("Enter Product Name");
        String product = sc.nextLine();
        inventory.setName(product);

        System.out.println("Enter Description");
        String description = sc.nextLine();
        inventory.setDescription(description);

        System.out.println("Enter Purchase Price");
        double purchasePrice = sc.nextDouble();
        inventory.setPurchasePrice(purchasePrice);

        System.out.println("Enter Sale Price");
        double salePrice = sc.nextDouble();
        inventory.setSalePrice(salePrice);

        System.out.println("Enter Quantity");
        int quantity = sc.nextInt();
        inventory.setQuantity(quantity);

        System.out.println("Enter Quantity Minimum Stock");
        int quantityMinimumStock = sc.nextInt();
        inventory.setQuantityMinimumStock(quantityMinimumStock);
        for (int i = 0; i < arrayProviders.size(); i++) {
            jsonObject = (JSONObject) arrayProviders.get(i);
            System.out.println(jsonObject.get("id").toString());
          }
          System.out.println("------------------------");
          do {
            System.out.println("Enter a provider: ");
            String idProvider = sc.next();
            for (int i = 0; i < arrayProviders.size(); i++) {
                jsonObject = (JSONObject) arrayProviders.get(i);
                if (idProvider.equals(jsonObject.get("id").toString())) {

                    JSONObject productInvetory = new JSONObject();
                    productInvetory.put("id", inventory.getId());
                    productInvetory.put("productName", inventory.getName());
                    productInvetory.put("description", inventory.getDescription());
                    productInvetory.put("purchasePrice", inventory.getPurchasePrice());
                    productInvetory.put("salePrice", inventory.getSalePrice());
                    productInvetory.put("quantity", inventory.getQuantity());
                    productInvetory.put("quantityMinimumStock", inventory.getQuantityMinimumStock());
                    productInvetory.put("idProvider", inventory.getIdProvider());

                    array.add(productInvetory);
                    FileManager.writeRecord("data/Inventory.json", array.toJSONString());
                    flag = true;
                } else {
                    System.out.println("The provider doesn´t exist");
                    flag = false;
                }
            }
        } while (flag != true);

     }
}
