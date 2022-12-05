package tenis_adri;

public class Tenis {

    String nome;
    String marca;
    String tamanho;
    float preco;

    public Tenis() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Tenis(String nome, String marca, String tamanho, float preco) {
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
    }
}
