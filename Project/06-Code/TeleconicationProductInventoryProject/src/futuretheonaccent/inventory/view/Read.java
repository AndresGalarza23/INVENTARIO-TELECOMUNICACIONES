/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.view;



/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Read {
    public static String fact() {
     
        String sfact = null;
        
        try {
            BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));       
            sfact = enter.readLine();
            
        } catch (IOException e){

            System.out.println("Error: " + e.getMessage());
        }
         return sfact;
    }
    
    public static int factInt() {
        
      try{
          return (Integer.parseInt(fact()));
          
      }  catch(NumberFormatException error){
         return (Integer.MIN_VALUE);
      }
        
    }
    
    public static float factFloat() {
        try{
            Float f = new Float(fact());
            return (f.floatValue());
            
        }catch(NumberFormatException error){
         return (Float.NaN);
        }
    }
    
    
}

