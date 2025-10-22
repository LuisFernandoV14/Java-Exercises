# Map\<K, V>

Também é uma estrutura genérica, mas o Map conta com dois tipos: `Map<K,V>`, sendo eles o tipo chave (`K`) e o tipo valor (`V`)

* É uma coleção de pares chave / valor - Os valores adicionados da coleção são identificados por uma chave
  * Não admite repetições do objeto chave (caso tenha repetições o valor antigo é sobrescrito)
  * Os elementos são indexados pelo objeto chave (não possuem posição)
  * Acesso, inserção e remoção de elementos são rápidos


* Os elementos podem ser de qualquer tipo


* Uso comum: Cookies, local storage, qualquer modelo chave-valor


* Chaves não podem ser do tipo primitivo


* Principais implementações: 
  * HashMap - Mais rápido (operações O(1) em tabela hash) e não ordenado
  * TreeMap - Mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
  * LinkedHashMap - Velocidade intermediária e elementos na ordem em que são adicionados


### Métodos importantes:
* put(key, value)
* remove(key)
* containsKey(key)
* get(key)


* clear()
* size()


* keySet() - Retorna um Set\<K>
* values() - Retorna um Collection\<V>