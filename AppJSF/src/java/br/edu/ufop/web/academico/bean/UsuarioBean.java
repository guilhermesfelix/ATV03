
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.UsuariosController;
import br.edu.ufop.web.academico.model.Usuario;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean {

    public UsuarioBean() {
    }
    
    public List<Usuario> getUsuarios(){
        UsuariosController usuarioController = new UsuariosController();
        return usuarioController.getUsuarios();
    }
    
}
