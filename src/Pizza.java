public class Pizza {
    String nome;
    Double valor;

    boolean borda;

    public Pizza(String nome, Double valor, boolean borda){
        this.nome = nome;
        this.valor = calculaValor(borda, valor);
        this.borda = borda;
    }

    public Double calculaValor (boolean borda, Double valor) {
        if(borda == true){
            valor += 5;
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }

}
