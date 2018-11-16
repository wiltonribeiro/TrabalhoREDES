package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Financing {
	
	@SerializedName("total_cost")
	@Expose
	double totalCost;
	
	@SerializedName("month_count")
	@Expose
	double monthCount;
	
	@SerializedName("month_cost")
	@Expose
	double monthCost;
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getMonthCount() {
		return monthCount;
	}
	public void setMonthCount(double monthCount) {
		this.monthCount = monthCount;
	}
	public double getMonthCost() {
		return monthCost;
	}
	public void setMonthCost(double monthCost) {
		this.monthCost = monthCost;
	}
	
	public String toString() {
		return "* Custo total: " + String.format("R$%.2f", this.getTotalCost()) +
				"\n* Quantidade de meses: " + String.format("%.2f", this.getMonthCount()) + 
				"\n* Custo por mês: " + String.format("R$%.2f", this.getMonthCost());
	}
	
}
