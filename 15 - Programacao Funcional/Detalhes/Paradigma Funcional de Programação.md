# Programação Funcional

É um paradigma de programação, assim como programação orientada a objetos. <br>
É baseada no formalismo matemático Cálculo Lambda (Church 1930)

## Comparação:

### Temas:
    
1 - Como se descreve algo a ser computado? <br> <br>
2 - Funções possuem transparência referencial? <br> (resultado sempre igual para os mesmos dados de entrada) <br> <br>
3 - Objetos imutáveis <br> (alterar um vetor, uma variável) <br> <br>
4 - Funções são objetos de primeira ordem? <br> (funções podem ser passadas como parâmetro e retornadas por outras funções) <br> <br>
5 - Expressividade / código conciso <br> <br>
6 - Tipagem dinâmica / inferência de tipos <br> (compilador deduzir o tipo de um objeto) <br>


#### Programação imperativa (C):
1 - Comandos ("Como" - imperativa) <br>
2 - Fraco <br>
3 - Raro <br>
4 - Não <br>
5 - Baixa <br>
6 - Raro <br>

#### Programação Funcional (Java 8+)
1 - Expressões ("O quê" - declarativa) <br>
2 - Forte <br>
3 - Comum <br>
4 - Sim <br>
5 - Alta <br>
6 - Comum

# Bônus - O que é uma expressão Lambda?
* Em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe:

 `list.sort( (p1, p2) -> p1.getPrice().compareTo(p2.getPrice()) );`
