import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class bagelEx10 extends Application
 {
   public void start (Stage stage ) throws Exception
    {
       Parent parent = FXMLLoader.load(getClass().getResource("bagels10.fxml"));
       Scene scene = new Scene(parent);
       stage.setTitle("Tucker's Bagel Store");
       stage.setScene(scene);
       stage.show();
       
     }
   public static void main(String [] args)
     {
        launch(args);
     }   
}