
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.EstadoDAO;
import br.edu.ufop.web.academico.model.Estado;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class EstadosController {
    
    public List<Estado> getEstados(){
        
        EstadoDAO estadoDAO = new EstadoDAO();
        
        try{
            return estadoDAO.getEstados();
        }
        catch (SQLException ex){
            Logger.getLogger(CidadesController.class.getName());
        }
   
        return null;
    } 
    
}
