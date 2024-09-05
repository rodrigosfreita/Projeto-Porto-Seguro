package model;


public class Cliente {
	
	private String nome;
	private long cpf;
	private String endereco;
	private long telefone;
	private String email;
	private String sexo;
	private String nomeMae;
	private long rg;

	
	public Cliente(String nome, long cpf, String endereco, long telefone, String email, String sexo, String nomeMae, long rg) {		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.nomeMae = nomeMae;
		this.rg = rg;
		
		System.out.println("Construtor cheio - objeto Cliente criado!");

	}
	
	public Cliente() {
		System.out.println("Construtor vazio - objeto Cliente criado!");
	};
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {	
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public  String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNome_mae() {
		return nomeMae;
	}
	
	public void setNome_mae(String nome_mae) {
		this.nomeMae = nome_mae;
	}
	
	
	
	
	public long getRg() {
		return rg;
	}
	
	public void setRg (long rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString (){
		return "Cliente[nome=" + nome + ",cpf=" + cpf + ",endereco="+ endereco +",telefone=" + telefone + ",email=" 
	+ email + ",sexo=" + sexo + ",nome_mae=" + nomeMae + ",rg="+ rg +"]";
	}
	

}






