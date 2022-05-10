package lv.lesson5;

public class BankAccount {
    private String userAccount;
    private String userPin;
    private double userBalance;
    private double userCredit;
    private double usedCredit;
    private boolean isEnoughMoney;


    public String getUserPin(){return userPin;}

    public boolean isEnoughMoney(int value) {
        isEnoughMoney = (userBalance + userCredit - usedCredit - value) >= 0;
        return isEnoughMoney;
    }

    public boolean isNoBanknotes(int value) {
        boolean banknotes = (value % 10) != 0;
        return banknotes;
    }

    public BankAccount(String userAccount, String userPin, double userBalance, double userCredit) {
        this.userAccount = userAccount;
        this.userPin = userPin;
        this.userBalance = userBalance;
        this.userCredit = userCredit;
        usedCredit = 0;
    }

    public boolean isWrongPin(String value) {
        return !userPin.equals(value);
    }

    public void clearBalance() {
        userBalance = 0;
    }

    public void topUp(double value, String inputPin) {
        if (isWrongPin(inputPin)) {
            System.out.println("\nWrong PIN!");
        } else if (usedCredit > 0 && usedCredit > value) {
            this.usedCredit = usedCredit - value;
            System.out.println("\nJūs iemaksat kontā: " + value);
        } else if (usedCredit > 0 && usedCredit <= value) {
            this.userBalance += value - usedCredit;
            usedCredit = 0;
            System.out.println("\nJūs iemaksat kontā: " + value);
        } else {
            this.userBalance += value;
            System.out.println("\nJūs iemaksat kontā: " + value);
        }
    }

    public void withDraw(int value, String inputPin) {
        isEnoughMoney(value);
        if (isWrongPin(inputPin)) {
            System.out.println("\nWrong PIN!");
        }else if(!isEnoughMoney){
            System.out.println("\nThe account does not have enough money");
        }else if(isNoBanknotes(value)){
            System.out.println("\nWe can issue money in 10, 20, 50 banknotes");
        }else if (userBalance >= value) {
            this.userBalance -= value;
            System.out.println("\nJūs saņēmat no konta: " + value);
        } else {
            this.usedCredit += value - userBalance;
            clearBalance();
            System.out.println("\nJūs saņēmat no konta: " + value);
        }
    }

    @Override
    public String toString() {
        return "Konts numurs:" + userAccount +
                "\nDebeta bilance = " + userBalance +
                "\nKredita limits = " + userCredit +
                "\nIzmantots kredits = " + usedCredit;
    }
    @Override
    public boolean equals(Object object){
        if (object != null && object.getClass() ==this.getClass()){
            return this == object ||
                    this.userPin.equals(((BankAccount) object).getUserPin());
        }else {
            return false;
        }
    }

}
