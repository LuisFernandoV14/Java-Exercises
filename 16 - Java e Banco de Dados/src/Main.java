import db.DB;

public class Main {
    public static void main(String[] args) {
        DB.getConnection();
        DB.select("seller");
        DB.closeConnection();
    }
}

// This project functions as a practice exercise for connecting Java with MySQL through JDBC. I tried to include as many comments in both Portuguese and English to make the code easier to understand. Thank you for showing interest.

// Esse projeto funciona como um exercício de fixação para a conexão do Java com o MySQL através do JDBC, eu tentei deixar tantos comentários em Português como em Inglês para deixar mais amplo o entendimento do código. Obrigado por mostrar interesse.

