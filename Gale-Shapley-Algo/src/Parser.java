import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    public Map<String, ArrayList<String>> malesMap;

    public Map<String, ArrayList<String>> femalesMap;


    public Parser(String males, String females) {

        // converts the males listing files
        In reader1 = new In(males);

        malesMap = new HashMap<>();

        while (!reader1.isEmpty()) {
            // separated by comma and a space: A, B, C --> ["A", "B", "C"]
            String[] wordsArray1 = reader1.readLine().split(", ");

            ArrayList<String> arr1 = new ArrayList<>();

            for (int i = 1; i < wordsArray1.length; i++) {
                arr1.add(wordsArray1[i]);
            }

            malesMap.put(wordsArray1[0], arr1);
        }

        // converts the males listing files
        In reader2 = new In(females);

        femalesMap = new HashMap<>();

        while (!reader2.isEmpty()) {
            // separated by comma and a space: A, B, C --> ["A", "B", "C"]
            String[] wordsArray2 = reader2.readLine().split(", ");

            ArrayList<String> arr2 = new ArrayList<>();

            for (int i = 1; i < wordsArray2.length; i++) {
                arr2.add(wordsArray2[i]);
            }

            femalesMap.put(wordsArray2[0], arr2);
        }

    }
}
