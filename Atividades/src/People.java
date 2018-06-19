//agregação

import java.util.ArrayList;

public class People {
    private String nome;
    private String endereco;
    private String CEP;
    private String telefone;
    private double renda;
    private ArrayList<ContaComum> contas;

    public People(String nome, String endereco, String cEP, String telefone, double renda) {
        this.nome = nome;
        this.endereco = endereco;
        CEP = cEP;
        this.telefone = telefone;
        this.renda = renda;
    }

    // Já passo a instancia pronta
    public void adiciona(ContaComum contaComum) {
        this.contas.add(contaComum);
    }

public class ContaComum {
    private long numero;
    private String dataAbertura;
    private String dataEncerramento;
    private int situacao;
    private int senha;
    private double saldo;

    public ContaComum(long numero, String dataAbertura, String dataEncerramento, int situacao, int senha,
            double saldo) {
        super();
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.situacao = situacao;
        this.senha = senha;
        this.saldo = saldo;
    }
}}
