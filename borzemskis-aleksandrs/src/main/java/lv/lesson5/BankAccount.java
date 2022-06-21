package lv.lesson5;

public class BankAccount {
    private String userAccount;
    private String userPin;
    private double userBalance;
    private double userCredit;
    private double usedCredit;
    private boolean enoughMoney;


    public String getUserPin(){return userPin;}
    public double getUserBalance(){return userBalance;}
    public double getUsedCredit(){return usedCredit;}

    public boolean isEnoughMoney(int value) {
        enoughMoney = (userBalance + userCredit - usedCredit - value) >= 0;
        return enoughMoney;
    }

    public boolean isNoSmallBanknotes(int value) {
        return (value % 10) != 0;
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
        if (isWrongPin(inputPin)) {//Check PIN
            System.out.println("\nWrong PIN!");
        } else if (usedCredit > 0 && value < usedCredit) {//Check if loan bigger than input money
            this.usedCredit = usedCredit - value;
            System.out.println("\nJūs iemaksat kontā: " + value);
        } else if (usedCredit > 0 && usedCredit <= value) {//Check if loan less than input money
            this.userBalance += value - usedCredit;
            usedCredit = 0;
            System.out.println("\nJūs iemaksat kontā: " + value);
        } else {//if we have no loan
            this.userBalance += value;
            System.out.println("\nJūs iemaksat kontā: " + value);
        }
    }

    public void withDraw(int value, String inputPin) {
        isEnoughMoney(value);//we call method to check available money
        if (isWrongPin(inputPin)) {//Check PIN
            System.out.println("\nWrong PIN!");
        }else if(!enoughMoney){//Check available money
            System.out.println("\nThe account does not have enough money");
        }else if(isNoSmallBanknotes(value)){//Check demanded money for available banknotes
            System.out.println("\nWe can issue money in 10, 20, 50 banknotes");
        }else if (userBalance >= value) {//if user balance bigger than demanded money
            this.userBalance -= value;
            System.out.println("\nJūs saņēmat no konta: " + value);
        } else {//if user balance less than demanded money
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
