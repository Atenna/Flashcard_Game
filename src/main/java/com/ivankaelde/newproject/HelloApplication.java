package com.ivankaelde.newproject;

import com.ivankaelde.newproject.controller.FlashcardController;
import com.ivankaelde.newproject.controller.HelloController;
import com.ivankaelde.newproject.model.FlashcardDeck;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {

    private static Stage stage;
    private HelloController helloAppController;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene initialScene = new Scene(fxmlLoader.load());

        FXMLLoader flashcardLoader = new FXMLLoader(HelloApplication.class.getResource("flashcard-view.fxml"));
        Scene flashcardScene = new Scene(flashcardLoader.load());

        this.helloAppController = fxmlLoader.getController();

        this.stage = stage;
        stage.setTitle("Hello!");
        stage.setScene(initialScene);
        stage.show();
    }

    public static void switchToFlashcardScreen() throws Exception {
        FXMLLoader flashcardLoader = new FXMLLoader(HelloApplication.class.getResource("flashcard-view.fxml"));
        Scene flashcardScene = new Scene(flashcardLoader.load());

        stage.setScene(flashcardScene);
        stage.setTitle("Flashcard Game");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}