import java.util.*;

public class Match {

    public Set<HashMap<String, String>> stableMatch;

    public Parser p;

    public Match(String males, String females) {
        p = new Parser(males, females);

        stableMatch = new HashSet<>();
    }

    // choose the most favorable person
    public String picktopChoice(String name, Map<String, ArrayList<String>> m) {
        if (m.get(name) == null) {
            return null;
        }

        // m.get(name) gives this person's list in order of preferance (most --> least)
        return m.get(name).get(0);
    }

    public void findMatch(String name) {
        String maleFemaleFav = picktopChoice(name, p.malesMap);
        String femaleMaleFav = picktopChoice(maleFemaleFav, p.femalesMap);

        if (maleFemaleFav == null || femaleMaleFav == null) {
            return;
        }

        // found match!!!
        if (maleFemaleFav.compareTo(femaleMaleFav) == 0) {
            HashMap<String, String> matchMap = new HashMap<>();
            matchMap.put(maleFemaleFav, femaleMaleFav);
            stableMatch.add(matchMap);

            // to make it more efficient
            p.malesMap.remove(maleFemaleFav);
            for (String str : p.malesMap.get(name)) {
            p.femalesMap.remove(femaleMaleFav);
        }

        //  check for possible update of match
        for (HashMap<String, String> m : stableMatch) {
            if (!m.containsKey(femaleMaleFav)) {    // if this female has not been asked
                HashMap<String, String> matchMap = new HashMap<>();
                matchMap.put(maleFemaleFav, femaleMaleFav);
                stableMatch.add(matchMap);
            }
        }
    }
}
