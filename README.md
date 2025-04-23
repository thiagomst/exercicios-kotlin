# 📘 Lista de Exercícios em Kotlin - Algoritmos

Este repositório contém uma coletânea de exercícios de lógica de programação resolvidos em **Kotlin**, baseados na série de aulas do professor **Gustavo Guanabara**.

Os exercícios foram divididos por **etapas (passos)** de aprendizado, contemplando desde conceitos básicos até desafios mais complexos envolvendo condições e lógica aplicada.

---

## 🧭 Estrutura dos Exercícios

### ✅ PASSO 01 - SEQUÊNCIAS BÁSICAS
Exercícios focados em entradas e saídas de dados, cálculos simples e uso de variáveis.

1) Escreva um programa que mostre na tela a mensagem "Olá, Mundo!"
2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório 
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
na tela a sua média na disciplina.
Ex: 
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte.
Ex: 
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
8) Desenvolva um programa que leia uma distância em metros e mostre os valores 
relativos em outras medidas.
Ex: 
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e 
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, 
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do 
segundo grau e mostre o valor de Delta.
12) Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto.
13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
seu novo salário, com 15% de aumento.
14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada.
16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um 
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele 
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule 
quantos dias de vida um fumante perderá e exiba o total em dias.
PASSO 02 - CONDIÇÕES BÁSICAS.

---

### 🔁 PASSO 02 - CONDIÇÕES BÁSICAS
Exercícios que usam estruturas condicionais simples.

17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
dela e depois mostre se ela pode ou não votar.
19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
não um bom aproveitamento (se ficou acima da média 7.0).
20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou 
ÍMPAR.
21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
BISSEXTO.
22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
alistamento.
23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos 
para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo 
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto
24) Faça um algoritmo que pergunte a distância que um passageiro deseja 
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para 
viagens até 200Km e R$0.45 para viagens mais longas.
25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. 
Analise seus comprimentos e diga se é possível formar um triângulo com essas 
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento 
de cada lado deve ser menor que a soma dos outros dois.

---

### 🔄 PASSO 03 - CONDIÇÕES COMPOSTAS
Exercícios com lógica condicional composta (if/else aninhados).

26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando 
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
27) Crie um programa que leia duas notas de um aluno e calcule a sua média, 
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO
28) Faça um programa que leia a largura e o comprimento de um terreno 
retangular, calculando e mostrando a sua área em m². O programa também 
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
29) Desenvolva um programa que leia o nome de um funcionário, seu salário, 
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20%
30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
de triângulo será formado: 
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes
31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o 
jogador vai tentar descobrir qual foi o valor sorteado.
33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
ela não pode exceder 30% do salário ou então o empréstimo será negado.
34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no 
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas.
 - abaixo de 18.5: Abaixo do peso
 - entre 18.5 e 25: Peso ideal
 - entre 25 e 30: Sobrepeso
 - entre 30 e 40: Obesidade
 - acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado 
da altura)
35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a 
tabela a seguir:
 - Carros populares (aluguel de R$90 por dia)
 - Até 100Km percorridos: R$0,20 por Km
 - Acima de 100Km percorridos: R$0,10 por Km
 - Carros de luxo (aluguel de R$150 por dia)
 - Até 200Km percorridos: R$0,30 por Km
 - Acima de 200Km percorridos: R$0,25 por Km
36) Um programa de vida saudável quer dar pontos atividades físicas que podem 
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade física no mês vale pontos
 - até 10h de atividade no mês: ganha 2 pontos por hora
 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 - acima de 20h de atividade no mês: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos) 
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, 
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, 
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. 
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%

---

PASSO 04 – REPETIÇÕES ENQUANTO
38) Escreva um programa que mostre na tela a seguinte contagem: 
6 7 8 9 10 11 Acabou!
39) Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
41) Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo 
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, 
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o 
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
45) O programa acima vai ter um problema quando digitarmos o primeiro valor 
maior que o último. Resolva esse problema com um código que funcione em qualquer 
situação.
46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 
8 + 10 + 12 + 14 + ... + 98 + 100.
47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 
450 + 400 + 350 + 300 + ... + 50 + 0
48) Faça um programa que leia 7 números inteiros e no final mostre o somatório 
entre eles.
49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles 
são pares e quantos são ímpares.
50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e 
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3
51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela 
qual foi o maior e qual foi o menor preço digitados.
52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida
53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando 
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de 
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4 
tentativas para tentar acertar.

-----

PASSO 05 – ENQUANTO COM FLAG
56) Crie um programa que leia vários números pelo teclado e mostre no final o 
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários. 
No final, mostre o total de salários pagos aos homens e o total pago às 
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não 
sempre que ler os dados de um funcionário.
58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa 
vai parar quando for digitada a idade 999. No final, mostre quantos alunos 
existem na turma e qual é a média de idade do grupo.
59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai 
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens
60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas. 
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos

-----------

