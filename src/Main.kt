//1) Escreva um programa que mostre na tela a mensagem "Olá, Mundo!"
fun olaMundo(){
    println("Olá Mundo!")
}

//2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
//Ex:
//Qual é o seu nome? João da Silva
//Olá João da Silva, é um prazer te conhecer!

fun nome(){
    print("Qual é o seu nome? ")
    val nome = readln().toString()
    print("Olá ${nome}, é um prazer te conhecer " )
}

// 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

fun atividade3(){
    println("Informe aqui o seu Nome? ")
    val nome = readln()
    val salario = 1850.45
    println("Olá, $nome!, seu salario é R$ ${salario}")
}

//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

fun atividade4(){
    println("Digite um número: ")
    val numero1 = readln().toInt()
    println("Digite outro número: ")
    val numero2 = readln().toInt()
    val soma = numero1 + numero2
    println("A soma de ${numero1} + ${numero2} = ${soma}")
}

//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5
fun atividade5(){
    println("Digite a primeira Nota: ")
    val nota1 = readln().toDouble()
    print("Digiete a Segunda Nota: ")
    val nota2 = readln().toDouble()
    val result = (nota1 + nota2) / 2
    println("A média entre ${nota1} e ${nota2} = ${result}")
}

//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

fun atividade6(){
    print("informe um número inteiro e mostre o seu antecessor e seu sucessor. ")
    val numero1 = readln().toInt()
    println("O numero é ${numero1} seu antecessor é ${numero1-1} e seu sucessor é ${numero1+1}")
}

//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

fun atividade7(){
    println("Digite um número real e mostre na tela o seu dobro e a sua terça parte.")
    val numero = readln().toDouble()

    val dobro = numero * 2
    val tercaParte = numero / 3
    println("Dobro é ${"%.2f".format(dobro)}")
    println("Terça parte é ${"%.2f".format(tercaParte)}")

}

//8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0m

fun atividade8(){
    println("Digite uma distância em metros e mostre os valores relativos em outras medidas.")
    val media = readln().toDouble()
    val km = media / 1000
    println("${media} em KM é ${km}")
    val hm = media / 100
    println("${media} em Hm é ${hm}")
    val dam = media / 10
    println("${media} em Dam é ${dam}")
    val dm = media * 10
    println("${media} em Dm é ${dm}")
    val cm = media * 100
    println("${media} em Cm é ${cm}")
    val mm = media * 1000
    println("${media} em mm é ${mm}")

}

//9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

fun atividade9() {
    println("Fale quantos R$ você tem na sua carteira:")
    val reais = readln().toDouble()
    val cotacaoDolar = 3.45
    val emDolar = reais / cotacaoDolar
    println("Você tem R$%.2f, que em dólar está valendo US$%.2f".format(reais, emDolar))
}

//10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

fun atividade10() {
    println("Informe a largura da parede (em metros):")
    val largura = readln().toDouble()

    println("Informe a altura da parede (em metros):")
    val altura = readln().toDouble()

    val area = largura * altura
    val tintaNecessaria = area / 2

    println("A área da parede é ${"%.2f".format(area)} m².")
    println("Você vai precisar de aproximadamente ${"%.2f".format(tintaNecessaria)} litro(s) de tinta.")
}

//11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//segundo grau e mostre o valor de Delta.

fun atividade11(){
    println("Informe o valor de A: ")
    val a = readln().toInt()
    println("Informe o valor de B: ")
    val b = readln().toInt()
    print("Informe o valor de C: ")
    val c = readln().toInt()
    println("Informe o valor de B:")

    val delta = (b*b) - (4 * a * c)
    println("o resultado de Delta é ${delta}")
}

//12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto.

fun atividade12() {
    println("Informe o preço do produto:")
    val preco = readln().toDouble()

    val desconto = preco * 0.05
    val precoPromocional = preco - desconto

    println("O valor do desconto é R$ ${"%.2f".format(desconto)}")

}

//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

//fun atividade13(){
//    println("Inform aqui o seu Salário por favor: ")
//    val salario = readln().toDouble()
//
//    val aumento = salario * 0.15
//    val novoSalario = salario + aumento
//
//    println("O aumento de 15% equivale a R$ ${"%.2f".format(aumento)}")
//    println("Antes o seu salário era R$ ${"%.2f".format(salario)}")
//    println("Agora com o aumento de 15%, passa a ser R$ ${"%.2f".format(novoSalario)}")
//
//
//}

