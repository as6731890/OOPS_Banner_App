featurs/UC4-array-and-loops
public class OOPSArray{
    public static void main(String[] args) {

        String[] lines = {
            " ***     ***     *****   ***** ",
			
            "*   *   *   *    *    *  *     ",
			
            "*   *   *   *    *    *  *     ",
			
            "*   *   *   *    *****   ***** ",
			
            "*   *   *   *    *           * ",
			
            "*   *   *   *    *           * ",
			
            " ***     ***     *       ***** "
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

features/UC3-use-string-join
/*
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * Uses String.join() for better memory efficiency
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " *** ", " *** ", " **** ", " *****"));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*   *", "*"));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*   *", "*"));

        System.out.println(String.join(" ",
                "*   *", "*   *", "**** ", " *****"));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*    ", "     *"));

        System.out.println(String.join(" ",
                "*   *", "*   *", "*    ", "     *"));

        System.out.println(String.join(" ",
                " *** ", " *** ", "*    ", " *****"));
    }
public class OOPSBannerApp {

 features/UC2-print-banner
public class OOPSBannerApp {

    public static void main(String[] args) {
        System.out.println("   **   " + "   " + "   **   " + "   " + " **********   " + "   *********");
        System.out.println(" **  ** " + "   " + " **  ** " + "   " + " **      **   " + " **         ");
        System.out.println("*      *" + "   " + "*      *" + "   " + " **      **   " + "*           ");
        System.out.println("*      *" + "   " + "*      *" + "   " + " **      **   " + "*           ");
        System.out.println("*      *" + "   " + "*      *" + "   " + " **********   " + " ********   ");
        System.out.println("*      *" + "   " + "*      *" + "   " + " **********   " + "         ** ");
        System.out.println("*      *" + "   " + "*      *" + "   " + " **           " + "           *");
        System.out.println("*      *" + "   " + "*      *" + "   " + " **           " + "           *");
        System.out.println(" **  ** " + "   " + " **  ** " + "   " + " **           " + "         ** ");
        System.out.println("   **   " + "   " + "   **   " + "   " + " **           " + "*********   ");
    }

    public static void main(String[] args) {
        System.out.println("OOPS");
         main
 main
 main
}
