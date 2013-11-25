package br.com.pousada.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PessoaJuridica extends Pessoa {
    
    //INSTANCIAR ATRIBUTOS 
    
    private String cnpj;    
    private String pessoaContatoEmpresa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPessoaContatoEmpresa() {
        return pessoaContatoEmpresa;
    }

    public void setPessoaContatoEmpresa(String pessoaContatoEmpresa) {
        this.pessoaContatoEmpresa = pessoaContatoEmpresa;
    }
}
