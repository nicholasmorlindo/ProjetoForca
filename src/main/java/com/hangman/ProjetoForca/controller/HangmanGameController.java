package com.hangman.ProjetoForca.controller;

import com.hangman.ProjetoForca.response.ResponseAttemptGame;
import com.hangman.ProjetoForca.response.ResponseNewGame;
import com.hangman.ProjetoForca.services.HangmanGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hangman")
public class HangmanGameController {

    @Autowired
    private HangmanGameService hangmanGameService;

    @GetMapping(value = "/new/{newWord}")
    @ResponseStatus(HttpStatus.OK)
    public String newGame(@PathVariable String newWord){

        hangmanGameService.newWord(newWord);
        return "Palavra Cadastrada com sucesso";
    }

    @GetMapping(value = "/play/{newChar:.*}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseAttemptGame> attemptGame(@PathVariable char newChar){

        ResponseAttemptGame returnStatus = hangmanGameService.newAttempt(newChar);
        return ResponseEntity.ok().body(returnStatus);
    }
}
