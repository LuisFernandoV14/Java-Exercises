# Curingas delimitados

### O problema:
* Digamos que eu tenha uma classe `Forma`. Também tenho uma classe `Circulo`que extende `Forma`.
* Por fim, eu tenho um método estático `areaTotal(-parâmetros-)`.


* Eu quero passar uma lista de círculos para descobrir a area total, como eu faria issso?

## Solução 1 (insalubre):

"E se eu definir o método como `areaTotal (ArrayList<Forma> lista)`? Já que `Círculo` é uma classe filha de `Forma` o upcasting deve ser permitido"

        public static double areaTotal(List<Forma> lista) {...}

Sabemos que `List<Object>` não é o supertipo de qualquer tipo de lista, ou seja, passar uma lista de círculos ao chamar o método `areaTotal(ArrayList<Forma> lista)` resultaria em erro de compilação.   

## Solução 2 (insalubre):

"Então, é só eu definir o método como `areaTotal(ArrayList<?> lista)`, desse jeito eu posso passa qualquer lista"

        public static double areaTotal(List<?> lista) {...}

É verdade que passar uma lista de círculos não resultaria em erro de compilação, mas esse padrão de definir métodos não é confiável, e se for necessário implementar um método que adiciona um elemento à lista? Usar um parâmetro com tipo genérico impede isso.

## Solução 3 (correta):

Para resolvermos esse problema usaremos um misto das duas soluções, ficará da seguinte forma:
            
        public static double areaTotal(List<? extends Forma> lista) {...}

Ao escrever os parâmetros assim estamos dizendo pro compilador que aceitamos qualquer lista que tenha um tipo genérico que necessariamente extenda `Forma` ou que seja a própria classe `Forma`
<br> <br> <br>

###### OBSERVAÇÃO HAHAHAH: mesmo usando a terceira solução ainda não é possível usar o .add(). <br> Enquanto eu fazia esse arquivo eu achei que a diferença da solução 2 e 3 era justamente a possibilidade de ter o método .add(). <br> Por isso, aqui fica uma crítica ao professor que não expllicou essa diferença. <br> <br> Estudando, a principal diferença que eu notei foi a integridade do código, trabalhar com um curinga delimitado <i> traça um limite </i> (eu sei, chocante) nos tipos de objetos que você vai usar, te dando maior liberdade para chamar funções ou mexer em atributos e etc.