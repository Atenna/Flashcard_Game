package com.ivankaelde.newproject.controller;

import com.ivankaelde.newproject.model.Flashcard;
import com.ivankaelde.newproject.model.FlashcardDeck;
import com.ivankaelde.newproject.model.Word;
import com.ivankaelde.newproject.util.DictionaryHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class FlashcardController {

    @FXML
    private Label wordText;

    @FXML
    private Label translationText;
    @FXML
    private Button incorrectButton;
    @FXML
    private Button flipButton;
    private static FlashcardDeck deck;
    private static List<String> dictionary;
    private int deckLength;

    private Word currentWord;


    @FXML
    public void initialize() throws IOException {
        //deck = new FlashcardDeck();
        DictionaryHandler.loadDictionary();
        dictionary = DictionaryHandler.getDictionaryLines();

        // Set the emoji text programmatically
        incorrectButton.setText("\uD83D\uDE05"); // Smiley face emoji
        //deck = new FlashcardDeck();
    }


    public void onFlipButtonClick(ActionEvent actionEvent) {
        if(currentWord == null) {
            onCorrectButtonClick(actionEvent);
            return;
        }
            String translation = currentWord.getTranslation();
            translationText.setText(translation);
    }

    public int getDeckLength() {
        return deckLength;
    }

    public static void setDeckLength(int deckLength) {

        deck = new FlashcardDeck(deckLength);
    }

    public static String getRandomDictionaryLine() {
        Random random = new Random();
        int randomNumber = random.nextInt(1501);
        String dicLine = dictionary.get(randomNumber);
        return dicLine;
    }

    public void onCorrectButtonClick(ActionEvent actionEvent) {
        Flashcard flashcard = deck.getFlashcard();
        if(flashcard != null) {
            currentWord = flashcard.getWord();
            String text = currentWord.getText();
            wordText.setText(text);
            translationText.setText("");
        } else {
            wordText.setText("You have reviewed all flashcards!");
            flipButton.setText("Review again");
        }
    }
    //generate random new flashcard deck

    //get x words from bottom

    // get all unknown words


}
