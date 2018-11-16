package controller

import "redesServer/pojo"

type MaterialController struct{}

func (c MaterialController) CalculateMaterial(house pojo.House) (material pojo.Material){
	material.QtdFloor = int(house.Area/2)
	material.QtdCement = house.Height * house.Width * 10
	material.QtdInk = (house.Height * house.Width * 2) / 14
	return
}

type FinancingController struct{}

func (c FinancingController) CalculateFinancing(house pojo.House) (financing pojo.Financing){
	financing.TotalCost = house.Area * 4688
	financing.MonthCount = financing.TotalCost/1005
	financing.MonthCost = 1005
	return
}
