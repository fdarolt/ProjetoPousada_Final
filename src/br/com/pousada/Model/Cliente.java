package br.com.pousada.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
 public class Cliente extends PessoaFisica {
     
    @Id
    @GeneratedValue
     private int id;
    //INSTANCIAR ATRIBUTOS   
    private String passaporte;    
    private String cartaoCredito;    
    private String telefoneEmpresaCliente;
    private String procedenciaCliente;
    private String destinoCliente; 
  
    @OneToOne
    private Endereco endereco;

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getTelefoneEmpresaCliente() {
        return telefoneEmpresaCliente;
    }

    public void setTelefoneEmpresaCliente(String telefoneEmpresaCliente) {
        this.telefoneEmpresaCliente = telefoneEmpresaCliente;
    }

    public String getProcedenciaCliente() {
        return procedenciaCliente;
    }

    public void setProcedenciaCliente(String procedenciaCliente) {
        this.procedenciaCliente = procedenciaCliente;
    }

    public String getDestinoCliente() {
        return destinoCliente;
    }

    public void setDestinoCliente(String destinoCliente) {
        this.destinoCliente = destinoCliente;
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
