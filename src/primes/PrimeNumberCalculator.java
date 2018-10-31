package primes;

/**
 * prime calculator class
 *
 * @author Gabe Walsh
 */
public class PrimeNumberCalculator {

    /**
     * a method to check if something is prime
     * uses the square root of the number to check if prime
     * if a number
     *
     * @return
     */
    public static boolean isPrime(double num)
    {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }
    /**
     * a method to get the number of primes between 0 and a number
     * @param number
     * @return
     */

   public static double numberOfPrimes(double number) {
        double counter = 0;
        for (double i = 0; i <= number; i++) {
            if (isPrime(i)) {
                System.out.printf("number%d is prime\n counter is%d ",i,counter);
                counter = counter + 1;
                System.out.printf("\nis prime %.2f returns ture",i);
            }
        }
        return counter;
    }





public static String uniquePrimeFactorized(int number){
       for (int i=2;i<number; i++){

       }
        return"hi";
        }
        }

        /*python testing
        * def uniquePrimes(number):
    factors = "";
    for i  in range(2,number):
        while number % i == 0:
            factors += str(i) + " ";
            number = number / i;


        if number > 2:
            factors += " ";

    return factors;


print(uniquePrimes(49))*/