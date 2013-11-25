package br.com.pousada.Controller;



import br.com.pousada.Model.Funcionario;
import br.com.pousada.Persistencia.DAO.FuncionarioDAO;
import br.com.pousada.Persistencia1.FuncionarioDAOImplements;
import java.util.List;


public class FuncionarioController {

   public int save(Funcionario c){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Funcionario> listAll(){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listAll(Funcionario.class);
    }
    
    public List<Funcionario> listByNome(String nome) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listbyNome(nome, Funcionario.class);
    }
    
    public boolean remove (int codigo){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.remove(Funcionario.class,codigo);
    }
    public Funcionario listId(int codigo){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listbyId(Funcionario.class,codigo);
    }
}
