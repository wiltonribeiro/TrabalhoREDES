package structure

import (
	"redesServer/controllers/controller"
	"redesServer/pojo"
	"encoding/json"
)

type ControllerFinancingStructure struct {}

func (c ControllerFinancingStructure) CalculateFinancing(houseString string) string {
	controllerFinancing := controller.FinancingController{}

	house := pojo.House{}
	json.Unmarshal([]byte(houseString), &house)

	financing := controllerFinancing.CalculateFinancing(house)
	data, _ := json.Marshal(financing)

	return string(data[:])

}

type ControllerMaterialStructure struct {}

func (c ControllerMaterialStructure) CalculateMaterial(houseString string) string {
	controllerMaterial := controller.MaterialController{}

	house := pojo.House{}
	json.Unmarshal([]byte(houseString), &house)

	material := controllerMaterial.CalculateMaterial(house)
	data, _ := json.Marshal(material)

	return string(data[:])
}