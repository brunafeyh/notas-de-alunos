# notas-de-alunos
Programa em Java que lê os dados de vários alunos, calcula a média de cada um e gera um relatório com os dados. O código está dividido em dois arquivos: Main.java e Aluno.java.

O arquivo Main.java contém o método principal (main) que é executado quando o programa é iniciado. Esse método faz o seguinte:

- Cria um objeto do tipo Scanner para ler a entrada do usuário pelo teclado.
- Pede ao usuário que informe o número de alunos que deseja cadastrar e armazena esse valor na variável n.
- Cria uma lista de objetos do tipo Aluno chamada alunos para guardar os dados dos alunos.
- Inicia um laço for que se repete n vezes, uma para cada aluno.
- Dentro do laço for, pede ao usuário que informe o nome, a idade, a matrícula e as quatro notas do aluno atual e armazena esses valores nas variáveis nome, idade, matricula e notas, respectivamente.
- Cria um objeto do tipo Aluno com os dados informados pelo usuário e o adiciona à lista alunos.
- Termina o laço for e calcula a média geral dos alunos somando as médias individuais e dividindo pelo número de alunos. Armazena esse valor na variável mediaGeral.
- Imprime o relatório dos alunos, mostrando a média geral e os dados de cada aluno, chamando o método imprimir() de cada objeto Aluno na lista alunos.

O arquivo Aluno.java contém a definição da classe Aluno, que representa um aluno com seus dados. Essa classe tem os seguintes atributos:

- nome: uma String que guarda o nome do aluno.
- idade: um int que guarda a idade do aluno.
- matricula: uma String que guarda a matrícula do aluno.
- notas: um array de double que guarda as quatro notas do aluno.

Essa classe também tem os seguintes métodos:

- Um construtor que recebe o nome, a idade e a matrícula do aluno e inicializa os atributos correspondentes.
- Um método setNotas que recebe um array de double com as notas do aluno e uma String com a matrícula do aluno e atribui esses valores aos atributos notas e matricula, respectivamente.
- Um método getMedia que calcula e retorna a média das notas do aluno, somando os elementos do array notas e dividindo pelo seu comprimento.
- Um método imprimir que imprime os dados do aluno, mostrando o nome, a idade, a matrícula e a média.
