package CadastroPat;

public class Responsavel {
    //"private" serve para privar informação
    private String nome;
    private String Sobrenome;
    private String Cep;
    private String numeroResidencial;
    private int idade;
    private String email;
    private String telefone;

    //get faz a leitura do que esta no private
    public String getNome() {
        return nome;
    }
    // o setter para modificar oque esta no private
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        //trazer todas as clase
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

