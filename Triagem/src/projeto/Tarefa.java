package projeto;

public class Tarefa {
	
	    private int id;
	    private String descricao;
	    private String nivelUrgencia;
	    private int tempoResposta; // em minutos

	    public Tarefa(int id, String descricao, String nivelUrgencia, int tempoResposta) {
	        this.id = id;
	        this.descricao = descricao;
	        this.nivelUrgencia = nivelUrgencia;
	        this.tempoResposta = tempoResposta;
	    }
	    
	    public Tarefa() {}

	    public int getId() {
	        return id;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public String getNivelUrgencia() {
	        return nivelUrgencia;
	    }

	    public int getTempoResposta() {
	        return tempoResposta;
	    }

	    @Override
	    public String toString() {
	        return "Tarefa{" +
	                "id=" + id +
	                ", descricao='" + descricao + '\'' +
	                ", nivelUrgencia='" + nivelUrgencia + '\'' +
	                ", tempoResposta=" + tempoResposta +
	                '}';
	    }
	
}
