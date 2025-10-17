# HashCode e Equals

Ambas são operações da class Object utilizadas para comparar se um objeto é igual a outro


* equals: lento, resposta 100% (não erra)
* hashCode: rápido, porém resposta não é 100% (pequena possibilidade de dar falso positivo)

Tipos comuns (String, Date, Integer, etc.) já possuem implementação para esses métodos. Classes personalizadas precisam de sobreposição

### O que é o hashCode?

Ao usar o método .hashCode() é criado um número inteiro único, existem inúmeras formas de se gerar um número Hash, todas se baseiam em dados, mesmos dados mesmo número. Esse número é o hash code

### O problema com hash code:

O limite de bits de um número inteiro é 32, caso um hash code passe desse limite é possível gerar colisões e inconsistências, gerando, por coincidência, o mesmo código para diferente tipos de dados, resultando em um falso positivo. <br>
Apesar de possível, essa coincidência é muito rara, afinal, cabem 4 bilhões de possibilidades em 32 bits.

### Se existe a possibilidade de dar erro, então por que é usado?

Em resumo, é porque é muito rápido. <br>
Em uma lista com 1 bilhão de entradas, por exemplo, o tempo de execução de um código que usa .equals() com um código que usa .hashCode() seria notavelmente maior.

### Mas

O Ideal é usar ambos, tomando o último exemplo, o ideal seria rodar o programa até o .hashCode() dar positivo (código da entrada que você ta procurando e de uma entrada na lista supostamente iguais) e aí então usa o equals para ter certeza que não é um falso positivo.