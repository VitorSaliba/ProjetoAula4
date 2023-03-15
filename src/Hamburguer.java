public class Hamburguer {
    String nome;
    Double valor;
    boolean artesanal;

    public Hamburguer(String nome, Double valor, boolean artesanal){
        this.nome = nome;
        this.valor = calculaValor(artesanal, valor);
        this.artesanal = artesanal;
    }

    public Double calculaValor (boolean artesanal, Double valor) {
        if(artesanal){
            valor += 8;
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }

}
