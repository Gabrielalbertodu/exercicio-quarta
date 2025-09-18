# Sistema de Gestão Educacional (Java MVC Básico)

Este projeto demonstra uma estrutura MVC básica em Java para um sistema de gestão educacional, conforme as entidades definidas na modelagem introdutória.

## Estrutura do Projeto

```
java_sistema_educacional/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── sistemaeducacional/
│                   ├── controller/         # Camada Controller
│                   │   ├── AlunoController.java
│                   │   └── UsuarioController.java
│                   ├── model/              # Camada Model
│                   │   ├── dao/            # Data Access Objects
│                   │   │   ├── AlunoDAO.java
│                   │   │   ├── ProfessorDAO.java
│                   │   │   └── UsuarioDAO.java
│                   │   └── entities/       # Entidades do domínio
│                   │       ├── Aluno.java
│                   │       ├── Curso.java
│                   │       ├── Disciplina.java
│                   │       ├── Funcionario.java
│                   │       ├── Matricula.java
│                   │       ├── Nota.java
│                   │       ├── Professor.java
│                   │       └── Usuario.java
│                   ├── view/               # Camada View
│                   │   └── MainView.java
│                   └── MainApp.java        # Ponto de entrada da aplicação
└── README.md
```

## Como Compilar e Executar

Este projeto é um exemplo básico e pode ser compilado e executado usando um compilador Java (JDK) e um ambiente de desenvolvimento (IDE) como IntelliJ IDEA, Eclipse ou VS Code com as extensões Java.

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior instalado.

### Passos para Compilar e Executar via Linha de Comando (Exemplo)

1. **Navegue até o diretório raiz do projeto:**
   ```bash
   cd java_sistema_educacional
   ```

2. **Compile os arquivos Java:**
   ```bash
   javac src/main/java/com/sistemaeducacional/model/entities/*.java \
         src/main/java/com/sistemaeducacional/model/dao/*.java \
         src/main/java/com/sistemaeducacional/controller/*.java \
         src/main/java/com/sistemaeducacional/view/*.java \
         src/main/java/com/sistemaeducacional/MainApp.java \
         -d out
   ```
   *Nota: Pode ser necessário ajustar o comando `javac` dependendo da sua versão do JDK e da complexidade das dependências. Em um projeto real, seria usado um sistema de build como Maven ou Gradle.*

3. **Execute a aplicação:**
   ```bash
   java -cp out com.sistemaeducacional.MainApp
   ```

### Executando em uma IDE (Recomendado)

1. **Importe o projeto:**
   - Abra sua IDE (IntelliJ IDEA, Eclipse, VS Code).
   - Selecione "Import Project" ou "Open Project".
   - Navegue até o diretório `java_sistema_educacional` e selecione-o.
   - A IDE deve reconhecer a estrutura do projeto Java.

2. **Execute a classe `MainApp`:**
   - Encontre `src/main/java/com/sistemaeducacional/MainApp.java`.
   - Clique com o botão direito no arquivo e selecione "Run 'MainApp.main()'" ou uma opção similar.

## Funcionalidades Implementadas (Básicas)

- **Gerenciamento de Usuários:** Criar, buscar, listar, atualizar e remover usuários.
- **Gerenciamento de Alunos:** Criar, buscar, listar, atualizar e remover alunos.
- **Interface de Console:** Interação básica via linha de comando para demonstrar o fluxo MVC.

## Observações

- Este é um projeto simplificado para demonstrar a estrutura MVC. Em um projeto real, seriam utilizadas frameworks como Spring Boot, um banco de dados persistente (ex: PostgreSQL, MySQL) e uma interface gráfica ou web mais robusta.
- Os DAOs utilizam listas em memória para simular o armazenamento de dados, o que significa que os dados não são persistidos após o encerramento da aplicação.

