/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pousada.Controller;

import br.com.pousada.Model.Endereco;
import br.com.pousada.Persistencia.DAO.EnderecoDAO;
import br.com.pousada.Persistencia1.EnderecoDAOImplements;




/**
 *
 * @author guest01
 */
public class EnderecoController {

    public int save(Endereco e) {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.save(e).getIdEndereco();
    }

    public boolean remove(int codigo) {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.remove(Endereco.class, codigo);
    }
}
