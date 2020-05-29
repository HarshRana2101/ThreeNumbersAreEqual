public class Main {
    public static void main(String[] args) {

        System.out.println(IntEqualityPrinter(1, 2, 1));
    }


    private static String IntEqualityPrinter(int Number1, int Number2, int Number3) {
        if (Number1 < 0 && Number2 < 0 && Number3 < 0) {
            return "Invalid Value";
        } else if (Number1 == Number2 && Number1 == Number3 && Number2 == Number3) {
            return "All numbers are Equal";
        }
        return "All numbers are different";
    }
}
