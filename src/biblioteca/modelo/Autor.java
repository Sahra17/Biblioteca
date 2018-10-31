package biblioteca.modelo;

public class Autor implements Imprimivel {
	private int id;
	private String nome;
	private long cpf;
	
	public Autor () { }
	
	public Autor(int id, String nome, long cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String imprimeEmLista() {
		return String.format("%d\t%s\t%s\t%d\t%d\t%d%.2f", getId(), getNome(), getCpf());
	}

	@Override
	public String[] getColunas() {
		String[] colunas = {"id", "Nome", "CPF"};
		return colunas;
	}
	
}