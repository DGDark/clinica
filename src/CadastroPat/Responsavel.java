package CadastroPat;

public class Responsavel {
    String nome;
    String Sobrenome;
    String Cep;
    String numeroResidencial;
    int idade;
    String email;
    String telefone;

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.Sobrenome = sobrenome;
        this.Cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public void retornarDadosBasicos(){
        if(nome == "DGDark"){

        }
        System.out.println("Nome: " + nome + "\n" + "E-mail: " +email);

    }


    public String retorTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", Sobrenome='" + Sobrenome + '\'' +
                ", Cep='" + Cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean idadeMedia(){
        if(idade >= 18) {
            return true;
        }
        return false;
    }




}

