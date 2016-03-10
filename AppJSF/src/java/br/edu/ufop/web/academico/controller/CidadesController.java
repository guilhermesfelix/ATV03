
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.CidadeDAO;
import br.edu.ufop.web.academico.model.Cidade;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class CidadesController { //acessar DAO e retorna informações

    public List<Cidade> getCidades(){
        
        CidadeDAO cidadeDAO = new CidadeDAO();
        
        try{
            return cidadeDAO.getCidades();
        }
        catch (SQLException ex){
            Logger.getLogger(CidadesController.class.getName());
        }
   
        return null;
    } 
}
