package br.com.pousada.Controller;




import br.com.pousada.Model.Loja;
import br.com.pousada.Persistencia.DAO.LojaDAO;
import br.com.pousada.Persistencia1.LojaDAOImplements;
import java.util.List;


public class LojaController {
   
    public int save(Loja c){
        LojaDAO dao = new LojaDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Loja> listAll(){
        LojaDAO dao = new LojaDAOImplements();
        return dao.listAll(Loja.class);
    }
    
 public List<Loja> listByNome(String nome) {
        LojaDAO dao = new LojaDAOImplements();
        return dao.listbyNome(nome, Loja.class);
    }
    
    public boolean remove (int codigo){
        LojaDAO dao = new LojaDAOImplements();
        return dao.remove(Loja.class,codigo);
    }
    public Loja listId(int codigo){
        LojaDAO dao = new LojaDAOImplements();
        return dao.listbyId(Loja.class,codigo);
    }
   
}
