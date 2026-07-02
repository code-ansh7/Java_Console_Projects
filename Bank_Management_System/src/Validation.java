public class Validation {
    
    boolean checkName(String name){//return true when name is valid.
        if(name.trim().isEmpty()){//Invalid Condition of Name.
            System.out.println("Please Enter a Valid Name!");
            return false;
        }
        return true;
    }

    boolean checkAccountNumber(long accNumber){
        int count = 0;
        while(accNumber > 0){
            count++;
            accNumber = accNumber / 10;
        }
        if(count == 10){
            return true;
        }
        System.out.println("Account Number Must be '10' Digits!");
        return false;
    }

    boolean checkPin(int pin){
        if(pin < 1000 || pin > 9999){
            System.out.println("PIN Must have '4' Digits.");
            return false;
        }
        return true;
    }

    boolean checkBalance(int balance){//return false when 
        if(balance <= 0){//Invalid Condition of Bakance.
            System.out.println("Balance Cannot Be '0' or Negative!");
            return false;
         }
        return true;
    }

    boolean checkAmount(int amount){//return false when 
        if(amount <= 0){//Invalid Condition of Bakance.
            System.out.println("Amount Cannot Be '0' or Negative!");
            return false;
         }
        return true;
     }
}
