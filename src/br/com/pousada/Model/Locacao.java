package br.com.pousada.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Locacao {
    
    //INSTANCIAR ATRIBUTOS
    
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Habitacao nome;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Funcionario funcionario;   
  
    private int quantidadeLocacao;
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    private int numeroPessoas;
    private double valorLocacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Habitacao getHabitacao() {
        return nome;
    }

    public void setHabitacao(Habitacao habitacao) {
        this.nome = habitacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }   

    public int getQuantidadeLocacao() {
        return quantidadeLocacao;
    }

    public void setQuantidadeLocacao(int quantidadeLocacao) {
        this.quantidadeLocacao = quantidadeLocacao;
    }   

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    
    
}
