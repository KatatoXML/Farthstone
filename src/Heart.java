public class Heart {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        int n = 9;
        System.out.println("\n" + ANSI_RED
                + "For the record, I am still single ;(. \n(Please input your own message unless you want to look at your own misery)."
                + ANSI_RESET + "\n");
        for (int i = -3 * n / 2; i <= n; i++) {
            for (int j = -3 * n / 2; j <= 3 * n / 2; j++) {
                if ((Math.abs(i) + Math.abs(j) < n)
                        || ((-n / 2 - i) * (-n / 2 - i) + (n / 2 - j) * (n / 2 - j) <= n * n / 2)
                        || ((-n / 2 - i) * (-n / 2 - i) + (-n / 2 - j) * (-n / 2 - j) <= n * n / 2)) {
                    System.out.print(ANSI_RED + "* " + ANSI_RESET);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n\n\n");
    }
}