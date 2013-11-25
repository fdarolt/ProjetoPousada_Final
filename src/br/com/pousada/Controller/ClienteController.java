package br.com.pousada.Controller;


import br.com.pousada.Model.Cliente;
import br.com.pousada.Persistencia.DAO.ClienteDAO;
import br.com.pousada.Persistencia1.ClienteDAOImplements;
import java.util.List;


public class ClienteController {
   
    public int save(Cliente c){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Cliente> listAll(){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.listAll(Cliente.class);
    }
    
 public List<Cliente> listByNome(String nome) {
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.listbyNome(nome, Cliente.class);
    }
    
    public boolean remove (int codigo){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.remove(Cliente.class,codigo);
    }
    public Cliente listId(int codigo){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.listbyId(Cliente.class,codigo);
    }
   
}
