import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    public Map<String, ArrayList<String>> malesMap;

    public Map<String, ArrayList<String>> femalesMap;

    public ArrayList<String> malesList;

    public ArrayList<String> femalesList;

    public Parser(String males, String females) {

        // converts the males listing files
        In reader1 = new In(males);

        malesMap = new HashMap<>();

        malesList = new ArrayList<>();

        while (!reader1.isEmpty()) {
            // separated by comma and a space: A, B, C --> ["A", "B", "C"]
            String[] wordsArray1 = reader1.readLine().split(", ");

            ArrayList<String> arr1 = new ArrayList<>();

            for (int i = 1; i < wordsArray1.length; i++) {
                arr1.add(wordsArray1[i]);

            }

            malesList.add(wordsArray1[0]);

            malesMap.put(wordsArray1[0], arr1);
        }

        // converts the males listing files
        In reader2 = new In(females);

        femalesMap = new HashMap<>();

        femalesList = new ArrayList<>();

        while (!reader2.isEmpty()) {
            // separated by comma and a space: A, B, C --> ["A", "B", "C"]
            String[] wordsArray2 = reader2.readLine().split(", ");

            ArrayList<String> arr2 = new ArrayList<>();

            for (int i = 1; i < wordsArray2.length; i++) {
                arr2.add(wordsArray2[i]);
            }

            femalesList.add(wordsArray2[0]);

            femalesMap.put(wordsArray2[0], arr2);
        }

    }

    public String[] listOfMen() {
        String[] men = new String[5];
        return malesList.toArray(men);
    }

    public String[] listOfWomen() {
        String[] women = new String[5];
        return femalesList.toArray(women);
    }

    // Map<String, ArrayList<String>>
    public String[][] maleToFemalePreferences() {
        String[][] twoDArrayMale = new String[5][5];

        int iteration = 0;
        for (String str : listOfMen()) {
            twoDArrayMale[iteration] = malesMap.get(str).toArray(new String[0]);
            iteration++;
        }

        return twoDArrayMale;
    }

    public String[][] femaleToMalePreferences() {
        String[][] twoDArrayFemale = new String[5][5];

        int iteration = 0;
        for (String str : listOfWomen()) {
            twoDArrayFemale[iteration] = femalesMap.get(str).toArray(new String[0]);
            iteration++;
        }

        return twoDArrayFemale;
    }
}
