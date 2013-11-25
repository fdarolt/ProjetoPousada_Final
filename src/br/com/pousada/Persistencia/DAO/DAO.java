package br.com.pousada.Persistencia.DAO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

public interface DAO <T,I extends Serializable>{
    //T representa a classe;
    //I representa a PK da classe;
    
    //Salvar
    T save (T entity);
    //Listar Todos
    public List<T> listAll(Class<T> classe);
    //Listar Por ID
    T listbyId (Class <T> classe, I pk);
    //Listar Por ID
     List<T> listbyNome (String nome, Class<T> classe);
    //Remover
    boolean remove (Class<T> classe, I pk);
    
    EntityManager getEntityManager();
    
    
}
