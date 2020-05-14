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

public class IceCreamOrderController {

    @FXML
    private CheckBox Nuts;

    @FXML
    private CheckBox Cherries;

    @FXML
    private Button Restore;

    @FXML
    private Button Save;

    @FXML
    private Button Calculate;

    @FXML
    private RadioButton Vanilla;

    @FXML
    private ToggleGroup RadioBtnGrp;

    @FXML
    private RadioButton Chocolate;

    @FXML
    private RadioButton Strawberry;

    double cost = 0.0;
    double nut_topping;
    double cherry_topping;

    @FXML
    double VanillaListener() {
      if (Vanilla.isSelected())
        cost = 2.25;
      else
        cost = 0.00;
      return cost;
    }

    @FXML
    double ChocolateListener() {
      if(Chocolate.isSelected())
        cost = 2.25;
      else
        cost =0.00;
      return cost;
    }

    @FXML
    double StrawberryListener() {
      if(Strawberry.isSelected())
        cost = 2.25;
      else
        cost = 0.00;
      return cost;
    }

    @FXML
    double CherriesListener() {
      if(Cherries.isSelected())
        cherry_topping = 0.50;
      else
        cherry_topping = 0.00;
      return cherry_topping;
    }

    @FXML
    double NutsListener() {
      if(Nuts.isSelected())
        nut_topping = 0.50;
      else
        nut_topping = 0.00;
      return nut_topping;
    }

    @FXML
    void CalculateListener() {
      double subtotal, tax, total, conecost;
      double tax_rate = 0.06;
      conecost = VanillaListener() + ChocolateListener() + StrawberryListener();
      subtotal = VanillaListener() + ChocolateListener() + StrawberryListener() + NutsListener() + CherriesListener();
      tax = subtotal * tax_rate;
      total = subtotal + tax;

      Alert alert =new Alert(AlertType.INFORMATION);
      alert.setTitle("Message");
      alert.setHeaderText(String.format("YOUR ORDER"));
      alert.setContentText(String.format("Cost %.2f \nTax: %.2f\nTotal: %.2f", subtotal, tax, total));
      alert.showAndWait();
    }

    @FXML
    void RestoreListener() {
      Vanilla.setSelected(false);
      Chocolate.setSelected(false);
      Strawberry.setSelected(false);
      Nuts.setSelected(false);
      Cherries.setSelected(false);
      String file = "icecream.txt";
      String order;
      cost = 0.0;
      nut_topping = 0.0;
      cherry_topping = 0.0;

      try{
        File data_file = new File(file);
        Scanner input_file = new Scanner(data_file);

        while(input_file.hasNextLine()) {
          order = input_file.nextLine();
          if(order.contains("Vanilla")) {
            cost = 2.25;
            Vanilla.setSelected(true);
          }
          if(order.contains("Chocolate")) {
            cost = 2.25;
            Chocolate.setSelected(true);
          }
          if(order.contains("Strawberry")) {
            cost = 2.25;
            Strawberry.setSelected(true);
          }
          if(order.contains("With_Nuts")) {
            nut_topping = 0.50;
            Nuts.setSelected(true);
          }
          if(order.contains("With_Cherries")) {
            cherry_topping = 0.50;
            Cherries.setSelected(true);
          }
        }
        input_file.close();
      }
      catch (Exception ex) {
        ex.printStackTrace();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("ERROR: opening data file ");
        alert.setContentText(file);
        alert.showAndWait();
      }
    }

    @FXML
    void SaveListener() {
      String file = "icecream.txt";
      try{
        PrintWriter output_file = new PrintWriter(file);
        if(Vanilla.isSelected())
          output_file.println("Vanilla");
        if(Chocolate.isSelected())
          output_file.println("Chocolate");
        if(Strawberry.isSelected())
           output_file.println("Strawberry");
        if(Nuts.isSelected())
          output_file.println("With_Nuts");
        else
          output_file.println("Without_Nuts");
        if(Cherries.isSelected())
          output_file.println("With_Cherries");
        else
          output_file.println("Without_Cherries");
        output_file.close();
      }
      catch (Exception ex) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Error");
        alert.setContentText("Error Writing " + file + " File");
        alert.showAndWait();
      }
    }

    @FXML
    void initialize() {
    }
}
