class PrimeNumber {
    public static void main(String[] args) {
        int num = 10;
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println(num + " is not prime.");
            return;
        }

        // check divisibility
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break; // no need to check further
            }
        }

        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}
