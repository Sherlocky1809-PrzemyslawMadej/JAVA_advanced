package naukaWlasna;

import java.util.List;
import java.util.stream.StreamSupport;

public class Redus // reduce
 {
     public static void main(String[] args) {
     final Integer sum = List.of(2,5,9,19,14).stream()
             .reduce(0, (currentSum, streamElement) -> currentSum + streamElement);


         System.out.println(sum);

     }
}
