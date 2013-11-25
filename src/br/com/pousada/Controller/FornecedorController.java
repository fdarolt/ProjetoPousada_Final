package br.com.pousada.Controller;



import br.com.pousada.Model.Fornecedor;
import br.com.pousada.Persistencia.DAO.FornecedorDAO;
import br.com.pousada.Persistencia1.FornecedorDAOImplements;
import java.util.List;


public class FornecedorController {

    public int save(Fornecedor c){
        FornecedorDAO dao = new FornecedorDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Fornecedor> listAll(){
        FornecedorDAO dao = new FornecedorDAOImplements();
        return dao.listAll(Fornecedor.class);
    }
    
public List<Fornecedor> listByNome(String nome) {
        FornecedorDAO dao = new FornecedorDAOImplements();
        return dao.listbyNome(nome, Fornecedor.class);
    }
    
    public boolean remove (int codigo){
        FornecedorDAO dao = new FornecedorDAOImplements();
        return dao.remove(Fornecedor.class,codigo);
    }
    public Fornecedor listId(int codigo){
        FornecedorDAO dao = new FornecedorDAOImplements();
        return dao.listbyId(Fornecedor.class,codigo);
    }
}
