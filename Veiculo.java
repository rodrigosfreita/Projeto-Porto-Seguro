package model;

public class Veiculo {

	private Cliente cliente;
	private int anoFabricacao;
	private String marca;
	private int anoModelo ;
	private String descricaoModelo;
	private int valorVeiculo;
	private String combustivel;
	private String motor;
	private int velocidade;
	
	
	public Veiculo(Cliente cliente, int anoFabricacao, String marca, int anoModelo, String descricaoModelo, int valorVeiculo, String combustivel, String motor, int velocidade) {		
		this.cliente = cliente;
		this.anoFabricacao = anoFabricacao;
		this.marca = marca;
		this.anoModelo = anoModelo;
		this.descricaoModelo = descricaoModelo;
		this.valorVeiculo = valorVeiculo;
		this.combustivel = combustivel;
		this.motor = motor;
		this.velocidade = velocidade;
		
		System.out.println("Construtor cheio - objeto Veiculo criado!");

	}
	
	public Veiculo() {
		System.out.println("Construtor vazio - objeto Veiculo criado!");
	};
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {	
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getAnoModelo() {
		return anoModelo;
	}
	
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	public String getDescricaoModelo() {
		return descricaoModelo;
	}
	
	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}
	
	public  int getValorVeiculo() {
		return valorVeiculo;
	}
	
	public void setValorVeiculo(int valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade (int velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString (){
		return "Veiculo[cliente=" + cliente + ",anoFabricacao=" + anoFabricacao + ",marca="+ 
	marca +",anoModelo=" + anoModelo + ",descricaoModelo=" + descricaoModelo + ",valorVeiculo="
			+ "" + valorVeiculo + ",combustivel=" + combustivel +",motor=" + motor + 
			",velocidade="+ velocidade +"]";
	}
	

}
