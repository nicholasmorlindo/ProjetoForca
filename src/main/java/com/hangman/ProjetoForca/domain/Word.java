package com.hangman.ProjetoForca.domain;

import java.io.Serializable;
import java.util.HashSet;

public class Word implements Serializable {
    private static final long serialVersionUID = 1L;

    private String word;
    private char[] underscoreWord;
    private HashSet<Character> attempts = new HashSet<Character>();

    public Word(String word) {
        this.word = word;
        generateUnderscoreWord(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public char[] getUnderscoreWord() {
        return underscoreWord;
    }

    public void setUnderscoreWord(char underscoreLetter) {
        for (int x = 0; x < this.word.length(); x++){
            if (this.word.toCharArray()[x] == underscoreLetter){
                this.underscoreWord[x] = underscoreLetter;
            }
        }
    }

    public HashSet<Character> getAttempts() {
        return attempts;
    }

    public void setAttempts(char attempt) {
        this.attempts.add(attempt);
    }

    private void generateUnderscoreWord(String word) {
        this.underscoreWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            this.underscoreWord[i] = '_';
        }
    }
}
