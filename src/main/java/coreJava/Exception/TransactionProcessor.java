package coreJava.Exception;

public class TransactionProcessor {

    public static void validateAmount(int amount) throws InvalidAmountException {

            if(amount<0){
                throw new InvalidAmountException("Negative Transaction Not allowed");
            }else if(amount>100000){
                throw new InvalidAmountException("Exceeds Transaction Limit");
            }else{
                System.out.println("correct amount");
            }

    }
    public static void main(String[] args) {
        int[] nums = {10000034,-43,4565};
        for(int i: nums){
            try{
                validateAmount(i);
            } catch (InvalidAmountException e) {
                System.out.println("Error:"+e.getMessage());
            }
        }

    }
}
