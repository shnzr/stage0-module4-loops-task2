package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2) {
            int number = 2;
            while (number <= printToInclusive) {
                int divider = 1; int divCount = 0;
                while (divider <= number) {
                    if (number % divider == 0)
                        ++divCount;
                    ++divider;
                }
                if (divCount == 2)
                    System.out.println(number);
                ++number;
            }
        }
    }
}
