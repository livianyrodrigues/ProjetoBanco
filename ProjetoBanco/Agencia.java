import java.util.*;


public class Agencia{
    
    private int numero;
    private Banco banco;
    private List<Conta> contas = new ArrayList<Conta>();
    private List<Poupanca> poupancas = new ArrayList<Poupanca>();
    
    public void cadastrarConta(Conta conta){
        contas.add(conta);
    }
    public Conta PesquisarContaPorNumero(int numero){
        for (Conta conta : contas){
            if (conta.getNumero() == numero){
                return conta;
            }
        }
        throw new RuntimeException("Conta não encontrada: " +numero);
    }
    public void CadastrarPoupanca(Poupanca poupanca){
        poupancas.add(poupanca);
    }
    public Poupanca PesquisarPoupancaPorNumero(int numero){
        for (Poupanca poupanca : poupancas){
            if (poupanca.getNumero() == numero){
                return poupanca;
            }
        }
        throw new RuntimeException("Poupanca não encontrada: " +numero);
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public Banco getBanco(){
        return banco;
    }
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    
}