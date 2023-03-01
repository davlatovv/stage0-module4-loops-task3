package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        int currentFibonacci = 0;
        System.out.println(firstFibonacci);
        System.out.println(secondFibonacci);
        for (int i = 2; i < lastFibonacci; i++) {
            currentFibonacci = firstFibonacci + secondFibonacci;
            System.out.println(currentFibonacci);
            firstFibonacci = secondFibonacci;
            secondFibonacci = currentFibonacci;
        }
    }
}
