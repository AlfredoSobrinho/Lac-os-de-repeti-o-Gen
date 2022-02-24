fun main(){

       //5-Crie um programa que leia um número do teclado
       // até que encontre um número igual a
       // zero. No final, mostre a soma dos números
       // digitados.(DO...WHILE)

    var soma =0
    do{
        print("DIGITE UM NUMERO: ")
       val num = readLine()!!.toInt()

       soma = soma + num


    }while(num!=0)
    println("A SOMA DOS NUMEROS É: $soma")



    }










