# OnlineJuizes

## Exercises

## 1 - ModeOfFrequencies

### Link : https://www.codechef.com/problems/MODEFREQ

### Solution : 

## 2 - PALAVRMG - Palavras Ordenadas

### Link : https://br.spoj.com/problems/PALAVRMG/

### Solution : 

1 - Apliquei TDD, criando a class 'PalavrmgTest' primeiro, a primeira ideia foi retornar apenas 'O' para palavras ordenadas e 'N' para palavras não ordenadas.

2 - Nas palavras 'a' 'aa' 'Cruz' 'belo' a solução já estava pronta, utilizei stream do java, para converter a palavra [ string ] em uma lista de inteiros, correspondente a cada caracter, percorrir a lista utilizando foreach, verificando se o número é maior que o anterior.

3 - Na palavra 'fiNo' tive que realizar uma alteração simples, pois agora misturou letras maiusculas e minusculas, a solução foi antes de ter a lista de inteiros, eu transformei a palavra inicial em uma string com apenas caracters maiusculos.

4 - Com todos os testes criados e a solução funcionando, eu criei o metodo main, que recebe um número, correspondente a quantidade de testes, e depois a cada teste, com a palavra digitada é verificado se a palavra é ou nao ordenada.

5 - Como o retorno exigido da demanda é "palavra: [O|N]" fiz a alteração necessária e criei uma nova class de teste 'PalavrmgParameterizedTest', nessa class eu utilei testes parametrizáveis, pois facilitou a alteração do retorno e também a criação de novos exemplos 