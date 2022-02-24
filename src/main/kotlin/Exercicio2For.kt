fun main(){


    //Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)


    var npar =0
    var nimp =0

    for (i in 1..10){
        print("DIGITE O ${i}º NUMERO: ")

        val num = readLine()!!.toInt()

        if(num%2==0){

            npar++
        }else{
            nimp++

        }

    }

    println("A QUANTIDADE DE NUMEROS PARES FOI DE $npar E A" +
            "QUANTIDADE DE NUMEROS IMPARES FOI DE $nimp")
}