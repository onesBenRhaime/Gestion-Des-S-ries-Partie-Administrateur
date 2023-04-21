/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author BAZINFO
 */
public class NumberVotesController implements Initializable {

    @FXML
    private Button Accueilfx14;
    @FXML
    private ScrollPane scroll;
    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> seasonfx;
    @FXML
    private TableColumn<?, ?> episodefx;
    @FXML
    private TableColumn<?, ?> nbviewfx;
    @FXML
    private Label welcomeLb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToHome(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../GUI/HomeAdmin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToScore(ActionEvent event) {
    }

    @FXML
    private void accueilAction(ActionEvent event) {
    }

    @FXML
    private void goToViews(ActionEvent event) {
    }

    @FXML
    private void goToEpisodes(ActionEvent event) {
    }
    
}
