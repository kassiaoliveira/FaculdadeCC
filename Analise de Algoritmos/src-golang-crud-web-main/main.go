package main

import (
	"net/http"
	"src-go-web/routes"
)

func main() {
	routes.CarregaRotas()
	http.ListenAndServe(":8000", nil)
}
