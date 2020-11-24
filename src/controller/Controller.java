package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public int SIZE = 10;

    @FXML
    public GridPane gridPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                gridPane.add(new TextArea("KUCINA VELIKA!!!!"), i, j);
            }
        }
    }
}