PASSO 06 – REPETIÇÃO COM FAÇA ENQUANTO
61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura 
“faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de 
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou 
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre 
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.
63) Crie um programa usando a estrutura “faça enquanto” que leia vários números. 
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na 
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares
PASSO 07 – REPETIÇÃO COM PARA
64) Desenvolva um programa usando a estrutura “para” que mostre na tela a 
seguinte contagem:
0 5 10 15 20 25 30 35 40 Acabou!
65) Desenvolva um programa usando a estrutura “para” que mostre na tela a 
seguinte contagem:
100 90 80 70 60 50 40 30 20 10 0 Acabou!
66) Escreva um programa que leia um número qualquer e mostre a tabuada desse 
número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...
67) Faça um programa usando a estrutura “para” que leia um número inteiro 
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura 
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres 
d) O maior peso entre os homens
69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma 
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e 
a soma entre todos os valores da sequência.
70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência 
de Fibonacci:
1 1 2 3 5 8 13 21...

----------------

PASSO 08 – VETORES
71) Faça um programa que preencha automaticamente um vetor numérico com 8 
posições, conforme abaixo:
999 999 999 999 999 999 999 999
0 1 2 3 4 5 6 7
72) Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 10 15 20 25 30 35 40 45 50
0 1 2 3 4 5 6 7 8 9
73) Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9
74) Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9
75) Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros 
elementos da sequência de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
76) Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores 
gerados na tela.
77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No 
final, mostre uma listagem com todos os nomes informados, na ordem inversa 
daquela em que eles foram informados.
78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final, 
mostre o vetor inteiro na tela e em seguida mostre em que posições foram 
digitados valores que são múltiplos de 10.
79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. 
No final, mostre quais são os números pares que foram digitados e em que 
posições eles estão armazenados.
80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um 
número (chave) e seu programa deve mostrar em que posições essa chave foi 
encontrada. Mostre também quantas vezes a chave foi sorteada.
81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No 
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade
82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em 
um vetor. No final, mostre: 
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece
83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números 
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os 
números gerados e depois coloque o vetor em ordem crescente, mostrando no final 
os valores ordenados.
84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses 
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem 
contendo apenas os dados das pessoas menores de idade.
85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e 
guarde esses dados em três vetores. No final, mostre uma listagem contendo 
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.

------------

PASSO 09 – PROCEDIMENTOS
86) Crie um programa que tenha um procedimento Gerador() que, quando chamado, 
mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
Ex: Ao chamar Gerador() aparece:
+-------=======------+
 Olá, Mundo! 
+-------=======------+
87) Crie um programa que melhore o procedimento Gerador() da questão anterior 
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+-------=======------+
 Aprendendo Portugol 
+-------=======------+
88) Crie um programa que melhore o procedimento Gerador() da questão anterior 
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
 Aprendendo Portugol
 Aprendendo Portugol
 Aprendendo Portugol
 Aprendendo Portugol
+-------=======------+
89) Crie um programa que melhore o procedimento Gerador() da questão anterior 
para que o programador possa escolher uma entre três bordas:
 +-------=======------+ Borda 1
 ~~~~~~~~:::::::~~~~~~~ Borda 2
 <<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
 Portugol Studio
 Portugol Studio
 Portugol Studio
~~~~~~~~:::::::~~~~~~~
90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses 
valores para um procedimento Somador() que vai calcular e mostrar a soma entre 
eles.
91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses 
valores para um procedimento Maior() que vai verificar qual deles é o maior e 
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem 
informando essa característica.
92) Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como 
parâmetro é PAR ou ÍMPAR.
93) Faça um programa que tenha um procedimento chamado Contador() que recebe 
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao 
procedimento, que vai mostrar a contagem na tela.
Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado 
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos 
termos da sequência serão mostrados na tela. O seu procedimento deve receber 
esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex: 
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM

---------

PASSO 10 – FUNÇÕES
95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai 
receber dois parâmetros e vai retornar o resultado da soma entre eles para o 
programa principal.
96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de 
um aluno e retornar a sua média para o programa principal.
97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma 
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o 
maior entre eles.
98) Crie um programa que tenha uma função SuperSomador(), que vai receber dois 
números como parâmetro e depois vai retornar a soma de todos os valores no 
intervalo entre os valores recebidos.
Ex: 
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
99) Faça um programa que possua uma função chamada Potencia(), que vai receber 
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da 
exponenciação.
Ex: Potencia(5,2) vai calcular 52 = 25 
100) Melhore o exercício 96, criando além da função Media() uma outra função 
chamada Situacao(), que vai retornar para o programa principal se o aluno está 
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como 
parâmetro o resultado retornado pela função Media()


## 🛠 Tecnologias Utilizadas

- [Kotlin](https://kotlinlang.org/) — Linguagem principal
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) — Ambiente de desenvolvimento

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/kotlin-algoritmos-guanabara.git
   cd kotlin-algoritmos-guanabara
