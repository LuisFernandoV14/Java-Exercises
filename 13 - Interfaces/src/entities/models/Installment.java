package entities.models;

import java.time.LocalDate;

public class Installment extends Contract {

    private LocalDate dueDate;

    public Installment(int number, LocalDate date, double totalValue, LocalDate dueDate) {
        super(number, date, totalValue);
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return dueDate +  " - " + String.format("R$%.2f", totalValue);
    }

}
