package br.com.pousada.Controller;


import br.com.pousada.Model.Habitacao;
import br.com.pousada.Persistencia.DAO.HabitacaoDAO;
import br.com.pousada.Persistencia1.HabitacaoDAOImplements;
import java.util.List;


public class HabitacaoController {

    public int save(Habitacao c){
        HabitacaoDAO dao = new HabitacaoDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Habitacao> listAll(){
        HabitacaoDAO dao = new HabitacaoDAOImplements();
        return dao.listAll(Habitacao.class);
    }
    
public List<Habitacao> listByNome(String nome) {
        HabitacaoDAO dao = new HabitacaoDAOImplements();
        return dao.listbyNome(nome, Habitacao.class);
    }
    
    public boolean remove (int codigo){
        HabitacaoDAO dao = new HabitacaoDAOImplements();
        return dao.remove(Habitacao.class,codigo);
    }
    public Habitacao listId(int codigo){
        HabitacaoDAO dao = new HabitacaoDAOImplements();
        return dao.listbyId(Habitacao.class,codigo);
    }
}
