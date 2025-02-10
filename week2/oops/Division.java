class Division {
    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        int quotient = 0, remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
    }
}
