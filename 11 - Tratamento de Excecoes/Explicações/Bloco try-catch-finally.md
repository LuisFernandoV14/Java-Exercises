# Bloco `Try-Catch-Finally`

- Serve para o tratamento de exceções.


## Bloco `try`: 
* Contém o código que executa normalmente, e que <i>pode</i> gerar uma exceção.

## Bloco `catch`: 
* Caso o bloco `try` lance uma exceção, o bloco `catch` a captura, nesse caso, será executado o código nesse bloco.
* Caso não seja lançada nenhuma exceção o bloco `catch` não será executado.
* Tem que ser especificado o tipo de exceção a ser tratada (upcasting é permitido).

### Sintaxe: 

    try { 
        <código> 
    } catch (<Tipo da Exceção> <apelido>) {
        <tratamento da exceção>
    }

Importante ressaltar que o número de `catch` para o mesmo `try` é no mínimo 1 e no máximo n. <br>
Entretanto, é possível fazer um `try`sem `catch` desde que o mesmo tenha um bloco `finally`

## Bloco `finally`:
* Vem depois do bloco `catch`, normalmente, mas é possível não usar o `catch` para fazer um bloco `try-finally`
* O bloco `finally` sempre é executado, independente de ter sido lançada uma exceção ou não.

### Sintaxe:

    try { 
        <código> 
    } catch (<Tipo da Exceção> <apelido>) {
        <tratamento da exceção>
    } finally {
        <código>    
    }

#### Obs:
* Normalmente o apelido dado às exceções do bloco `catch` é `e` (ex: catch(`RuntimeException e`))
