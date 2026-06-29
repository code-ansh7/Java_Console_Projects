public class Validation {
     
    boolean checkName(String name){
        if(name.trim().isEmpty()){
            System.out.println("Please Enter a Valid Name!\n");
            return false;
        }
        return true;
    }

    boolean checkBalance(int balance){
        if(balance > 0){
            return true;
         }
        System.out.println("Balance Cannot Be '0' or Negative!");
        return false;
    }
}
