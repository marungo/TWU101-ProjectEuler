package EulerProject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareSum {

    private static int SumOfSquares(int start, int end) {
        return IntStream.range(start, end+1)
                .boxed()
                .map(e -> (int) Math.pow(e,2))
                .collect(Collectors.toList())
                .stream()
                .reduce(0, (x,y)-> x+y);
    }

    private static int SquareOfSums(int start, int end) {
        int sum = IntStream.range(start, end+1)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .reduce(0, (x,y) -> x+y);
        return (int) Math.pow(sum,2);
    }

    public static int DifferenceBetweenSquareOfSumsAndSumOfSquares(int start, int end) {
        int squareOfSums = SquareOfSums(start, end);
        int sumOfSquares = SumOfSquares(start, end);
        return squareOfSums - sumOfSquares;
    }

}
