package model;

import java.time.LocalDate;

public class Apolice {
	private Veiculo veiculos;
	private Cliente numeroCliente;
	private String modalidadeFranquia;
	private int valoSeguro ;
	private int cobertura;
	private String vigenciaSeguro;
	private String dpvat;
	private LocalDate dataCadastro;
	private int valorFranquia;
	private String modeloVeiculo;
	private int numeroApolice;


	
	public Apolice(Veiculo veiculos, Cliente numeroCliente, String modalidadeFranquia,
			int valoSeguro, int cobertura, String vigenciaSeguro, String dpvat,
			LocalDate dataCadastro, int valorFranquia, String modeloVeiculo , int numeroApolice) {	
		
		this.veiculos = veiculos;
		this.numeroCliente = numeroCliente;
		this.modalidadeFranquia = modalidadeFranquia;
		this.valoSeguro = valoSeguro;
		this.cobertura = cobertura;
		this.vigenciaSeguro = vigenciaSeguro;
		this.dpvat = dpvat;
		this.dataCadastro = dataCadastro;
		this.valorFranquia = valorFranquia;
		this.modeloVeiculo = modeloVeiculo;
		
		System.out.println("Construtor cheio - objeto Apolice criado!");

	}
	
	public Apolice() {
		System.out.println("Construtor vazio - objeto Apolice criado!");
	};
	
	public Veiculo getVeiculos() {
		return veiculos;
	}
	
	public void setVeiculos (Veiculo numeroApolice) {
		this.veiculos = numeroApolice;
	}
	
	public Cliente getNumeroCliente() {
		return numeroCliente;
	}
	
	public void setNumeroCliente(Cliente numeroCliente) {	
		this.numeroCliente = numeroCliente;
	}
	
	public String getModalidadeFranquia() {
		return modalidadeFranquia;
	}
	
	public void setModalidadeFranquia(String modalidadeFranquia) {
		this.modalidadeFranquia = modalidadeFranquia;
	}
	
	public int getvaloSeguro() {
		return valoSeguro;
	}
	
	public void setvaloSeguro(int valoSeguro) {
		this.valoSeguro = valoSeguro;
	}
	
	public int getCobertura() {
		return cobertura;
	}
	
	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}
	
	public  String getVigenciaSeguro() {
		return vigenciaSeguro;
	}
	
	public void setVigenciaSeguro(String vigenciaSeguro) {
		this.vigenciaSeguro = vigenciaSeguro;
	}
	
	public String getDpvat() {
		return dpvat;
	}
	
	public void setDpvat(String dpvat) {
		this.dpvat = dpvat;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public int getValorFranquia() {
		return valorFranquia;
	}
	
	public void setValorFranquia (int valorFranquia) {
		this.valorFranquia = valorFranquia;
	}
	
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	
	public void setModeloVeiculo (String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	
	public int getNumeroApolice() {
		return numeroApolice;
	}
	
	public void setNumeroApolice (int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	
	@Override
	public String toString (){
		return "Apolice[numeroApolice=" + veiculos + ",numeroCliente=" + numeroCliente + "modalidadeFranquia="+ 
				modalidadeFranquia +",valoSeguro=" + valoSeguro + ",cobertura=" + cobertura + ",vigenciaSeguro="
			+ "" + vigenciaSeguro + ",dpvat=" + dpvat +",dataCadastro=" + dataCadastro + 
			",valorFranquia="+ valorFranquia +",modeloVeiculo=" + modeloVeiculo + numeroApolice +"]";
	}
	


}
