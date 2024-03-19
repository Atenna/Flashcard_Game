package com.ivankaelde.newproject.model;

public class Word {

    private String word;
    private String translation;
    private double score = 0.0;

    public Word(String word, String translation)  {
        this.word = word;
        this.translation = translation;
        this.score = 0.0;
    }

    public Word(String line) {
        // Read lines from data.txt but ignore line numbers/frequency
        int startIndex = 0;
        while (startIndex < line.length() && Character.isDigit(line.charAt(startIndex))) {
            startIndex++;
        }
        startIndex++; //to remove also the dot
        // Split the remaining part of the line based on one or more whitespace characters
        String[] parts = line.substring(startIndex).trim().split("\\s+", 2);
        this.word = parts[0].trim();
        this.translation = parts[1].trim();
    }

    public String getText() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
