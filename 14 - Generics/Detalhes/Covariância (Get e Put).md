#  Covariância

###### Obs: <br> get = pegar >> ler um elemento de um array, List, etc <br> put = colocar >> adicionar um elemento a um array, List, etc

### O príncipio da Covariância se dá quando é permitido realizar a operação get, mas não a put:

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        
        Number X = list.get(0); // Operação get
        lista.add(20); // Operação put

A operação get nesse caso é permitida, a variável X do tipo Number será atribuída corretamente porque o compilador sabe que `list` é somente constituída de classes que extendem Number (Integer, Double, Byte, etc)

Entretanto, a operação put resultaria em erro. O compilador sabe que list é do tipo Number, mas não sabe de qual subclasse específica ou se tem uma subclasse, por isso ele não deixa adicionar 20, um inteiro, há a possibilidade de list ser só do tipo Float, por exemplo.

* Normalmente esse princípio está ligado à palavra "extends"