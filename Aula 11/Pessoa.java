package listaencadeada;

public class Pessoa {
    int nro;
    String nome;
    String telefone;
    String endereco;
    String cpf;
    Pessoa proximo;
    public Pessoa(){}
    public Pessoa(int nro, String nome, String telefone, String endereco, String cpf){
        this.nro = nro;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
}
