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
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.AnchorPane;
public class CheckBoxDemoLambda extends Application
  {
       private double toppingcost = 0.0;
       private double subtotal=0.0;
       private double total =0.0;
       private double tax= 0.06;
       private double bagelcost =0.0;
    public static void main(String args[])
       {
         launch (args);//inherited from Application class
                       //creates the Stage object
                       //calls the start method passing a referene to the Stage object
       }
    @Override
    public void start(Stage primaryStage) //entry point for the application notice the name given the stage
       {
         
         CheckBox jelly = new CheckBox("Jelly");
         CheckBox cCheese= new CheckBox("Cream Cheese");
         HBox hbox2 = new HBox(10);
         hbox2.getChildren().addAll(jelly, cCheese);
        
         TitledPane ExtrasPane = new TitledPane("Extras", hbox2);

         //HBox hbox2 = new HBox(10,jelly, cCheese);
         //hbox2.setPadding(new Insets(10));
         
         Button calc = new Button("Calculate");
         RadioButton plain = new RadioButton("Plain");  //Instantiating the RadioButtons, linking them to ToggleGroup
         RadioButton wheat = new RadioButton("Wheat");
         RadioButton everything = new RadioButton("Everything");
         ToggleGroup radioGroup = new ToggleGroup();
         radioGroup.getToggles().addAll(plain,wheat,everything);
         //plain.setToggleGroup(radioGroup);
         //wheat.setToggleGroup(radioGroup);
         //everything.setToggleGroup(radioGroup);
         HBox hbox1 = new HBox(10);
         hbox1.getChildren().addAll(plain, wheat, everything,calc);
        
         TitledPane bagelPane = new TitledPane("Bagel Choices" , hbox1);

        // HBox hbox1 = new HBox(10,plain,wheat,everything,calc);           //add all buttons to the VBox
        // hbox1.setAlignment(Pos.TOP_LEFT);             //set vbox alignment
        // hbox1.setPadding(new Insets(10)); 
         
         //AnchorPane myPane = new AnchorPane();
        // myPane.getChildren().addAll(hbox1, hbox2);
         HBox contentBox = new HBox();
         contentBox.getChildren().addAll(ExtrasPane, bagelPane);
         Scene scene = new Scene(contentBox,640,75);        //Create a Scene and set VBox as root node
                       
         primaryStage.setScene(scene);                 //Add Scene to stage 
         primaryStage.setTitle("CheckBox Demo");        //Set the stage title
         
         primaryStage.show();                  //show the window
       
        calc.setOnAction(ae ->
          {  
               subtotal = bagelcost + toppingcost;
               total  = tax*subtotal + subtotal;
               System.out.printf(" Total is  %.2f\n",total);
               toppingcost = 0;
            
            
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
          cCheese.setOnAction(ae ->
          {  
               if (cCheese.isSelected())
                  toppingcost = 0.50;
                  else toppingcost =0.0;
                           
            
            
          });     //End of lambda expression notice the parantheses and the semicolon.
          jelly.setOnAction(ae ->
          {  
               if (jelly.isSelected())
                  toppingcost = 0.25;
                  else toppingcost =0.0;
                           
            
            
          });     //End of lambda expression notice the parantheses and the semicolon.




   }
}   