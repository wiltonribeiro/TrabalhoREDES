package entity;

import java.text.DecimalFormat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Material {
	
	@SerializedName("qtd_floor")
	@Expose
	int qtdFloor;
	
	@SerializedName("qtd_cement")
	@Expose
	double qtdCement;
	
	@SerializedName("qtd_ink")
	@Expose
	double qtdInk;
	
	public Material(int qtdFloor, double qtdCement, double qtdInk) {
		super();
		this.qtdFloor = qtdFloor;
		this.qtdCement = qtdCement;
		this.qtdInk = qtdInk;
	}
	public int getQtdFloor() {
		return qtdFloor;
	}
	public void setQtdFloor(int qtdFloor) {
		this.qtdFloor = qtdFloor;
	}
	public double getQtdCement() {
		return qtdCement;
	}
	public void setQtdCement(double qtdCement) {
		this.qtdCement = qtdCement;
	}
	public double getQtdInk() {
		return qtdInk;
	}
	public void setQtdInk(double qtdInk) {
		this.qtdInk = qtdInk;
	}
	@Override
	public String toString() {
//		DecimalFormat formato = new DecimalFormat("#.##");
//		qtdInk = Double.valueOf(formato.format(qtdInk));
		
		return "Material:\n* Quantidade de piso= " + qtdFloor+ " Unidades\n" 
				+"* Quantidade de cimento= " + String.format("%.2f", qtdCement) + " Litros\n"
				+"* Quantidade de tinta= " + String.format("%.2f", qtdInk) + " Litros";
	}
	
		
	
	
	
}
