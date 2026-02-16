# JAVA 1

## Aula 01

## O que foi aprendido?

- Utilizando o terminal, já dentro da pasta em que guardo os repositórios do github,
  executei o comando: touch Programa.java e assim criei um arquivo com o mesmo nome.

- Naveguei dentro do arquivo criado usando o comando nano e editei pelo terminal a
  fim de dominar o uso de comandos básicos, porém eficientes, do terminal.

## Estrutura Java

- Pela convenção criada na primeira linha do arquivo utilizamos o public, pois ele
  é um modificador de acesso, definindo quem pode enxergar e usar a classe.

- A primeira estrutura a ser criada é a classe, que é a unidade principal para organizar
  códigos em java.

- Então basicamente criei uma classe pública chamada Programa, que é a classe principal, e dentro dela
  criei um método chamado main.

- O método main é o ponto de entrada do programa, ou seja, quando o programa é executado, ele
  chama o método main.

- Foi utilizado o public static, pois o método main é uma função estática, ou seja, não precisa
  de um objeto para ser executado.

- Utilizando a biblioteca System.out.println, podemos imprimir mensagens na tela.

## Compilador

- Para compilar o código feito dentro do Programa.java, utilizamos o comando javac, que é o compilador
  do java.

- Após rodar o camando javac Programa.java, o arquivo Programa.class é gerado.

- Para executar o programa, utilizamos o comando java Programa, que é o interpretador do java.

- Após rodar o comando java Programa, o programa é executado.


## Aula 02

- Não tenha medo de explorar o porque das coisas funcionarem ou não dentro do código, antes de perguntar como funciona determinada estrutura, procure testar.


### Tipos primitivos

- São estruturas que pertencem ao pacote java.lang e são usados para
representar tipos de dados printivos.

- Temos oito tipos primitivos:
Inteiros: byte, short, int, long
Ponto Flutuante: float, double
Caractere: char
Booleano: boolean (Representa verdadeiro ou falso)

- Para seguir os primitivos temos seus conceitos mais atualizados chamados de
wrappers:

byte -> Byte

short -> Short

int -> Integer

long -> Long

float -> Float

double -> Double

char -> Character

boolean -> Boolean

### Desafio

- Criar uma calculadora simples que receba dois números e um operador e retorne o resultado da operação.
