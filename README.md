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

## A Linguagem TibiaCard
Para escrever na linguagem é preciso declarar um personagem com suas características:
```
inicio personagem
	Khiary: elite knight
	400: level
	sim: premium account
fim personagem
```

É possível declarar tantos personagens quanto se quiser, cada qual dentro de um bloco inicio personagem-fim personagem.

Existem duas ações que um personagem pode realizar relacionado ao uso de magias: **Ataque** e **Cure**. Para executar ambas é preciso escrever o nome de personagem já declarado e todas as magias que se deseja realizar:
```
Ataque(Khiany, exori san)
Cure(Khiary, exura ico, exura gran ico, exori)
```
Ao executar o programa, será gerado um código em HTML com cards individuais para cada personagem, apresentando suas características, magias utilizadas e quantidadades de mana gasta para tal.
