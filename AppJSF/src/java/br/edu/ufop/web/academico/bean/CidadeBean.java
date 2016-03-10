
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.CidadesController;
import br.edu.ufop.web.academico.model.Cidade;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "cidadeBean")
@RequestScoped
public class CidadeBean {

    public CidadeBean() {
    }
    
    public List<Cidade> getCidades(){
        CidadesController cidadeController = new CidadesController();
        return cidadeController.getCidades();
    }
    
}
