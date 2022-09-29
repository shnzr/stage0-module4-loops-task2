package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int start = 0;
        while (start <= printToInclusive) {
            int x = 1, result = 1;
            if (start == 0 || start == 1)
                System.out.println(1);
            else {
                while (x <= start) {
                    result *= x;
                    ++x;
                }
                System.out.println(result);
            }
            ++start;
        }
    }
}
