
package br.edu.ufop.web.academico.controller;

import br.edu.ufop.web.academico.dao.UsuarioDAO;
import br.edu.ufop.web.academico.model.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class UsuariosController {
    
    public List<Usuario> getUsuarios(){
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        try{
            return usuarioDAO.getUsuarios();
        }
        catch (SQLException ex){
            Logger.getLogger(CidadesController.class.getName());
        }
   
        return null;
    } 
    
}
