package model;

public class AutoAvaliação {

	private FalhasEletricas falhasEletricas;
	private FalhasMecanicas falhasMecanicas;
	private Funilaria funilaria;
	

	
	public AutoAvaliação(FalhasEletricas falhasEletricas, FalhasMecanicas falhasMecanicas, Funilaria finilaria) {	
		
		this.falhasEletricas = falhasEletricas;
		this.falhasMecanicas = falhasMecanicas;
		this.funilaria = funilaria;
		

		
		
		System.out.println("Construtor cheio - objeto AutoAvaliação criado!");

	}
	
	public AutoAvaliação() {
	};
	
	public FalhasEletricas getFalhasEletricas() {
		return falhasEletricas;
	}
	
	public void setFalhasEletricas (FalhasEletricas falhasEletricas) {
		this.falhasEletricas = falhasEletricas;
	}
	
	public FalhasMecanicas getFalhasMecanicas() {
		return falhasMecanicas;
	}
	
	public void setFalhasMecanicas(FalhasMecanicas falhasMecanicas) {	
		this.falhasMecanicas = falhasMecanicas;
	}
	
	public Funilaria getFunilaria() {
		return funilaria;
	}
	
	public void setFinilaria(Funilaria funilaria) {
		this.funilaria = funilaria;
	}
	
	
	
	
	@Override
	public String toString (){
		return "AutoAvaliação[falhasEletricas=" + falhasEletricas + ",falhasMecanicas=" + falhasMecanicas + "finilaria="+ 
				funilaria + 
				 "]";
	}
	public String autoAvaliação() {
		
		String autoAvaliação =
		this.falhasEletricas.toString() + " " +
		this.falhasMecanicas.toString() + " " +
		this.funilaria.toString() + " " ;
		 
		
		String msg = "Essas são as seguintes falhas: falha Eletrica "+ this.falhasEletricas.toString() +"Essas são as seguintes falhas:"
				+ " falha Mecanica " + this.falhasMecanicas.toString()
				+"Essas são as seguintes avarias: Funilaria "+ this.funilaria.toString() + autoAvaliação;
		
		return msg;

	

}
}