//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
//
//    fun atividade14(){
//        println("Informe aqui a quantidade de Km percorridos pelo carro que foi alugado: ")
//        val km = readln().toDouble()
//        println("Agora informe quantos dias o carro ficou alugado por você: ")
//        val aluguel = readln().toInt()
//        val diaria = 90
//        val kmRodado = 0.20
//
//        val valorDiaria = aluguel * diaria
//        val valorKm = km * kmRodado
//
//        println("Vovê vai pagar no total de R$ ${valorDiaria}  pelo aluguel do carro ")
//        println("E para finaliar você vai pagar + R$ ${valorKm}, por KM rodado. " )
//}

//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
////por hora trabalhada.
//
//fun atividade15(){
//    println("Informe aqui o número de dias trabalhado em um mês: ")
//    val diasTrabalhado = readln().toInt()
//    val horasPorDia = 8
//    val horaTrabalhada = 25
//
//    val salarioHora = diasTrabalhado * horasPorDia * horaTrabalhada
//
//    println("O salário total no mês é de R$ ${"%.2f".format(salarioHora.toDouble())}")
//}

//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
////quantos dias de vida um fumante perderá e exiba o total em dias.
//
//fun atividade16(){
//    println("Informe quantos cigarros você fuma por dia: ")
//    val cigarro = readln().toInt()
//    println("Diga quantos anos você já fumou ou fuma. ")
//    val anos = readln().toInt()
//
//    val totalCigarros = cigarro * anos * 365
//
//    val minutosPerdidos = totalCigarros * 10
//    val diasPerdidos = minutosPerdidos.toDouble() / 1440
//
//    val minutosFormatado = "%.2f".format(minutosPerdidos.toDouble())
//    val diasFormatado = "%.2f".format(diasPerdidos.toDouble())
//
//    println("De acordo com a quantidade de cigarros fumados por dia ($cigarro), você perdeu $minutosFormatado minutos de vida, o que equivale a aproximadamente $diasFormatado dias.")
//
//}

//================================== PASSO 02 - CONDIÇÕES BÁSICAS ======================================================

//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

//fun atividade17(){
//    println("Informe a velocidade do carro: ")
//    val velocidadeCarro = readln().toInt()
//
//    val velocidadeVia = 80
//    if (velocidadeCarro > velocidadeVia) {
//        val acimVelocidade = velocidadeCarro - velocidadeVia
//        val multa = (acimVelocidade * 5).toDouble()
//        println("Você foi multado no valor de R$ ${"%.2f".format(multa)} Reais")
//    }else {
//        println("Velocidade dentro do limite.")
//    }
//}

//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
////dela e depois mostre se ela pode ou não votar.
//
//fun atividade18(){
//    println("Informe aqui a Data do seu nascimento: ")
//    val nacimento = readln().toInt()
//
//    val idade = 2025 - nacimento
//    if (idade >= 18 ){
//        println("Você já pode votar pois é maior de idade $idade anos.")
//    }else {
//        println("Você não pode votar pois ainda é menor de idade $idade anos.")
//    }
//}

//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).
//
//fun atividade19(){
//    println("Informe aqui o seu nome: ")
//    val nome = readln()
//
//    println("Informe o valor da primeira nota: ")
//    val notaA = readln().toDouble()
//    println("Informe o valor da segunda nota: ")
//    val notaB = readln().toDouble()
//
//    val media = (notaA + notaB) / 2
//
//    if (media >= 7) {
//        println("Parabéns ${nome}, pois sua média é ${"%.2f".format(media)} e está acima da média.")
//    } else {
//        println("${nome}, você ficou abaixo da média. Sua média foi ${"%.2f".format(media)}.")
//    }
//}

//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.

//fun atividade20(){
//    println("Digiti aqui um número inteiro para saber se ele é PAR ou ÍMPAR: ")
//    val numero = readln().toInt()
//
//    if (numero  % 2 == 0){
//        println("O número ${numero} é Par")
//    }else{
//        println("O número ${numero} é Impar")
//    }
//}

