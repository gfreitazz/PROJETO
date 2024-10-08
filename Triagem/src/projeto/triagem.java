package projeto;

import java.util.ArrayList;
import java.util.List;

public class triagem {
	
		
	
		Tarefa tarefa = new Tarefa();
	    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
	    

	    public triagem() {
	    	//Tarefa tarefa = new Tarefa();
	    }

	    public void adicionarTarefa(int id, String descricao, String nivelUrgencia, int tempoResposta) {
	        Tarefa tarefa = new Tarefa(id, descricao, nivelUrgencia, tempoResposta);
	        tarefas.add(tarefa);
	        
	    }

	    public void exibirTarefas() {
	        for (Tarefa tarefa : tarefas) {
	            System.out.println(tarefa);
	        }
	    }

	    public Tarefa buscarTarefaPorId(int id) {
	        for (Tarefa tarefa : tarefas) {
	            if (tarefa.getId() == id) {
	                return tarefa;
	            }
	        }
	        return null; // Retorna null se a tarefa não for encontrada
	    }

}
