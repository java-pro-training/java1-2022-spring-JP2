package lv.lu.training.lesson5.uzdevums2;

public class BankAccount {

    private String accountNumber;
    private String pinCode;
    private double creditLimit;
    private double usedCredit;
    private double debitBalance;
    boolean isPinCorrect;
    boolean isEnoughMoney;
 //   private double accountBalance;


    public BankAccount (String accountNumber, String pinCode,double creditLimit,
                        double usedCredit, double debitBalance){
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
        this.debitBalance = debitBalance;
    }

    public BankAccount(){
        this.accountNumber = "UNKNOWN";
        this.pinCode = "0000";
        this.creditLimit = 200.00;
        this.usedCredit = 0.00;
        this.debitBalance = 0.00;
    }

    public void setAccountNumber(String accountNumber){this.accountNumber=accountNumber;}
    public void setPinCode(String pinCode){this.pinCode=pinCode;}
    public void setDebitBalance(double debitBalance){this.debitBalance=debitBalance;}
    public void setUsedCredit(double usedCredit){this.usedCredit=usedCredit;}

    public String getAccountNumber(){return accountNumber;}
    public double getUsedCredit(){return usedCredit;}
    public double getDebitBalance(){return debitBalance;}
    public double getAccountBalance(){return (debitBalance-usedCredit);}

    public void checkPinCode(String pinCode){
        isPinCorrect=this.pinCode.equals(pinCode);
    }

    public void checkAvailableFunds(double amount){
        double availableAmount = this.debitBalance + (this.creditLimit-this.usedCredit);
        isEnoughMoney = (availableAmount - amount)>0.001;
    }

    public void topUp(double amount, String pinCode){
        if (isPinCorrect){
            if (usedCredit>0){
                if(amount>=usedCredit){
                    debitBalance += (amount-usedCredit);
                    usedCredit = 0;
                }else{
                    usedCredit -= amount;
                }
            }else{
                debitBalance += amount;
            }
        } else {
            System.out.println("Ievadītais PIN ir nepareizs.");
            System.out.println("Mēģiniet vēlreiz!");
        }

    }

    public void withdraw(double amount, String pinCode){
        if (isPinCorrect){
            checkAvailableFunds(amount);
            if (amount>=debitBalance){
                if (isEnoughMoney){
                    usedCredit += (amount-debitBalance);
                    debitBalance = 0;
                }else{
                    System.out.println("Kontā nepietiek līdzekļu naudas izņemšanai!");
                    System.out.println("Pieejamā summa naudas izņemšanai: "+(this.debitBalance + (this.creditLimit-this.usedCredit)));
                }
            }else{
                debitBalance -= amount;
            }
        }else{
            System.out.println("Ievadītais PIN ir nepareizs.");
            System.out.println("Mēģiniet vēlreiz!");
        }

    }





}
