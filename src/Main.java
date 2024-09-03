public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Primeira questão: " + fibonacci.fibonacci(0));
        StringCount stringCount = new StringCount();
        System.out.println("Segunda questão : " + stringCount.verificarLetra("TargetA"));
        Terceira terceira = new Terceira();
        System.out.println(terceira.questaoAnalise());
    }
}
