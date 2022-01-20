package com.cookiebytes.gradecalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GradeCalculator extends Application {
    public static void main(String[] args){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Grade Calculator");
        stage.show();
    }
}