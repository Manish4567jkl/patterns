class Main {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 5; i >= 1; i--) {
            // Inner loop for printing spaces
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
