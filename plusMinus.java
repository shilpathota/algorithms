import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.partitioningBy;


class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int total=arr.size();
        Map<Boolean,List<Integer>> positiveFiler = arr.stream().collect(partitioningBy(x->x>0));
        int positive = positiveFiler.get(true).size();
        Map<Boolean,List<Integer>> zeroFiler = positiveFiler.get(false).stream().collect(partitioningBy(x->x==0));
        int zero = zeroFiler.get(true).size();
        int negative =  zeroFiler.get(false).size();
        System.out.println(String.format("%.6f", (double) positive / total)); 
        System.out.println(String.format("%.6f", (double) negative / total)); 
System.out.println(String.format("%.6f", (double) zero / total));  

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
