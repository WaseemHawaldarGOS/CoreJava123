package oops.exeptions;

public class ThrowsException {

    public static void main(String[] args) {
        try {
            ThrowsException.arithmeticExceptionOccurence(0);
        }catch(ArithmeticException e){
            System.out.println("Caught in main");
            e.printStackTrace();
        }


    }

    public static void arithmeticExceptionOccurence(int divideBy) throws ArithmeticException{
            System.out.println(1000/divideBy);
    }
}
