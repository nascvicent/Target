public class StringCount {
    public String verificarLetra(String n){
        int quantidade = 0;
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == 'a' || n.charAt(i) == 'A'){
                quantidade++;
            }
        }
        if(quantidade>0){
            return "Sim, a letra A aparece " + quantidade + " vezes na palavra: " + n;
        } else{
            return "A letra A não apareceu.";
        }
    }
}
