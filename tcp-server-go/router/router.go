package router

import (
	"encoding/json"
	"redesServer/pojo"
	"redesServer/controllers/structure"
)

func Router(request string) (result string){
	message := pojo.Message{}
	json.Unmarshal([]byte(request), &message)

	if className := message.Class+"Structure"; className == "ControllerMaterialStructure" {
		if message.Method == "calculateMaterial" {
			result = structure.ControllerMaterialStructure{}.CalculateMaterial(message.Content)
		}
	} else if className == "ControllerFinancingStructure" {
		if message.Method == "calculateFinancing" {
			result = structure.ControllerFinancingStructure{}.CalculateFinancing(message.Content)
		}
	}

	return
}


