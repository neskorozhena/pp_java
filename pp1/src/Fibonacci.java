//Визначити, які числа серед перших N чисел Фібоначчі закінчуються на задану цифру

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;

/** a class that outputs Fibonacci numbers that end with a number entered by the user
 *
 * @author Karina Neskorozhena
 * @version  1.0.0
* */

public class Fibonacci {

    /** the count of numbers */
    private int lengthFibonacci;

    /** list of Fibonacci numbers*/
    static List<Integer> numbers = new ArrayList<>();

    /** list of Fibonacci numbers*/
    static List<Integer> listForDaniel = new ArrayList<>();


    /** constructor for creating a new object*/
    public Fibonacci() {
        setLengthFibonacci();
    }

    /** the method of entering the count of numbers
     * {@link Fibonacci#lengthFibonacci}
     * */
    public void setLengthFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of length FIBONACCI: ");
        this.lengthFibonacci = scanner.nextInt();
    }

    /** function for getting Fibonacci numbers
     * {@link Fibonacci#numbers}
     * */
    public void FibonacciNumbers() {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(this.lengthFibonacci)
                .map(t -> t[0])
                .forEach(x -> numbers.add(x));
    }

    /** function to find the number of digits present in the number n
     * @param n: int
     * */
    public int getLengthOfNumber(int n)
    {
        int count = 0;
        while(n != 0)
        {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }

    /** function to get first numbers
     * @param num: int
     * @param len: int
     * */
    static int getFirst (int num, int len) {
        if(num/(10 * len) == 0)
            return num;
        return getFirst(num/10, len);

    }


    /** function to find Fibonacci numbers for Daniel
     * @param firstNumber: int
     * @param secondNumber: int
     * {@link Fibonacci#listForDaniel}
     * */
    public void findNumbersForDaniel(int firstNumber, int secondNumber) {

        for (Integer n : numbers) {
            boolean isTrue = n % (10 *  getLengthOfNumber(secondNumber)) == secondNumber ||
                    getFirst(n, getLengthOfNumber(firstNumber)) == firstNumber;
            if (isTrue) {
                listForDaniel.add(n);
            }
        }

        for (Integer n : listForDaniel) {
            System.out.println(n);
        }
    }
}
