import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IceCreamOrder extends Application {

  @Override
    public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("IceCreamOrder.fxml"));
      Scene scene = new Scene(parent);
      stage.setTitle("Johnson's Ice Cream Store");
      stage.setScene(scene);
      stage.show();
    }
    public static void main(String [] args) {
      launch(args);
    }
}
