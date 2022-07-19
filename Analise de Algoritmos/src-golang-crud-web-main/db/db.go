package db

import (
	"database/sql"
	_ "github.com/go-sql-driver/mysql"
)

func ConectaComBancoDeDados() *sql.DB {
	dbDriver := "mysql"
	dbUser := "admin"
	dbPass := "senha"
	dbName := "crud"
	db, err := sql.Open(dbDriver, dbUser+":"+dbPass+"@/"+dbName)
	if err != nil {
		panic(err.Error())
	}
	return db
}
