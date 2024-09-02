public class Fibonacci {
    public String fibonacci(int n){
        int[] listaFibo = new int[n + 1];
        boolean pertence = false;

        listaFibo[0] = 0;
        listaFibo[1] = 1;


        for(int i = 2; i <= n; i++){
            listaFibo[i] = listaFibo[i-1] + listaFibo[i-2];
        }


        for(int i = 0; i <= n-1; i++){
            System.out.println(listaFibo[i]);
            if(n == listaFibo[i]){
                pertence = true;
            }
        }


        if(pertence){
            return  n +" pertence à Fibonacci.";
        } else {
            return n+" não pertence à Fibonacci.";
        }
    }
}
