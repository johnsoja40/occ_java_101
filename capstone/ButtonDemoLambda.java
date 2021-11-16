import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public class ButtonDemoLambda extends Application
  {
       private double subtotal=0.0;
       private double total =0.0;
       private double tax= 0.06;
    public static void main(String args[])
       {
         launch (args);//inherited from Application class
                       //creates the Stage object
                       //calls the start method passingkk a referene to the Stage object
       }
    @Override
    public void start(Stage primaryStage) //entry point for the application
       {
         Label messageLabel = new Label("Hello World");//instantiate Label control
         Button myButton = new Button("Click Me");
        // myButton.setOnAction(new ButtonClickHandler());
         VBox vbox = new VBox(10,messageLabel,myButton);           //Put Label control and button into VBOX
         Scene scene = new Scene(vbox,300,100);        //Create a Scene and set VBox as root node
         vbox.setAlignment(Pos.CENTER);                //set vbox alignment
         primaryStage.setScene(scene);                 //Add Scene to stage 
         primaryStage.setTitle("Button Demo");        //Set the stage title
         
         primaryStage.show();                  //show the window
       
    myButton.setOnAction(ae ->
          {  
               subtotal = 1.00;
               total  = tax*subtotal + subtotal;
               System.out.println(" Total is  " + total);
               messageLabel.setText("Bye Bye");
            
          });     //End of lambda expression notice the parantheses and the semicolon.
      
   }
}   