# Exceções

* Uma exceção é qualquer condição de erro ou comportamento encontrado por um programa <b> em execução </b> 


* Em Java, toda exceção é um objeto herdado da classe:
  * `java.lang.Exception` => O compilador obriga a tratar ou a propagar
  * `java.lang.RunTimeException` => O compilador não obriga a tratar ou a propagar


* Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado

### Hierarquia de exceções em Java

`Throwable` é a classe génerica para todas as exceções
    <ul> A classe `Error` herda de `Throwable`
        <ul>A classe `OutOfMemoryError` herda de `Error` <br> 
            A classe `VirtualMachineError` herda de `Error` 
       </ul> 
    </ul>
    <ul> A classe `Exception` herda de `Throwable`
        <ul>A classe `IOException` herda de `Exception` <br> 
            A classe `RuntimeException` herda de `Exception`  
                <ul>A classe `ÌndexOutOfBoundsException` herda de `RunTimeException` <br>
                    A classe `NullPointerException` herda de `RunTimeException`
                </ul> 
        </ul>
    </ul>

* Toda exceção que vem da classe `Error` o compilador não espera que o programador trate, o contrário das exceções de `Exception`

#### Obs:
* Ser propagada = Ser lançada para a pilha de chamadas de métodos em execução
* Ser capturada = Ser tratada em um bloco de execução `try - catch`
* As exceções que estão nesse arquivo <b>não são todas que existem</b>

