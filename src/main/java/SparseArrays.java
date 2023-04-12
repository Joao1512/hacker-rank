import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class SparseArrays {
    /* 
        There is a collection of input strings and a collection of query strings.
        For each query string, determine how many times it occurs in the list of input strings.
        Return an array of the results.
        Ex:
         stringList: {"aba", "baba", "aba", "xzxb"}
         queries: {"aba", "xzxb", "ab"};
         output expected: [2, 1, 0];
    */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> myHash = new HashMap<>();

        // A Hash terá como chave a String, e o valor dela representa sua qntd. de ocorrências. Ex: "baba": 1;
        for (String str: stringList) {
            myHash.put(str, myHash.getOrDefault(str, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (String query: queries) {
            // Pede a Hash um valor buscado através da chave. A chave é a string da query.
            // Ex: myHash.get("baba") => 1
            res.add(myHash.getOrDefault(query, 0));
        }

        return res;
    }

    public static void main(String arg[]) {
        //Exemplo de entrada.
        List<String> stringList = Arrays.asList(new String[]{"aba", "baba", "aba", "xzxb"});
        List<String> queries = Arrays.asList(new String[]{"aba", "xzxb", "ab"});

        System.out.println(matchingStrings(stringList, queries));
    }
}
