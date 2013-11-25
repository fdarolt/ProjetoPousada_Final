package br.com.pousada.Persistencia1;

import br.com.pousada.Persistencia.DAO.FuncionarioDAO;
import br.com.pousada.Model.Funcionario;
import br.com.pousada.Persistencia1.DAOImplements;
import java.util.List;
import javax.persistence.Query;

public class FuncionarioDAOImplements extends DAOImplements<Funcionario, Integer> implements FuncionarioDAO {

    //LOGIN
    public boolean autenticador(String usuario, String Senha) {

        //Login    
        Query q = getEntityManager().createQuery("select x from Funcionario x where x.login = '" + usuario + "' and x.senha = '" + Senha + "'");
        List<Funcionario> funcionarios = q.getResultList();
        for (Funcionario f : funcionarios) {
            return true;
        }
        return false;
    }
}
