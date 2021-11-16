import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import java.util.Scanner;
public class BagelControllerEx10 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox Jelly;

    @FXML
    private CheckBox CreamCheese;

    @FXML
    private ToggleGroup RadioBtnGrp;

    @FXML
    private RadioButton Everything;
    
    @FXML
    private RadioButton plain;
    
    @FXML
    private RadioButton wheat;

    @FXML
    private Button Save;

    @FXML
    private Button ReDo;

    @FXML
    private Button Calculate;
    
    double jtopping =0.0;  //specific toppings
    double ctopping =0.0;
    double bagelcost;

    @FXML
    void CalculateButtonListener() 
    {
       double subtotal, tax, total,bagelcost;
       double tax_rate = 0.06;
       bagelcost = wheatListener() +plainListener() + everythingListener();  //cost of bagel 
       subtotal = CreamCheeseListener() + JellyListener() + wheatListener() + plainListener() + everythingListener();
       tax = subtotal * tax_rate;
       total = subtotal + tax;
      
       Alert alert =new Alert(AlertType.INFORMATION);
       
       alert.setHeaderText(String.format("Total: $ %.2f",total));
       alert.setContentText(String.format("Order: Jelly %.2f \nCream Cheese %.2f\n Bagel %.2f\nTax: %.2f\nTotal: %.2f", jtopping,ctopping,bagelcost,tax,total));
       alert.setTitle("Your Order");
       //jtopping = 0.0; remove reference to setting toppings to 0.0
       //ctopping= 0.0;
       
       alert.showAndWait();
       
          }

    @FXML
    double CreamCheeseListener()   //set the specific topping
    {
         
        if(CreamCheese.isSelected())
         ctopping = 0.50;
         else ctopping = 0.0;
                  
         return ctopping;  
    }

    @FXML
    double JellyListener() //set the specific topping 
    {
       
       if(Jelly.isSelected())
         jtopping = 0.75;
         else jtopping = 0.0;        
         return jtopping;  

    }

    @FXML
    void ReDoButtonListener() 
    {
      String order;
      bagelcost = 0.0;
      ctopping = 0.0;      //set all variables to 0.0
      jtopping = 0.0;
      CreamCheese.setSelected(false);
      Jelly.setSelected(false);
      wheat.setSelected(false);
      plain.setSelected(false);
      Everything.setSelected(false);
      
      try{
      
           File file = new File("bagels3.txt");
           Scanner inputFile = new Scanner(file);
           
           while(inputFile.hasNext())
             {
               order = inputFile.nextLine();
               if(order.charAt(0) == 'p')
                  {
                     bagelcost = 1.00;
                     plain.setSelected(true);
                  }
                if(order.charAt(0) == 'w')
                  {
                     bagelcost = 1.30;
                     wheat.setSelected(true);
                  }
                 if(order.charAt(0) == 'e')
                  {
                     bagelcost = 1.20;
                     Everything.setSelected(true);
                  }
                  if(order.charAt(0) == 'c')
                  {
                     ctopping = 0.50;
                     CreamCheese.setSelected(true);
                  }
                   if(order.charAt(0) == 'j')
                  {
                     jtopping = 0.75;          //use only equals
                     Jelly.setSelected(true);
                  }

               }//end while
               inputFile.close();   
            }//end of try
            catch (Exception ex)
              {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Error");
                 alert.setHeaderText("Errorr");
                 alert.setContentText("Error Opening Data File");
                 alert.showAndWait();
               }//end catch
              
         }//redo button     
 
    @FXML
   public void SaveButtonListener()  //removed the throws IOException and use try...catch
    {
      try{
        PrintWriter outputfile = new PrintWriter("bagels3.txt");
        
        if(plain.isSelected())
          outputfile.println("plain");
        if(Everything.isSelected())
          outputfile.println("everything");
        if(wheat.isSelected())
          outputfile.println("wheat");
        if(CreamCheese.isSelected())
          outputfile.println("creamcheese");
        if(Jelly.isSelected())
          outputfile.println("jelly");
          
        outputfile.close();
                
      }
      catch (Exception ex)
              {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Error");
                 alert.setHeaderText("Error");
                 alert.setContentText("Error Writing Data File");
                 alert.showAndWait();
               }

     
    }

    @FXML
    double everythingListener() 
    {
      if(Everything.isSelected())
         bagelcost = 1.20;
         else bagelcost = 0.0;
      return bagelcost;
    }

    @FXML
    double plainListener() 
    {
        if(plain.isSelected())
         bagelcost = 1.00;
         else bagelcost = 0.0;
      return bagelcost;

    }

    @FXML
    double wheatListener() 
    {
       if(wheat.isSelected())
         bagelcost = 1.30;
         else bagelcost = 0.0;
      return bagelcost;

    }

    @FXML
    void initialize() {
           }
}
