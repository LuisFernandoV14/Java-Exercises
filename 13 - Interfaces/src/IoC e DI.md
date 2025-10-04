# Inversão de Dependência (IoC - Inversion of Control)

É um princípio de design onde a responsabilidade de criar e gerenciar objetos não fica com a própria classe, mas sim com um container ou framework externo.
* A classe apenas declara o que precisa e não se preocupa com como o objeto é criado.

###  Exemplo sem IoC:

    public class Servico {
        private Repositorio repo = new Repositorio(); // acoplamento forte
    }

###  Exemplo com IoC:
    public class Servico {
        private Repositorio repo;

        public Servico(Repositorio repo) { // o container passa a dependência
            this.repo = repo;
        }
    }

No caso com IoC, a classe define o atributo repo, da classe Repositorio, mas não se preocupa de que jeito ele é instanciado. <br>

Essa "falta de preocupação" abre possibilidade para upcasting. Caso seja passado como parâmetro uma classe que `extende` ou `implementa` Repositorio, não resultaria em erro, seria um sinal de um código com alta flexibilidade.

# Injeção de Dependência (DI - Dependency Injection)
É a forma prática de implementar IoC. Em vez da classe criar as suas dependências, elas são <b> injetadas </b> de fora (pelo construtor, método ou atributo)
* Pode ser feito manualmente ou por frameworks (Spring, CDI, Jakarta EE).
* Isso reduz acoplamento e facilita testes unitários.

### Assim seria na classe:

    public class Servico {
        private final Repositorio repo;

    // Dependência é injetada no construtor
        public Servico(Repositorio repo) {
            this.repo = repo;
        }

        public void salvar(String dado) {
            repo.salvar(dado);
        }
    }

### Assim seria na main:

    public class Main {
        public static void main(String[] args) {
            Repositorio repo = new Repositorio();
            Servico servico = new Servico(repo); // injeção manual
            servico.salvar("Teste");
        }
    }
