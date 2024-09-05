package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Apolice;
import model.AutoAvaliação;
import model.Cliente;
import model.FalhasEletricas;
import model.FalhasMecanicas;
import model.Funilaria;
import model.Historico;
import model.Oficinas;
import model.Orçamento;
import model.Pedido;
import model.Veiculo;

public class App {
	
	    private static final LocalDate LocalDate = null;

		public static void main(String[] args) {
	      //Cadastrando um cliente
	    	
	    	Scanner entrada = new Scanner(System.in);
	    	
	    	System.out.println("Tenha em mãos seus dados pessoais");
	    	
	    	System.out.println("Insira o nome: ");
	    	String nomeCliente = entrada.nextLine();
	    	System.out.println(nomeCliente);
	    
	    	System.out.println("Insira o cpf: ");
	    	long cpfCliente = entrada.nextLong();
	    	System.out.println(cpfCliente);
	    	
	    	entrada.nextLine();

	    	System.out.println("Insira o Endereço: ");
	    	String enderecoCliente = entrada.nextLine();
	    	System.out.println(enderecoCliente);

	    	System.out.println("Insira o Telefone:");
	    	long telefoneCliente = entrada.nextLong();
	    	System.out.println(telefoneCliente);

	    	entrada.nextLine();
	    	
	    	System.out.println("Insira o Email: ");
	    	String emailCliente = entrada.nextLine();
	    	System.out.println(emailCliente);
	    	
	    	System.out.println("Insira o Sexo: ");
	    	String sexoCliente = entrada.nextLine();
	    	System.out.println(sexoCliente);
	    	
	    	System.out.println("Insira o Nome da mãe: ");
	    	String nomeMae = entrada.nextLine();
	    	System.out.println(nomeMae);
	    	
	    	
	    	
	    	System.out.println("Insira o Rg: ");
	    	long rgCliente = entrada.nextLong();
	    	System.out.println(rgCliente);
	    	
	    	Cliente cliente = new Cliente(nomeCliente, cpfCliente,  enderecoCliente, telefoneCliente,
	    			emailCliente, sexoCliente, nomeMae, rgCliente);
	    	
	    	
	    	System.out.println("Tenha em mãos os dados da sua veiculo");
	    	
	    	System.out.println("Insira o ano de fabricação: ");
	    	int anoFabricacao = entrada.nextInt();
	    	System.out.println(anoFabricacao);
	    	
	    	entrada.nextLine();
	    	
	    	System.out.println("Insira a marca: ");
	    	String marca = entrada.nextLine();
	    	System.out.println(marca);
	    	
	    	System.out.println("Insira o modelo: ");
	    	int anoModelo = entrada.nextInt();
	    	System.out.println(anoModelo);
	    	
	    	entrada.nextLine();
	    	
	    	System.out.println("Insira a Descrição do modelo: ");
	    	String descricaoModelo = entrada.nextLine();
	    	System.out.println(descricaoModelo);
	    	
	    	System.out.println("Insira o Valor: ");
	    	int valorVeiculo = entrada.nextInt();
	    	System.out.println(valorVeiculo);
	    	
	    	entrada.nextLine();
	    	
	    	System.out.println("Insira o tipo de combustível: ");
	    	String combustivel = entrada.nextLine();
	    	System.out.println(combustivel);
	    	
	    	System.out.println("Insira o tipo do motor: ");
	    	String motor = entrada.nextLine();
	    	System.out.println(motor);
	    	
	    	System.out.println("Insira a velocidade máxima: ");
	    	int velocidade = entrada.nextInt();
	    	System.out.println(velocidade);
	    	
	    	Veiculo veiculo = new Veiculo(cliente, anoFabricacao, marca,  anoModelo, descricaoModelo,
	    			valorVeiculo, combustivel, motor, velocidade);
	    	
	    	List<Veiculo> veiculos = new ArrayList<>();
	    	veiculos.add(veiculo);
	    	
	    	System.out.println("Tenha em mãos os dados da sua Apolice");
	    
	    
	    	System.out.println("Insira a maodaliade de franquia: ");
	    	String modalidadeFranquia = entrada.nextLine();
	    	System.out.println(modalidadeFranquia);
	    	
	    	System.out.println("Insira o valor do seguro: ");
	    	int valoSeguro = entrada.nextInt();
	    	System.out.println(valoSeguro);
	    	
	    	System.out.println("Insira a cobertura: ");
	    	int cobertura = entrada.nextInt();
	    	System.out.println(cobertura);
	    	
	    	entrada.nextLine();
	    	
	    	System.out.println("Insira a vigencia do seguro: ");
	    	String vigenciaSeguro = entrada.nextLine();
	    	System.out.println(vigenciaSeguro);
	    	
	    	System.out.println("Insira o Dpvat: ");
	    	String dpvat = entrada.nextLine();
	    	System.out.println(dpvat);
	    	
	    	
	    	
	    	System.out.println("Insira o valor da franquia: ");
	    	int valorFranquia = entrada.nextInt();
	    	System.out.println(valorFranquia);
	    	
	    	entrada.nextLine();
	    	
	    	System.out.println("Insira o modelo do veiculo: ");
	    	String modeloVeiculo = entrada.nextLine();
	    	System.out.println(modeloVeiculo);
	    	
	    	System.out.println("Insira o numero Apolice: ");
	    	int numeroApolice = entrada.nextInt();
	    	System.out.println(numeroApolice);
	    	
	    	
	    	Apolice apolice = new Apolice(veiculo, cliente, modalidadeFranquia,  valoSeguro, cobertura, vigenciaSeguro, 
	    			dpvat,null, valorFranquia, modeloVeiculo,numeroApolice);
	    	
	    	
	    	
	    	
System.out.println("Tenha em mão o historico do veiculo");
	    	
	    	
	    
	    	System.out.println("Insira as irregularidades: ");
	    	String irregularidades = entrada.nextLine();
	    	System.out.println(irregularidades);

	    	System.out.println("Insira o local do sinistro: ");
	    	String localSinistro = entrada.nextLine();
	    	System.out.println(localSinistro);

	    	System.out.println("Insira o tempo de Habilitacao: ");
	    	String tempoHabilitacao = entrada.nextLine();
	    	System.out.println(tempoHabilitacao);
	    	
	    	System.out.println("Insira as multas: ");
	    	String multas = entrada.nextLine();
	    	System.out.println(multas);
	    	
	    	System.out.println("Insira a cobertura do Sinistro: ");
	    	String coberturaSinistro = entrada.nextLine();
	    	System.out.println(coberturaSinistro);
	    	
	    	System.out.println("Insira a descricão dos Danos: ");
	    	String descricaoDano = entrada.nextLine();
	    	System.out.println(descricaoDano);
	    	
	    	
	    	
	    	Historico historico = new Historico(apolice, cliente, veiculos, irregularidades,  localSinistro, tempoHabilitacao, multas,
	    			coberturaSinistro, descricaoDano);
	    	
	    	int opcao = 4;
	    	FalhasEletricas falhasEletricas = new FalhasEletricas();
    		FalhasMecanicas falhasMecanicas = new FalhasMecanicas();
    		Funilaria funilaria = new Funilaria();
    		AutoAvaliação autoAvaliação = new AutoAvaliação();
    		
	    	while(opcao!=0) {
		    	System.out.println("Voce iniciou o autodiagnostico");
		    	System.out.println("Para inserir falhas eletricas digite 1 \n" + "Para inserir falhas mecanicas digite 2 \n" + "Para inserir problemas na funilaria digite 3"+ " Para voltar ao menu inicial digite 5" );
		    	int opcaoAutoDiagnostico = entrada.nextInt();
		    	
		    	if(opcaoAutoDiagnostico == 1) {
		    		
			    	System.out.println("Altenadores: ");
			    	boolean altenadores = entrada.nextBoolean();
			    	
			    	System.out.println("Correria altenador: ");
			    	boolean correiaAltenador = entrada.nextBoolean();
			    	
			    	System.out.println("Fusiveis: ");
			    	boolean fusiveis = entrada.nextBoolean();
			    	
			    	System.out.println("Sistema ingnicao: ");
			    	boolean sistemaIngnicao = entrada.nextBoolean();
			    	
			    	System.out.println("Iluminacao: ");
			    	boolean iluminacao = entrada.nextBoolean();
			    	
			    	System.out.println("Cabos: ");
			    	boolean cabos = entrada.nextBoolean();
			    	
			    	System.out.println("Velas: ");
			    	boolean velas = entrada.nextBoolean();
			    	
			    	System.out.println("Bobina: ");
			    	boolean bobina = entrada.nextBoolean();
			    	
			    	falhasEletricas = new FalhasEletricas(veiculo, altenadores, correiaAltenador, fusiveis, sistemaIngnicao, iluminacao, cabos, velas, bobina);
		    	
		    	
		    	} 
		    	
		    	
		    	else if (opcaoAutoDiagnostico == 2) {
		    		
		    		
		    		System.out.println("SuperAquecimento: ");
			    	boolean superAquecimento = entrada.nextBoolean();
			    	
			    	System.out.println("Ingnicao: ");
			    	boolean ingnicao = entrada.nextBoolean();
			    	
			    	System.out.println("Barulhos e Ruidos: ");
			    	boolean barulhosRuidos = entrada.nextBoolean();
			    	
			    	System.out.println("Aumento do consumo do Combustivel : ");
			    	boolean aumentoCombustivel = entrada.nextBoolean();
			    	
			    	System.out.println("fumaça Preta: ");
			    	boolean fumacaPreta = entrada.nextBoolean();
			    	
			    	System.out.println("Perda de Potencia: ");
			    	boolean perdaPotencia = entrada.nextBoolean();
			    	
			    	System.out.println("Falhas no reservatorio de Agua: ");
			    	boolean reservatorioAgua = entrada.nextBoolean();
			    	
			    	System.out.println("Aumento da Temperatura: ");
			    	boolean aumentoTemperatura = entrada.nextBoolean();
			    	
			    	falhasMecanicas = new FalhasMecanicas(veiculo, superAquecimento, ingnicao, barulhosRuidos, aumentoCombustivel,
			    			fumacaPreta, perdaPotencia, reservatorioAgua, aumentoTemperatura);
			    	
			    	
		    	}
		    	
		    	
		    	else if (opcaoAutoDiagnostico == 3) {
		    		

			    	System.out.println("Ferrugem: ");
			    	boolean ferrugem = entrada.nextBoolean();
			    	
			    	System.out.println("Martelimho de Ouro: ");
			    	boolean martelimhoOuro = entrada.nextBoolean();
			    	
			    	System.out.println(" Relevos: ");
			    	boolean relevos = entrada.nextBoolean();
			    	
			    	System.out.println(" Rachaduras : ");
			    	boolean rachaduras = entrada.nextBoolean();
			    	
			    	System.out.println("Renovação da Pintura: ");
			    	boolean renovacaoPintura = entrada.nextBoolean();
			    	
			    	System.out.println("Polimento: ");
			    	boolean polimento = entrada.nextBoolean();
			    	
			    	System.out.println("Critalizacão: ");
			    	boolean critalizacao = entrada.nextBoolean();
			    	
			    	System.out.println("Carenagem: ");
			    	boolean carenagem = entrada.nextBoolean();
			    	
			    	funilaria = new Funilaria(veiculo, ferrugem, martelimhoOuro, relevos, rachaduras,
			    			renovacaoPintura, polimento, critalizacao, carenagem);
			    	
		    		
		    	} else {
		    	
	
		    	autoAvaliação = new AutoAvaliação(falhasEletricas,falhasMecanicas,funilaria);
		    	opcao = 0;
	    	}
	    } 
	    	
	    	Orçamento orçamento = new Orçamento(autoAvaliação,cliente, 100, 150, 200,250, 300, 350, 50 );
	    	
	    	Oficinas oficina = new Oficinas(orçamento, 1," rua cavalo manco", 11932849483L, 0000000,564239426423651L,"Porto AutoAssit" , 2847,"Mercado Peças" );
	    	
	    	Pedido pedido = new Pedido(orçamento, oficina, 1, 01, cliente, 600, 100, 1234, 0000);
	    	
	    	entrada.close();
	}
	
}
