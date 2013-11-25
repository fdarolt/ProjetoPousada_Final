package br.com.pousada.Controller;


import br.com.pousada.Model.Venda;
import br.com.pousada.Persistencia.DAO.VendaDAO;
import br.com.pousada.Persistencia1.VendaDAOImplements;

import java.util.List;


public class VendaController {
   
    public int save(Venda c){
        VendaDAO dao = new VendaDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Venda> listAll(){
        VendaDAO dao = new VendaDAOImplements();
        return dao.listAll(Venda.class);
    }
    
 public List<Venda> listByNome(String nome) {
        VendaDAO dao = new VendaDAOImplements();
        return dao.listbyNome(nome, Venda.class);
    }
    
    public boolean remove (int codigo){
        VendaDAO dao = new VendaDAOImplements();
        return dao.remove(Venda.class,codigo);
    }
    public Venda listId(int codigo){
        VendaDAO dao = new VendaDAOImplements();
        return dao.listbyId(Venda.class,codigo);
    }
   
}