//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
////BISSEXTO.
//
//fun atividade21(){
//    println("Digite aqui um determinando ano para ver se ele é ou não Bissexto. ")
//    val ano = readln().toInt()
//
//    val anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
//
//    if (anoBissexto){
//        println("O ano de ${ano}, é Bissexto e tem 366 dias")
//    }else{
//        println("O ano de ${ano}, não é um ano Bissexto e tem 365 dias. ")
//    }
//}

//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento. - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.
//
//fun atividade22(){
//    println("Informe aqui a Data do seu nascimento: ")
//    val nacimento = readln().toInt()
//
//    val idade = 2025 - nacimento
//
//    if (idade < 18){
//        println("Você ainda não pode se alista pois tem ${idade} anos de idade, esta faltando ${18 - idade} anos. ")
//    }else if (idade == 18 ){
//        println("Você já pode se alista pois ja completou ${idade} anos de idade.")
//    }else {
//        println("Você já tem ${idade} anos de idade, e ja se passaram ${idade - 18} anos. ")
//    }
//
//}

//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto

//fun atividade23(){
//    println("Infomre aqui o seu nome: ")
//    val nome = readln()
//    println("Informe agora F para o sexo (Feminino) ou M para (Masculino): ")
//    val sexo = readln()
//    println("Informe aqui o valor das suas compras: ")
//    val valor = readln().toDouble()
//
//    if(sexo == "F"){
//        val desconto =  valor * 0.13
//        val valorFinal = valor - desconto
//        println("${nome}, Voce gastou R$ ${"%.2f".format(valor)} e teve um desconto de R$ ${"%.2f".format(desconto)} e vai pagar R$ ${"%.2f".format(valorFinal)}")
//    }else if ( sexo == "M"){
//        val desconto =  valor * 0.05
//        val valorFinal = valor - desconto
//        println("${nome}, Voce gastou R$ ${"%.2f".format(valor)} e teve um desconto de R$ ${"%.2f".format(desconto)} e vai pagar R$ ${"%.2f".format(valorFinal)}")
//    }
//}

//fun atividade24() {
//    println("Informe a distância que você deseja percorrer (em Km): ")
//    val km = readln().toInt()
//
//    val preco = 0.50
//    val preco1 = 0.45
//
//    if (km <= 200) {
//        val total = km * preco
//        println("Você vai pagar R$%.2f, pois a distância é até 200Km.".format(total))
//    } else {
//        val total = km * preco1
//        println("Você vai pagar R$%.2f, pois a distância é maior que 200Km.".format(total))
//    }
//}


//25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois.
//
//fun atividade25(){
//    println("informe para mim um valor para A: ")
//    val a = readln().toDouble()
//    println("informe para mim um valor para B: ")
//    val b = readln().toDouble()
//    println("informe para mim um valor para C: ")
//    val c = readln().toDouble()
//
//    if (a < b + c && b < a + c && c < a + b){
//        println("Desta forma é possível formar um triângulo")
//    }
//    else{
//        println("Não é possível formar um triângulo")
//
//    }
//
//
//}

//-----------------------PASSO 03 - CONDIÇÕES COMPOSTAS--------------------------------------------------------------

//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
// - O primeiro valor é o maior
// - O segundo valor é o maior
// - Não existe valor maior, os dois são iguais
//
//fun atividade26(){
//    println("Informe aqui um valor: ")
//    val numero1 = readln().toInt()
//    println("Informe aqui um segundo valor: ")
//    val numero2 = readln().toInt()
//
//    if(numero1 > numero2){
//        println("O primeiro número ${numero1} é maior que o segundo número ${numero2}: ")
//    }else if (numero1 < numero2){
//        println("O segundo número ${numero2} é maior que o primeiro número ${numero1}")
//    }else{
//        println("Não existe valor maior, os dois são iguais primeiro número ${numero1} segundo número ${numero2} ")
//    }
//}

//27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
//mostrando uma mensagem no final, de acordo com a média atingida:
//- Média até 4.9: REPROVADO
//- Média entre 5.0 e 6.9: RECUPERAÇÃO
//- Média 7.0 ou superior: APROVADO

