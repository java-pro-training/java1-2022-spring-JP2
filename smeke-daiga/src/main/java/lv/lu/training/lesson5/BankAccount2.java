package lv.lu.training.lesson5;

public class BankAccount2 {
    //Izveidojam klasi bankas kontam ar nosaukumu BankAccount

        private String accountNumber;
        private String pinCode;
        private double debit;
        private double creditLimit;
        private double usedCredit;
        private boolean isPinCodeValid;

        //Klases konstruktors
    public BankAccount2(String accountNumber, String pinCode, double debit, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debit = debit;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;

    }


    //Metode pin parbaudei

    //1. Get pin code
    public String pinCode() {
        return pinCode;
    }

    //2. Compare with entered pin code
    public void enterPinCode(String pinCode) {
        isPinCodeValid = this.pinCode.equals(pinCode);
    }

    //Metode naudas iznemsanai
    public void whitDraw(double value) {
        if (value <= debit)
            debit -= value;
        else if (value <= debit + creditLimit - usedCredit){
            usedCredit += (value - debit);
            debit = 0;
        }
        else
            System.out.println("The transaction cannot be performed. Credit limit will be exceeded.");

    }

    //Metode naudas pievienosanai
    public void topUp(double value) {
        if (usedCredit > 0 && value <= usedCredit) {
            usedCredit -= value;
        }
        else if (usedCredit > 0 && value > usedCredit) {
            debit = debit + value - usedCredit;
            usedCredit = 0;
        }
        else
            debit += value;
    }

    @Override
    public String toString() {
        return  "Debeta bilance  = " + debit + "\r\n" +
                "Kredīta limits = " + creditLimit + "\r\n" +
                "Izmantotais kredīts = " + usedCredit;
    }
}
