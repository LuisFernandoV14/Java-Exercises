# Listas

Listas são estrutura de dados:
  * Homogêneas, todos os dados tem que ter o mesmo tipo
  * Ordenadas, elementos acessados por meio de posições
  * Iniciam vazias, seus elementos são alocados sobre demanda
  * Cada elemento ocupa um nó (ou nodo) da lista

Tipo (Interface): List 

Classes que implementam: ArrayList, LinkedList, etc

Vantangens:
  * Tamanho variável
  * Facilidade em realizar inserções e deleções
  * (As vantagens da Lista são as desvantagens do vetor)

Desvantagens:
  * Acesso sequencial aos elementos (dependendo de como você implementar uma Lista)

<b> Listas não são classes, são interfaces </b> <br>
   `List X = new List()` // Isso vai dar erro, não se usa uma interface do mesmo jeito que se usa uma classe


Anotações:
* Não aceitam tipos primitivos, tem que usar a wrapper class (`List<int>` dá erro, mas `List<Integer>` não)
* Para instanciar uma Lista tem que usar uma classe que implemente a interface List
* Existem vários métodos em uma lista, mas eu não irei anotar todos neste arquivo, planejo fazer aplicações usando Listas e caso eu julgue necessário eu explicarei os métodos lá


Exemplos:
* Criando uma lista: <br>
    - `List<String> lista = new ArrayList<>();` -> ArrayList é uma das classes que implementas a interface List.
