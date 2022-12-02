package presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class updateDiscountController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField errorField,studentDiscount,professorDiscount;

    @FXML
    protected void onLogoutClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("bsm_home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onAdminPageClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("admin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onUpdateDiscountClick(ActionEvent event) throws IOException {
        if(studentDiscount.getText().isEmpty() || professorDiscount.getText().isEmpty()){
            errorField.setVisible(true);
            errorField.setText(String.format("Enter Discount cannot be empty"));
            return;
        }
        else{
            errorField.setVisible(true);
            errorField.setText(String.format("New Discount Updated Successfully"));
            studentDiscount.setText(null);
            professorDiscount.setText(null);
            return;
        }
    }

}
