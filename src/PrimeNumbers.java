//Matriculation: 7219292
//Bekzod Nazarov
public class PrimeNumbers {
    public static void main(String[] args) {
        int maxLimit = 50;
        outer:
        for (int num = 2; num <= maxLimit; num++) {
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    continue outer;
                }
            }
            System.out.println(num);
        }
    }
}
