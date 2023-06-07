import java.util.*;

public class Match {

    private Set<HashMap> stableMatch;

    public Match(String males, String females) {
        Parser p = new Parser(males, females);
        stableMatch = new HashSet<>();
    }

    public String picktopChoice(String name, Map<String, ArrayList<String>> m) {
        String top = m.get(name).get();
        return top;
    }
}
