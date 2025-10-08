package entities.services;

import entities.models.Contract;
import entities.models.Installment;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContractService {

    private final OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public ArrayList<Installment> processContract(Contract contract, int months) {

        double amount = contract.getTotalValue() / months;

        ArrayList<Installment> installments = new ArrayList<>();

        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            installments.add(new Installment(contract.getNumber(), contract.getDate(), service.renderFee(amount, i), dueDate));
        }

        return installments;

    }



}
