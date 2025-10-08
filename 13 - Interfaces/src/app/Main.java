package app;

import entities.models.Contract;
import entities.models.Installment;
import entities.services.ContractService;
import entities.services.OnlinePaymentService;
import entities.services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");

        System.out.print("Number: ");
        int num = sc.nextInt(); sc.nextLine();

        System.out.print("Date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Value: ");
        double value = sc.nextDouble(); sc.nextLine();

        System.out.print("How many months paying it?: ");
        int months = sc.nextInt(); sc.nextLine();

        ContractService contractService = new ContractService(new PaypalService());

        ArrayList<Installment> installments = contractService.processContract(new Contract(num, date, value), months);

        System.out.println();
        System.out.println("Installments to pay: ");
        for (Installment installment : installments) {
            System.out.println(installment.toString());
        }

        sc.close();

    }

}
