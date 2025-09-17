1 - Configurar a aplicação

	- Definir URL, nome de usuário e senha no .properties

2 - Criar as Models

	- Gerar com base no Banco ou escrever com JPA
 
3 - Criar o Repository
	
	- Colocar anotação @Repository

	- Herdar Do JpaRepository<>

	- OPCIONAL: Criar métodos personalizados
 
4 - Criar o Service
	
	- Colocar anotação @Service

	- Injetar o Repository (para poder utilizar seus métodos)

	- Criar métodos do CRUD

		- Listar

		- Cadastrar

		- Editar

		- Deletar

5 - Criar a Classe Controller

	- Injetar o Service
 
	- Criar Métodos do CRUD
 
		- Listar
  
		- Cadastrar
  
		- Deletar
  
		- Editar
  
6 (Opcional) - Configurar Swagger

	- Acessar Maven Repository e adicionar dependência

7 - Testar o CRUD utilizando Postman
