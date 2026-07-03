public class Validation {
    boolean checkCategory(String category){
        if(category.trim().isEmpty()){
            return false;
        }
        return true;
    }

    boolean checkReason(String reason){
        if(reason.trim().isEmpty()){
            return false;
        }
        return true;
    }

    boolean checkAmount(int amount){
        if(amount < 0){
            return false;
        }
        return true;
    }

    boolean checkDate(String date){
        if(date.trim().isEmpty()){
            return false;
        }
        return true;
    }

}
