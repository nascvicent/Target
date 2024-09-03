public class Fibonacci {
    public String fibonacci(int n) {
        if (n < 0) {
            return n + " não pertence à Fibonacci.";
        }


        if (n == 0) {
            return "0 pertence";
        } else if (n == 1) {
            return "1 pertence";
        }


        int[] listaFibo = new int[n + 1];
        listaFibo[0] = 0;
        listaFibo[1] = 1;


        for (int i = 2; i <= n; i++) {
            listaFibo[i] = listaFibo[i - 1] + listaFibo[i - 2];
        }


        boolean pertence = false;
        for (int i = 0; i <= n; i++) {
            System.out.println(listaFibo[i]);
            if (n == listaFibo[i]) {
                pertence = true;
                break;
            }
        }

        if (pertence) {
            return n + " pertence à Fibonacci.";
        } else {
            return n + " não pertence à Fibonacci.";
        }
    }
}
