package br.com.pousada.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PessoaFisica extends Pessoa{    
    
    //INSTANCIAR ATRIBUTOS 
    
    private String cpf;
    private String rg;

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
}
