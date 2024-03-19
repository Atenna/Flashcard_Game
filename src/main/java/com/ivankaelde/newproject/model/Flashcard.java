package com.ivankaelde.newproject.model;

public class Flashcard {
    private Word word;
    private String exampleSentence;

    public Flashcard(Word word, String exampleSentence) {
        this.word = word;
        this.exampleSentence = exampleSentence;
    }

    public Flashcard(Word word) {
        this.word = word;
        this.exampleSentence = "";
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String getExampleSentence() {
        return exampleSentence;
    }

    public void setExampleSentence(String exampleSentence) {
        this.exampleSentence = exampleSentence;
    }
}
