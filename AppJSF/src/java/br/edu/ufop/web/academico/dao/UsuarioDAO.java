
package br.edu.ufop.web.academico.dao;

import br.edu.ufop.web.academico.model.Usuario;
import br.edu.ufop.web.persistence.MySQLConnectionProcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    public UsuarioDAO() {
        
        MySQLConnectionProcess.getInstance().setHost("localhost");
        MySQLConnectionProcess.getInstance().setDatabase("academico");
        MySQLConnectionProcess.getInstance().setDbUsername("sistemaweb");
        MySQLConnectionProcess.getInstance().setDbPassword("123456");    
        
    }
    
    public List<Usuario> getUsuarios() throws SQLException{
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        String sql = "SELECT id, nome FROM usuarios"; //buscar os dados
        
        ResultSet rs = MySQLConnectionProcess.getInstance().getStatement().executeQuery(sql);
        
        while(rs.next()){
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            
            usuarios.add(usuario);
            
        }
        
        return usuarios;
    }
    
}
