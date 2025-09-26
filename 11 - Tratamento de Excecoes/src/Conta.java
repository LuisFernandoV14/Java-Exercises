import java.util.Scanner;

public class Conta {

    private Integer numero;
    private String usuario;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String usuario, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.usuario = usuario;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }


    public void deposito(Double quantidade) {
        this.saldo += quantidade;
        System.out.print("Depósito realizado com sucesso, ");
        System.out.printf("saldo atual: R$%.2f\n", this.saldo);
    }

    public void saque(Double quantidade) throws IllegalArgumentException {

       if (saldo < quantidade) {
           throw new  IllegalArgumentException("Saldo insuficiente");
       }

       if (quantidade > limiteSaque) {
           throw new  IllegalArgumentException("Limite de saque insuficiente");
       }

       this.saldo -= quantidade;
       System.out.print("\nSaque realizado com sucesso, ");
       System.out.printf("saldo atual: R$%.2f \n", this.saldo);
    }

    public static Conta construirConta() {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite as informações da conta");

        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpar buffer

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); // Limpar buffer

        System.out.print("Limite de saque: ");
        double limite = sc.nextDouble();
        sc.nextLine(); // Limpar buffer

        return new Conta(numero, usuario, saldo, limite);
    }

}
