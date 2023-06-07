public class Main {
    /** main function **/
    public static void main(String[] args) {
        String malesFile = "Gale_Shapley_Algo/males.txt";
        String femalesFile = "Gale_Shapley_Algo/females.txt";

        Parser p = new Parser(malesFile, femalesFile);

        System.out.println("Gale Shapley Marriage Algorithm\n");

        /** list of men **/
        String[] m = p.listOfMen();
        /** list of women **/
        String[] w = p.listOfWomen();

        /** men preference **/
        String[][] mp = p.maleToFemalePreferences();
        /** women preference **/
        String[][] wp = p.femaleToMalePreferences();

        GSA gs = new GSA(m, w, mp, wp);
    }
}