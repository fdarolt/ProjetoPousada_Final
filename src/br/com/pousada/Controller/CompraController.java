package br.com.pousada.Controller;


import br.com.pousada.Model.Compra;
import br.com.pousada.Persistencia.DAO.CompraDAO;
import br.com.pousada.Persistencia1.CompraDAOImplements;

import java.util.List;


public class CompraController {
   
    public int save(Compra c){
        CompraDAO dao = new CompraDAOImplements();
        return dao.save(c).getIdCompra(); 
    }
    
    public List<Compra> listAll(){
        CompraDAO dao = new CompraDAOImplements();
        return dao.listAll(Compra.class);
    }
    
 public List<Compra> listByNome(String nome) {
        CompraDAO dao = new CompraDAOImplements();
        return dao.listbyNome(nome, Compra.class);
    }
    
    public boolean remove (int codigo){
        CompraDAO dao = new CompraDAOImplements();
        return dao.remove(Compra.class,codigo);
    }
    public Compra listId(int codigo){
        CompraDAO dao = new CompraDAOImplements();
        return dao.listbyId(Compra.class,codigo);
    }
   
}
