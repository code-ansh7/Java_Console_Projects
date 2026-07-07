public class Validation {

    boolean checkCategory(String category){
        if(category.trim().isEmpty()){
            System.out.println("Category Cannot Be Empty!");
            return false;
        }
        return true;
    }

    boolean checkDescription(String description){
        if(description.trim().isEmpty()){
            System.out.println("Description Cannot Be Empty!");
            return false;
        }
        return true;
    }

    boolean checkAmount(int amount){
        if(amount <= 0){
            System.out.println("Amount Must Be Greater Than 0!");
            return false;
        }
        return true;
    }

    boolean checkDate(String date){
        if(date.trim().isEmpty()){
            System.out.println("Date Cannot Be Empty!");
            return false;
        }
        return true;
    }


}