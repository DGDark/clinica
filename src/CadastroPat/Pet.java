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

    public enum  TiposCuiodado{
        BanhoETosa,
        Vcina,
        Fisioterapia
    }

    public String retornardadosPets() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", dono=" + dono.retorTodosDados() +
                ", tipocuidado='" + tipocuidado + '\'' +
                '}';
    }
}

