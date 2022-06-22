package lv.lu.training.lesson12;

public class RefactoredAccounting {

    public double calculateMonthlySalary(double yearlySalary, double awards) {
        return (yearlySalary + awards) / 12;
    }

}
