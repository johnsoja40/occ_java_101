import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class RadioButtonDemoLambda extends Application
  {
       private double subtotal=0.0;
       private double total =0.0;
       private double tax= 0.06;
       private double bagelcost =0.0;
    public static void main(String args[])
       {
         launch (args);//inherited from Application class
                       //creates the Stage object
                       //calls the start method passingkk a referene to the Stage object
       }
    @Override
    public void start(Stage primaryStage) //entry point for the application
       {
         Button calc = new Button("Calculate");
         RadioButton plain = new RadioButton("Plain");  //Instantiating the RadioButtons, linking them to ToggleGroup
         RadioButton wheat = new RadioButton("Wheat");
         RadioButton everything = new RadioButton("Everything");
         ToggleGroup radioGroup = new ToggleGroup();
         
         plain.setToggleGroup(radioGroup);
         wheat.setToggleGroup(radioGroup);
         everything.setToggleGroup(radioGroup);
         
         VBox vbox = new VBox(10,plain,wheat,everything,calc);           //add all buttons to the VBox
         vbox.setAlignment(Pos.TOP_LEFT);             //set vbox alignment
         vbox.setPadding(new Insets(10)); 
         Scene scene = new Scene(vbox,150,150);        //Create a Scene and set VBox as root node
                       
         primaryStage.setScene(scene);                 //Add Scene to stage 
         primaryStage.setTitle("RadioButton Demo");        //Set the stage title
         
         primaryStage.show();                  //show the window
       
        calc.setOnAction(ae ->
          {  
               subtotal = bagelcost;
               total  = tax*subtotal + subtotal;
                Alert alert = new Alert(AlertType.INFORMATION);
               alert.setHeaderText(String.format("Total: $ %.2f", total));
               alert.setContentText(String.format("Tax:      %.2f\nTotal:    %.2f",tax,total));
               alert.setTitle("Your Order");
               alert.showAndWait();
            
          });     //End of lambda expression notice the parantheses and the semicolon.
        plain.setOnAction(ae ->
          {  
               if (plain.isSelected())
                  bagelcost = 1.00;
                  else bagelcost =0.0;
                           
            
          });     //End of lambda expression notice the parantheses and the semicolon.
        wheat.setOnAction(ae ->
          {  
               if (wheat.isSelected())
                  bagelcost = 1.20;
                  else bagelcost =0.0;
                           
            
            
          });     //End of lambda expression notice the parantheses and the semicolon.
         everything.setOnAction(ae ->
          {  
               if (everything.isSelected())
                  bagelcost = 1.50;
                  else bagelcost =0.0;
                           
            
            
          });     //End of lambda expression notice the parantheses and the semicolon.



   }
}   