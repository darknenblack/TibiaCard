# TibiaCard

Trabalho 4 da disciplina Construção de Compiladores

<table>
  <thead>
    <tr>
      <th colspan='2'>Desenvolvido por</th>
    </tr>
  </thead>
    <tr>
      <td>Ariane Cristina Gomes</td>
      <td>743507</td>
    </tr>
    <tr>
      <td>Sabrina da Silva Miranda</td>
      <td>743595</td>
    </tr>
</table>


## O projeto
Esse projeto teve como objetivo desenvolver um compilador para a linguagem declarativa TibiaCard, inventada pelas alunas, que gera cards em HTML de personagens do jogo Tibia. 
Esses cards apresentam individualmente, as características, magias utilizadas e quantidades de mana gasta.
<br><br><br>
<img src=/imagens/exemplo_cards.png>
<br><br>
## A Linguagem TibiaCard
Para utilizar a linguagem é preciso, obrigatóriamente declarar um personagem com suas características. 
É possível declarar tantos personagens quanto se quiser, cada qual dentro de um bloco inicio personagem-fim personagem, do seguinte modo:

```
inicio personagem
	[string-NomedoPersonagem]: [string-vocação]
	[int]: level
	[boolean]: premium account
fim personagem
```

Exemplo:
```
inicio personagem
	Khiary: elite knight
	400: level
	sim: premium account
fim personagem
```
*As vocações e o nome do personagem devem ser escritas de acordo com as determinações originais do jogo.*


Existem duas ações que um personagem pode realizar relacionado ao uso de magias: **Ataque** e **Cure**. Para executar ambas é preciso escrever o nome de personagem já declarado e todas as magias que se deseja realizar:
```
Ataque(Khiany, exori san)
Cure(Khiary, exura ico, exura gran ico, exori)
```
Ao executar o programa, será gerado um código em HTML com cards individuais para cada personagem, apresentando suas características, magias utilizadas e quantidadades de mana gasta para tal.
<br><br>
## Compilando
Todos o desenvolvimento do projeto foi realizado diretamente pela ferramente Apache NetBeans IDE 12 e para compilar é preciso seguir algum dos seguintes passos, após importar o projeto no programa em questão:

* Clicar no ícone com o martelo (F11) <img src=imagens/build.png>
* Clicar com o botão direito do mouse sobre o projeto → build

Assim, será gerado um arquivo denominado como <TibiaCard-1.0-SNAPSHOT-jar-with-dependencies.jar> dentro da pasta TibiaCard/target do Projeto.
<br><br>
## Executando
Para executar é necessário o uso de três parâmetros:

1.  caminho absoluto do arquivo do compilador
2.  caminho absoluto do arquivo de teste em .txt
3.  caminho absoluto para um arquivo de saída .html

Tendo esses parâmetros, é preciso executar o comando **jar -jar** através de um terminal, desse modo:
```
java -jar /home/usuario/NetBeansProjects/TibiaCard/target/TibiaCard-1.0-SNAPSHOT-jar-with-dependencies.jar /caminho_absoluto_arquivo_de_entrada.txt /caminho_absoluto_arquivo_de_saida.html

```
Exemplo:
```
java -jar /home/usuario/NetBeansProjects/TibiaCard/target/TibiaCard-1.0-SNAPSHOT-jar-with-dependencies.jar /home/usuario/NetBeansProjects/casos-teste/entradaInterpretacao_01.txt /home/usuario/NetBeansProjects/casos-teste/saidaInterpretacao.html

```

E para visualizar o resultado basta abrir o arquivo em qualquer navegador :)

*Para utilizar casos de teste prontos, verificar o diretório casos-teste.*



