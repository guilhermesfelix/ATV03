
package br.edu.ufop.web.academico.dao;

import br.edu.ufop.web.academico.model.Estado;
import br.edu.ufop.web.persistence.MySQLConnectionProcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoDAO {
    
    public EstadoDAO() {
        
        MySQLConnectionProcess.getInstance().setHost("localhost");
        MySQLConnectionProcess.getInstance().setDatabase("academico");
        MySQLConnectionProcess.getInstance().setDbUsername("sistemaweb");
        MySQLConnectionProcess.getInstance().setDbPassword("123456");    
        
    }
    
    public List<Estado> getEstados() throws SQLException{
        
        List<Estado> estados = new ArrayList<Estado>();
        
        String sql = "SELECT id, nome, sigla FROM estados"; //buscar os dados
        
        ResultSet rs = MySQLConnectionProcess.getInstance().getStatement().executeQuery(sql);
        
        while(rs.next()){
            Estado estado = new Estado();
            estado.setId(rs.getInt("id"));
            estado.setNome(rs.getString("nome"));
            estado.setSigla(rs.getString("sigla"));
            
            estados.add(estado);
            
        }
        
        return estados;
    }
    
}
