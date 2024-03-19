package com.ivankaelde.newproject.model;

import com.ivankaelde.newproject.controller.FlashcardController;

import java.util.EmptyStackException;
import java.util.Stack;


public class FlashcardDeck {

    //private ArrayList<Flashcard> deck;
    private Stack<Flashcard> deck;
    private int deckLength;

    public void setDeckLength(int deckLength) {
        this.deckLength = deckLength;
    }

    public int getDeckLength() {
        return deckLength;
    }

    public FlashcardDeck(int deckLength) {
        this.deck = new Stack<>();
        this.deckLength = deckLength;

        String word = "";
        String translation = "";
        String line = "";
        Word newWord;
        for (int i = 0; i < deckLength; i++) {
            line = FlashcardController.getRandomDictionaryLine();
            newWord = new Word(line);
            this.deck.add(new Flashcard(newWord));
        }

//        Word word2 = new Word("dom", "das Hause");
//        Word word3 = new Word("mobil", "das Handy");
//        Word word4 = new Word("slnko", "die Sonne");
//        Word word5 = new Word("lampa", "die lampe");
//        Word word1 = new Word("jablko", "der Apfel");
//
//        this.deck.add(new Flashcard(word1));
//        this.deck.add(new Flashcard(word2));
//        this.deck.add(new Flashcard(word4));
//        this.deck.add(new Flashcard(word5));
//        this.deck.add(new Flashcard(word3));
    }

    private void fillDeckWithFlashcards() {

    }

    public Word getWord() {
        return deck.pop().getWord();
    }

    public Flashcard getFlashcard() {
        try {
            return deck.pop();
        } catch (EmptyStackException ex) {
            return null;
        }
  }


}
