package br.com.pousada.Controller;


import br.com.pousada.Model.Locacao;
import br.com.pousada.Persistencia.DAO.LocacaoDAO;
import br.com.pousada.Persistencia1.LocacaoDAOImplements;

import java.util.List;


public class LocacaoController {

    public int save(Locacao c){
        LocacaoDAO dao = new LocacaoDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Locacao> listAll(){
        LocacaoDAO dao = new LocacaoDAOImplements();
        return dao.listAll(Locacao.class);
    }
    
public List<Locacao> listByNome(String nome) {
        LocacaoDAO dao = new LocacaoDAOImplements();
        return dao.listbyNome(nome, Locacao.class);
    }
    
    public boolean remove (int codigo){
        LocacaoDAO dao = new LocacaoDAOImplements();
        return dao.remove(Locacao.class,codigo);
    }
    public Locacao listId(int codigo){
        LocacaoDAO dao = new LocacaoDAOImplements();
        return dao.listbyId(Locacao.class,codigo);
    }
}
