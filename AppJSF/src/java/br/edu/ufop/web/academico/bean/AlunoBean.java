
package br.edu.ufop.web.academico.bean;

import br.edu.ufop.web.academico.controller.AlunosController;
import br.edu.ufop.web.academico.model.Aluno;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//encapsula todas as informações e transfere os dados
//responsavel para atender requisições, qdo faz requisição consulta o Bean e ele retorna as informações

@Named(value = "alunoBean") 
@RequestScoped
public class AlunoBean {

    public AlunoBean() {
        
    }
    
    public List<Aluno> getAlunos(){
        AlunosController alunoController = new AlunosController();
        return alunoController.getAlunos();
    }
    
}
