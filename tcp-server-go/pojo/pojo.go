package pojo

type Message struct {
	Class string `json:"class"`
	Method string `json:"method"`
	Content string `json:"content"`
}

type House struct {
	Height float64 `json:"height"`
	Width float64 `json:"width"`
	Length float64 `json:"length"`
	Area float64 `json:"area"`
}

type Financing struct {
	TotalCost   float64 `json:"total_cost"`
	MonthCount float64 `json:"month_count"`
	MonthCost float64 `json:"month_cost"`
}

type Material struct {
	QtdFloor int `json:"qtd_floor"`
	QtdCement float64 `json:"qtd_cement"`
	QtdInk float64 `json:"qtd_ink"`
}


