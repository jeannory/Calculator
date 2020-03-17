package services;

public class CalculatorImpl {

    /**
     * primary number
     * if has only 2 divisors
     * composite number
     * if has more than 2 divisors
     */

    public int getPrimaryNumberSum(final int number){
        if(number <=1){
            return 0;
        }
        int i = 1;
        int sum = 0;
        while(i <= (number + 1)){
            if(isPrimaryNumber(i)){
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public boolean isPrimaryNumber(final int number) {
        if(number <=1){
            return false;
        }
        boolean isPrimary = true;
        int count = 0;
        int i = 1;
        while (i <= (number + 1)) {
            int result = number % i;
            if (result == 0) {
                count +=1;
            }
            if (count > 2){
                isPrimary = false;
                break;
            }
            i++;
        }
        return isPrimary;
    }
}
