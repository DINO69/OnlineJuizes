# OnlineJuizes

## Exercises

## 1 - ModeOfFrequencies

### Link : https://www.codechef.com/problems/MODEFREQ

### Solution : 

## 2 - PALAVRMG - Palavras Ordenadas

### Link : https://br.spoj.com/problems/PALAVRMG/

### Solution : 

1 - Apliquei TDD, criando a class 'PalavrmgTest' primeiro, a primeira ideia foi retornar apenas 'O' para palavras ordenadas e 'N' para palavras n�o ordenadas.

2 - Nas palavras 'a' 'aa' 'Cruz' 'belo' a solu��o j� estava pronta, utilizei stream do java, para converter a palavra [ string ] em uma lista de inteiros, correspondente a cada caracter, percorrir a lista utilizando foreach, verificando se o n�mero � maior que o anterior.

3 - Na palavra 'fiNo' tive que realizar uma altera��o simples, pois agora misturou letras maiusculas e minusculas, a solu��o foi antes de ter a lista de inteiros, eu transformei a palavra inicial em uma string com apenas caracters maiusculos.

4 - Com todos os testes criados e a solu��o funcionando, eu criei o metodo main, que recebe um n�mero, correspondente a quantidade de testes, e depois a cada teste, com a palavra digitada � verificado se a palavra � ou nao ordenada.

5 - Como o retorno exigido da demanda � "palavra: [O|N]" fiz a altera��o necess�ria e criei uma nova class de teste 'PalavrmgParameterizedTest', nessa class eu utilei testes parametriz�veis, pois facilitou a altera��o do retorno e tamb�m a cria��o de novos exemplos 