public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(createLine("*","*","*","*","*","   ","*","*","*","*","*","   ","*","*","*","*","*","   ","*","*","*","*","*"));
        System.out.println(createLine("*","       ","*","   ","*","       ","*","   ","*","       ","*","   ","*","       ","*"));
        System.out.println(createLine("*","       ","*","   ","*","       ","*","   ","*","       ","*","   ","*","       ","*"));
        System.out.println(createLine("*","       ","*","   ","*","*","*","*","*","   ","*","*","*","*","*","   ","*","*","*","*","*"));
        System.out.println(createLine("*","       ","*","   ","*","       ","   ","*","       ","   ","*","       ","*"));
        System.out.println(createLine("*","       ","*","   ","*","       ","   ","*","       ","   ","*","       ","*"));
        System.out.println(createLine("*","*","*","*","*","   ","*","*","*","*","*","   ","*","       ","   ","*","*","*","*","*"));
    }

    // Reusable method using String.join()
    public static String createLine(String... parts) {
        return String.join("", parts);
    }
}
