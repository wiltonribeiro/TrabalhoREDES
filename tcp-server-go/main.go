package main

import (
	"fmt"
	"net"
	"redesServer/router"
	"bufio"
)

func main(){
	fmt.Println("Server running...")
	ln, _ := net.Listen("tcp", ":1234")

	fmt.Println("")
	for {
		conn, _ := ln.Accept()
		fmt.Println("aceito")
		go threadResponse(conn)
	}
}

func threadResponse(conn net.Conn){

		message, _ := bufio.NewReader(conn).ReadString('\n')
		fmt.Println(string(message))

		response := router.Router(string(message))

		fmt.Println(response)
		conn.Write([]byte(response))
		conn.Close()
}