package school.mjc.stage0.loops.task3;

public class RangeSum {
    int sum = 0;
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        for(int i = firstBoarder; i <= secondBoarder; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
