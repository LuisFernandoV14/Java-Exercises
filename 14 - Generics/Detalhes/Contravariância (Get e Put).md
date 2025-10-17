#  Contravariância

###### Obs: <br> get = pegar >> ler um elemento de um array, List, etc <br> put = colocar >> adicionar um elemento a um array, List, etc

### O príncipio da Contravariância se dá quando é permitido realizar a operação put, mas não a get:

        List<Object> objList = new ArrayList<Object>();
        objList.add("Maria");
        objList.add("Alex");

        List<? super Number> list = objList;
        
        // Operação put
        list.add(10);
        list.add(3.14);

        Number X = list.get(0); // Operação get
        

A operação put nesse caso é permitida, indepentende do tipo adicionado ser um número ou não, não resultaria erro, pois qualquer objeto em Java herda da classe Object. Assim como Number herda de Object, String também herda

Entretanto, a operação get resultaria em erro. O compilador sabe que list é do tipo objeto, mas não sabe o tipo específico, pode ser que ele seja uma String ou um Boolean, nesse caso resultaria em erro ao atribuí-lo a um Number.

* Normalmente esse princípio está ligado à palavra "implements"