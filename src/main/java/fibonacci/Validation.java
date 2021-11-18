package fibonacci;

public class Validation {

    public static void validateInput(int index){
            if(index <= 0)
                throw new IllegalArgumentException("Requested index is less than 1!");
    }
}
