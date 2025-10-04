# Interface

É um tipo que define um conjunto de operações que uma classe deve implementar

A interface estabelece um <b>contrato</b> que a classe deve cumprir.

### Exemplo:

    interface Shape {
        double area();
        double perimeter();
    }

### Para quê interfaces?
* Para criar sistemas com <b>baixo acoplamento</b> e <b>flexíveis</b>
* Funciona bem com upcasting

(A grosso modo, é uma classe abstrata que só tem métodos abstratos)
