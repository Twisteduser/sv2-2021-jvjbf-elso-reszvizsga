package numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number){
        int sum= 0;
        for (int i=1; i<number; i++){
            if (number%i==0){
                sum=sum+i;
            }
        }return number ==sum;
    }
}
