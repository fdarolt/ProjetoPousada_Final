package br.com.pousada.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fornecedor extends PessoaJuridica {

    //INSTANCIAR ATRIBUTOS
    @Id
    @GeneratedValue
    private int id;
    private String descricao;
    @OneToOne
    private Endereco endereco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
