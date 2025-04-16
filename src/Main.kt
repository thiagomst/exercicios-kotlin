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
//por hora trabalhada.

fun atividade15(){
    println("Informe aqui o número de dias trabalhado em um mês: ")
    val diasTrabalhado = readln().toInt()
    val horasPorDia = 8
    val horaTrabalhada = 25

    val salarioHora = diasTrabalhado * horasPorDia * horaTrabalhada

    println("O salário total no mês é de R$ ${"%.2f".format(salarioHora.toDouble())}")
}

fun main() {
    //atividade13()
    //atividade14()
    atividade15()
}