package com.hangman.ProjetoForca.services;

import com.hangman.ProjetoForca.domain.Word;
import com.hangman.ProjetoForca.response.ResponseAttemptGame;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class HangmanGameService {

    private Word newWord;

    public void newWord(String word) {

        this.newWord = new Word(word);
    }



    public ResponseAttemptGame newAttempt(char newChar){

        if (newWord.getAttempts().equals(newChar)){
            return new ResponseAttemptGame(this.newWord.getUnderscoreWord(), this.newWord.getAttempts(), "Essa letra ja foi utilizada.");
        }

        newWord.setAttempts(newChar);

        if (this.newWord.getWord().indexOf(newChar) < 0){
            return new ResponseAttemptGame(this.newWord.getUnderscoreWord(), this.newWord.getAttempts(), "Nao existe essa letra na palavra");
        }

        newWord.setUnderscoreWord(newChar);

        return new ResponseAttemptGame(this.newWord.getUnderscoreWord(), this.newWord.getAttempts(), "Existe essa letra na palavra.");
    }
}
