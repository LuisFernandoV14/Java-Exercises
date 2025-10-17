# Generics
* Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:
  * Reuso
  * Type Safety
  * Performance
  

* Uso comum: coleções

        List<String> list = new ArrayList<>();
        list.add("Maria");
        String name = lista.get(0);
        // Nesse caso, "String" ocupa o espaço do tipo genérico
 

* Mesmo que o uso comum seja em coleção, é possível criar um método que retorna um tipo genérico:

        public static <T> T max(List<T> list) {...}

    * O método acima é um método de tipo genérico e de nome "max", que retorna um tipo genérico.
    * Por que tem dois T?
      * O primeiro, "\<T>", é para declarar o tipo genérico, sem ele o compilador não reconhece T como um tipo
      * O segundo, "T", é para definir o tipo de retorno da função, funcionando como um "void", por exemplo.
      
## Generics são invariantes

List\<Object> não é o supertipo de qualquer tipo de lista, tentar fazer um upcasting ou um downcasting resulta em erro de compilação

O supertipo de qualquer lista é List\<?>. O "?" representa um tipo curinga. É possível fazer upcasting caso uma ArayList seja declarada com `ArrayList<?> list = new ArayList<Objext>();`

### OBS: 
Para tipos curinga: É possível criar uma função que recebe uma ArrayList\<?> ou uma List<?> como parâmetro, nesse caso, qualquer chamada de função que passe qualquer tipo de ArrayList<> funcionaria, entretanto, não é possível adicionar elementos numa ArrayList de tipo curinga, então o corpo desse método não poderia ter um método .add()

        // Isso funcionaria sem erros de compilação
        public static void printList(List<?> lista) {
            for (Object obj : lista) {
                System.out.println(obj);
            }
        }

        // Isso geraria um erro
        public static void addInList(List<?> lista, Object obj) {
            lista.add(obj);
        }

"Porque eu não posso adicionar?" -> O compilador não sabe se o tipo que seria adicionado no .add() é compatível com a lista fornecida no parâmetro