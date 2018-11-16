import java.util.Scanner;

import entity.Financing;
import entity.House;
import entity.Material;
import proxy.ProxyControllerFinancing;
import proxy.ProxyControllerMaterial;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----> SEJA BEM-VINDO AO YOURHOUSE <-----");
		System.out.println("\nNós iremos te ajudar a escolher qual a melhor opção entre realizar um\n"
						+ "financiamento ou adquirir material para construir sua casa.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Digite a altura da casa:");
		double height = scanner.nextDouble();
		System.out.println("Digite a largura da casa:");
		double width = scanner.nextDouble();
		System.out.println("Digite o comprimento da casa:");
		double length = scanner.nextDouble();
		System.out.println("Digite a area da casa:");
		double area = scanner.nextDouble();
		
		House house = new House(height, width, length, area);
		
		boolean seenMaterial = false;
		boolean seenFinancing = false;
		while(!seenFinancing || !seenMaterial) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Para calcular quantidade de material necessário para construir a casa:\n--> Digite 1");
			System.out.println("Para saber os custos do financiamento:\n--> Digite 2");
			int entrada = scanner.nextInt();
			switch (entrada) {
			case 1:

				ProxyControllerMaterial proxyMaterial = new ProxyControllerMaterial();
				Material material = proxyMaterial.calculateMaterial(house);
				
				System.out.printf(material.toString()+"%n");
				
				seenMaterial = true;
				break;
			case 2:
				
				ProxyControllerFinancing proxyFinancing = new ProxyControllerFinancing();
				Financing financiamento = proxyFinancing.calculateFinancing(house);
				
				System.out.printf(financiamento.toString()+"%n");
				seenFinancing = true;
				
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
	
		}

	}

}
