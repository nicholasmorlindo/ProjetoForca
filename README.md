# ProjetoForca

Proposta Forca:

- Criar o jogo da forca

  1 - Criar projeto Maven
  2 - Usar Spring boot web
  3 - Possuir classes especializadas
  4 - Possuir 2 rotas:
    GET - .../hangman/new?word=?
    GET - .../hangman/play?letter=?
    
  Exemplo de Response:
  
    {
        "value":"A _ a _ a _ i",
        "attempts":["A",,"i"],
        ...
    }
    
 Pode-se criar mais rotas se achar necessario, diferentes filds para o response e definir de alguma forma o resultado visual do boneco sendo enforcado.
