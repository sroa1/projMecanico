package modelo;

public class Cliente {

    private String cpf;
    private String rg;
    private String nome;
    private String endereco;
    private String telefone;
    private String informacoesBancarias;

    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInformacoesBancarias() {
        return informacoesBancarias;
    }

    public void setInformacoesBancarias(String informacoesBancarias) {
        this.informacoesBancarias = informacoesBancarias;
    }

    
}