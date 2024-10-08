package projeto;

public class main {

	public static void main(String[] args) {

		triagem triagem = new triagem();

		triagem.adicionarTarefa(1, "Concluir relatório", "Emergente - Vermelho", 0);
		triagem.adicionarTarefa(2, "Enviar e-mail urgente", "Muito Urgente - Laranja", 10);
		triagem.adicionarTarefa(3, "Reunião com cliente", "Urgente - Amarelo", 60);
		triagem.adicionarTarefa(4, "Organizar documentos", "Pouco Urgente - Verde", 120);
		triagem.adicionarTarefa(5, "Ler artigo", "Não Urgente - Azul", 240);

		// Exibir todas as tarefas
		System.out.println("Tarefas na triagem:");
		triagem.exibirTarefas();

		int idBusca = 3;
		Tarefa tarefaEncontrada = triagem.buscarTarefaPorId(idBusca);
		if (tarefaEncontrada != null) {
			System.out.println("Tarefa encontrada: " + tarefaEncontrada);
		} else {
			System.out.println("Tarefa com ID " + idBusca + " não encontrada.");
		}
	}

}
