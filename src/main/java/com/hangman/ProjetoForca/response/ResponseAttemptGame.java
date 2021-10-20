package com.hangman.ProjetoForca.response;

import java.io.Serializable;
import java.util.HashSet;

public class ResponseAttemptGame implements Serializable {
    private static final long serialVersionUID = 1L;

    private char[] underscoreWord;
    private HashSet<Character> attempts = new HashSet<Character>();
    private String message;

    public ResponseAttemptGame(char[] underscoreWord, HashSet<Character> attempts, String message) {
        this.underscoreWord = underscoreWord;
        this.attempts = attempts;
        this.message = message;
    }
}
