fun main() {


    //6-Escrever um programa que receba vários números
    // inteiros no teclado. E no final imprimir a
    // média dos números múltiplos de 3.
    // Para sair digitar 0(zero).(DO...WHILE)

    var soma = 0.0
    var cont = 0


    do {

        print("DIGITE QUALQUER NUMERO DIFERENTE DE 0: ")
        val num = readLine()!!.toInt()

        if (num % 3 == 0&& num!=0) {

            cont++
            soma += num
        }


    } while (num != 0)

val media = soma / cont


println("DENTRE OS NUMEROS DIGITADOS, $cont SÃO DIVIDIDOS POR 3 " +
        "E A MÉDIA DESSES NÚMEROS É $media")

}