//fun atividade27() {
//    println("Informe aqui a sua primeira nota: ")
//    val nota1 = readln().toDouble()
//    println("Informe aqui a sua segunda nota: ")
//    val nota2 = readln().toDouble()
//
//    val media = (nota1 + nota2) / 2
//
//    when {
//        media <= 4.9 -> println("A média é $media. Você está REPROVADO.")
//        media in 5.0..6.9 -> println("A média é $media. Você está de RECUPERAÇÃO.")
//        media >= 7.0 -> println("A média é $media. Você está APROVADO.")
//        else -> println("Média inválida.")
//    }
//}

//fun atividade27(){
//    println("Informe aqui a sua primeira nota: ")
//    val nota1 = readln().toDouble()
//    println("Informe aqui a sua segunda nota: ")
//    val nota2 = readln().toDouble()
//
//    val media = (nota1 + nota2) / 2
//
//    if (media <= 4.9){
//        println("A média que você atingiu foi $media. Você está REPROVADO.")
//    }else if (media >= 5.0 && media <= 6.9){
//        println("A média que você atingiu foi $media. Você está RECUPERAÇÃO.")
//    }else if (media >= 7.0){
//        println("A média que você atingiu foi $media. Você está APROVADO.")
//
//    }
//}

//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m² = TERRENO POPULAR
//- Entre 100m² e 500m² = TERRENO MASTER
//- Acima de 500m² = TERRENO VIP

//fun atividade28(){
//    println("Digite aqui a largura do seu terreno: ")
//    val largura = readln().toDouble()
//    println("Digite aqui o comprimento do seu lote: ")
//    val comprimento = readln().toDouble()
//
//    val area = largura * comprimento
//
//    if (area < 100){
//        println("Abaixo de 100m², tamanho do terreno ${"%.2f".format(area)}m² TERRENO POPULAR")
//    }else if (area >= 100 && area <= 500){
//        println("Entre 100 e 500, tamanho do terreno ${"%.2f".format(area)}m² TERRENO MASTER")
//    }else{
//        println("Acima de 500, o tamanho do terreno ${"%.2f".format(area)}m² TERRENO VIP")
//    }
//}

//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
//- Até 3 anos de empresa: aumento de 3%
//- entre 3 e 10 anos: aumento de 12.5%
//- 10 anos ou mais: aumento de 20%

//fun atividade29(){
//    println("Informe aqui seu nome: ")
//    val nome = readln()
//    println("Informe aqui seu salario: ")
//    val salario = readln().toDouble()
//    println("Informe quantos anos você trabalha na empresa ")
//    val anos = readln().toInt()
//    var resultado: Double = 0.0
//    //val resultado = (anos * 0.03 && anos * 12.5 || anos * 0.20)
//
//    if (anos < 4){
//        resultado = salario * 1.03
//
//    } else if( anos in 3..10 ){
//        resultado = salario * 1.125
//    } else if (anos > 10) {
//        resultado = salario * 1.2
//    }
//
//    println("${nome}, você tem ${anos} anos de empresa ")
//    println("Seu novo salário é de: R$${resultado} ")
//}

//30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de triângulo será formado:
//- EQUILÁTERO: todos os lados iguais
//- ISÓSCELES: dois lados iguais
//- ESCALENO: todos os lados diferentes

//fun atividade30(){
//    println("Informe para mim um valor para A: ")
//    val a = readln().toDouble()
//    println("Informe para mim um valor para B: ")
//    val b = readln().toDouble()
//    println("Informe para mim um valor para C: ")
//    val c = readln().toDouble()
//
//    val triangulo = a < b + c && b < a + c && c < a + b
//
//    if (triangulo){
//        if (a == b && b == c){
//            println("EQUILÁTERO: todos os lados iguais")
//        } else if (a == b || b == c || a == c){
//            println("ISÓSCELES: dois lados iguais")
//        } else {
//            println("ESCALENO: todos os lados diferentes")
//        }
//    }
//}


fun main() {
    //atividade13()
    //atividade14()
    //atividade15()
    //atividade16()
    //atividade17()
    //atividade18()
    //atividade19()
    //atividade20()
    //atividade21()
    //atividade22()
    //atividade23()
    //atividade24()
    //atividade25()
    //atividade26()
    //atividade27()
    //atividade28()
    //atividade29()
    atividade30()
}
