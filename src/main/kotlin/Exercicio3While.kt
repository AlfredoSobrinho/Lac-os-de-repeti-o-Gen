fun main(){
    //3- Solicitar a idade de várias pessoas e imprimir: Total de
    // pessoas com menos de 21 anos. Total de pessoas
   // com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

    var idade = 0
    var soma1 = -1
    var soma2 = 0


    while(idade != -99){
        print("DIGITE SUA IDADE: ")
        idade = readLine()!!.toInt()

        if(idade < 21){
            soma1++
        }else if(idade > 50){
            soma2++
        }
    }
    println("A QUANTIDADE DE PESSOAS MENORES DE 21 É: $soma1 " +
            "e a quantidade de pessoas maiores de 50 anos é: $soma2")



}