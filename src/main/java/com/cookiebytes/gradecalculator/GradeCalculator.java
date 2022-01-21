package com.cookiebytes.gradecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.Arrays;


public class GradeCalculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/data/grade-calculator.fxml"));
        stage.setTitle("Grade Calculator");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

}