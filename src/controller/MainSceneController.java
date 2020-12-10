package controller;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class MainSceneController {
    public int SIZE = 10;
    public VBox parametersVBox;

    @FXML
    private GridPane gridPane;

    public void initialize() {
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                gridPane.add(new TextArea("VELIKA!!!!"), i, j);
            }
        }
    }

    public void Show(MouseEvent mouseEvent) {
        parametersVBox.setOnMouseEntered(mouseEvent1 -> {
            parametersVBox.setVisible(true);
            parametersVBox.getChildren();
        });
    }
}
