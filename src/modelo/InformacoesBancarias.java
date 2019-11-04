package modelo;

public class InformacoesBancarias {

    private int numeroBanco;
    private int agencia;
    private int numeroConta;

    public InformacoesBancarias(int numeroBanco, int agencia, int numeroConta) {
        this.numeroBanco = numeroBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    
}