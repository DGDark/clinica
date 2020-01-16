package CadastroPat;

public class Pet {
    String nome;
    String especie;
    String raca;
    int idade;
    String cor;
    Responsavel dono;
    String tipocuidado;

    public Pet(String nome, String especie, String raca, int idade, String cor, Responsavel dono, String tipocuidado) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.tipocuidado = tipocuidado;
    }
}

