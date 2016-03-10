
package br.edu.ufop.web.academico.dao;

import br.edu.ufop.web.academico.model.Cidade;
import br.edu.ufop.web.persistence.MySQLConnectionProcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CidadeDAO {

    public CidadeDAO() {
        
        MySQLConnectionProcess.getInstance().setHost("localhost");
        MySQLConnectionProcess.getInstance().setDatabase("academico");
        MySQLConnectionProcess.getInstance().setDbUsername("sistemaweb");
        MySQLConnectionProcess.getInstance().setDbPassword("123456");    
        
    }
    
    public List<Cidade> getCidades() throws SQLException{
        
        List<Cidade> cidades = new ArrayList<Cidade>();
        
        String sql = "SELECT id, nome FROM cidades"; //buscar os dados
        
        ResultSet rs = MySQLConnectionProcess.getInstance().getStatement().executeQuery(sql);
        
        while(rs.next()){
            Cidade cidade = new Cidade();
            cidade.setId(rs.getInt("id"));
            cidade.setNome(rs.getString("nome"));
            
            cidades.add(cidade);
            
        }
        
        return cidades;
    }
    
}
