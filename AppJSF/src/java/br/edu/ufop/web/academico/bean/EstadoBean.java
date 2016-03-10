
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.EstadosController;
import br.edu.ufop.web.academico.model.Estado;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "estadoBean")
@RequestScoped
public class EstadoBean {

    public EstadoBean() {
    }
    
    public List<Estado> getEstados(){
        EstadosController estadoController = new EstadosController();
        return estadoController.getEstados();
    }
    
}
