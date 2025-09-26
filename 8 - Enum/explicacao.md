# Enumerações

* Tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas 

* Em Java, a palavra chave é: enum

Classes que implementam: ArrayList, LinkedList, etc

Vantangens:
* Melhor semântica, código mais legível e auxiliado pelo compilador

Como usar:
* Pimeiro se cria um "enum", em um arquivo diferente da main. Depois cria-se uma classe e dá um atributo pra essa classe com o nome dado ao enum.

Anotações:
* Enumerações são declarados do mesmo jeito que uma classe.
* As classes precisam de um toString() pra rodar um enum;

Exemplos:
* Criando uma enumeração: <br>
    - `public enum OrderStatus { ... }` <br>
    - `public class Order { private OrderStatus order; }`
