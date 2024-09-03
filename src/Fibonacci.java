public class Fibonacci {
    public String fibonacci(int n) {
        if (n < 0) {
            return n + " não pertence à Fibonacci.";
        }


        if (n == 0) {
            return "0 pertence à Fibonacci.";
        } else if (n == 1) {
            return "1 pertence à Fibonacci.";
        }


        int a = 0;
        int b = 1;


        for (int i = 2; ; i++) {
            int fib = a + b;

            if (fib == n) {
                return n + " pertence à Fibonacci.";
            }

            if (fib > n) {
                break;
            }

            a = b;
            b = fib;
        }

        return n + " não pertence à Fibonacci.";
    }
}
