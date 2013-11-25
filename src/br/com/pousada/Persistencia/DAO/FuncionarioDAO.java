
package br.com.pousada.Persistencia.DAO;

import br.com.pousada.Model.Funcionario;





public interface FuncionarioDAO extends DAO<Funcionario, Integer>{
    
    //Login
    boolean autenticador (String usuario, String Senha);
   
}
