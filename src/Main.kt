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

fun atividade23(){
    println("Infomre aqui o seu nome: ")
    val nome = readln()
    println("Informe agora F para o sexo (Feminino) ou M para (Masculino): ")
    val sexo = readln()
    println("Informe aqui o valor das suas compras: ")
    val valor = readln().toDouble()

    if(sexo == "F"){
        val desconto =  valor * 0.13
        val valorFinal = valor - desconto
        println("${nome}, Voce gastou R$ ${"%.2f".format(valor)} e teve um desconto de R$ ${"%.2f".format(desconto)} e vai pagar R$ ${"%.2f".format(valorFinal)}")
    }else if ( sexo == "M"){
        val desconto =  valor * 0.05
        val valorFinal = valor - desconto
        println("${nome}, Voce gastou R$ ${"%.2f".format(valor)} e teve um desconto de R$ ${"%.2f".format(desconto)} e vai pagar R$ ${"%.2f".format(valorFinal)}")
    }
}

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
    atividade23()
}