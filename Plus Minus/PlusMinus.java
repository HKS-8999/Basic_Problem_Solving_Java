/**
 * PlusMinus
 */
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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float positive_count = 0;
        float negative_count = 0;
        float zeros = 0;
        float positive_propotion = 0;
        float negative_propotion = 0;
        float zero_propotion = 0;
        float n = arr.size();
    // Write your code here
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > 0){
                positive_count++;
            }
            else if(arr.get(i) < 0){
                negative_count++;
            }
            else{
                zeros++;
            }
        }
        
        positive_propotion = positive_count/n;
        negative_propotion = negative_count/n;
        zero_propotion = zeros/n;
        
        System.out.println(String.format("%.6f", positive_propotion));
        System.out.println(String.format("%.6f", negative_propotion));
        System.out.println(String.format("%.6f", zero_propotion));
        
    }
    

}

public class PlusMinus {
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
