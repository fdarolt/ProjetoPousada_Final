package br.com.pousada.Controller;


import br.com.pousada.Model.Reserva;
import br.com.pousada.Persistencia.DAO.ReservaDAO;
import br.com.pousada.Persistencia1.ReservaDAOImplements;
import java.util.List;


public class ReservaController {

    public int save(Reserva c){
        ReservaDAO dao = new ReservaDAOImplements();
        return dao.save(c).getId(); 
    }
    
    public List<Reserva> listAll(){
        ReservaDAO dao = new ReservaDAOImplements();
        return dao.listAll(Reserva.class);
    }
    
public List<Reserva> listByNome(String nome) {
        ReservaDAO dao = new ReservaDAOImplements();
        return dao.listbyNome(nome, Reserva.class);
    }
    
    public boolean remove (int codigo){
        ReservaDAO dao = new ReservaDAOImplements();
        return dao.remove(Reserva.class,codigo);
    }
    public Reserva listId(int codigo){
        ReservaDAO dao = new ReservaDAOImplements();
        return dao.listbyId(Reserva.class,codigo);
    }
}
