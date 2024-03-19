package com.ivankaelde.newproject.controller;

import com.ivankaelde.newproject.HelloApplication;
import com.ivankaelde.newproject.model.FlashcardDeck;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    //private FlashcardDeck deck;
    @FXML
    private TextField textFieldNumberofWords;

    @FXML
    protected void onHelloButtonClick() {
        try {
            int deckLength = Integer.parseInt(textFieldNumberofWords.getText());
            FlashcardController.setDeckLength(deckLength);
            HelloApplication.switchToFlashcardScreen();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}