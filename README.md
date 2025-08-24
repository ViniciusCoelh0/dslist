# 🎮 DSList - Catálogo de Games

Projeto desenvolvido em **Java com Spring Boot** para gerenciar uma lista de jogos.  
O sistema permite listar games, organizá-los em listas personalizadas e alterar a ordem dos jogos.

---

## 📌 Funcionalidades
- Listagem de jogos
- Listagem de listas de jogos
- Movimentação da posição de um jogo dentro de uma lista
- Estrutura REST com DTOs e Services

---

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate**
- **Banco de Dados H2 (testes)**
- **Maven**

---

## 📂 Estrutura do Projeto
src/main/java/com/coelhovinicius/dslist

`┣ 📂 controllers -> Controllers (APIs REST)`

`┣ 📂 dto -> Data Transfer Objects`

`┣ 📂 entities -> Entidades JPA`

`┣ 📂 projections -> Projeções SQL`

`┣ 📂 repositories -> Repositórios JPA`

`┣ 📂 services -> Regras de negócio`

`┗ 📂 webconfig -> Configurações web`


---

## ▶️ Como Rodar o Projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/SEU-USUARIO/dslist.git
cd dslist

http://localhost:8080
```
Metodos para testar (Postman):
```bash
GET: http://localhost:8080/games
GET: http://localhost:8080/games/5
GET: http://localhost:8080/lists
GET: http://localhost:8080/lists/2/games
POST: http://localhost:8080/lists/2/replacement

Metodo JSON para o POST: 

{
	"sourceIndex": 3,
    "destinationIndex" : 1
}

```

## 📖 Autor

#### 👤 Vinicius Coelho
#### 📌 Estudante de Engenharia da Computação | Desenvolvedor Java
#### LinkedIn: www.linkedin.com/in/vinicius-dantas-coelho

