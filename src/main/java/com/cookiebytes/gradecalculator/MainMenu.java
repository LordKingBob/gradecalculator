package com.cookiebytes.gradecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenu {
    @FXML
    private Button button;

    public void handleButtonClick(){
        System.out.println("Run some code the user doesn't see");
        button.setText("Stop touching me");
    }
}
