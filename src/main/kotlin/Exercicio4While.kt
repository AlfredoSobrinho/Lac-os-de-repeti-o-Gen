fun main (){


    //    4- Uma empresa desenvolveu uma pesquisa
    //    para saber as características psicológicas dos
    //    indivíduos de uma região. Para tanto, a cada uma das
    //    pessoas era perguntado: idade, sexo
    //    (1-feminino / 2-masculino / 3-Outros), e as opções
    //    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se
    //    a pessoa era agressiva). Pede-se para elaborar um sistema que
    //    permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

    //    • o número de pessoas calmas;
    //    • o número de mulheres nervosas;
    //    • o número de homens agressivos;
    //    • o número de outros calmos;
    //    • o número de pessoas nervosas com mais de 40 anos;
    //    • o número de pessoas calmas com menos de 18 anos.


    var cont = 0
    var idade = 0
    var sexo = 0
    var opc = 0

    var pcalmas = 0
    var mnerv =0
    var hagre=0
    var outcalmas =0
    var npnervmaior40 =0
    var npcmenos18 =0


    while(cont<6){
        println("***Pesssoa ${cont+1}***\n")

        print("Digite a idade: ")
        idade = readLine()!!.toInt()

        print("Digite seu sexo, considerando 1 para feminino, 2 para masculino " +
                "e 3 para outros")
        sexo= readLine()!!.toInt()

        print("Qual o comportamento dessa pessoa, considerando 1 para calma " +
                "2 para nervosa e 3 para agressiva")
        opc= readLine()!!.toInt()

        if (opc ==1){
        pcalmas++
        }
        if(sexo==1 && opc==2){
            mnerv ++
        }
        if(sexo==2 && opc==3){
        hagre ++

        }
        if(sexo==3&&opc==1){
            outcalmas++
        }
        if(opc==2&&idade>40){

            npnervmaior40++
        }
        if (idade<18 &&opc==1){

            npcmenos18++
        }



        cont++


    }

    println("O NUMERO DE PESSOAS CALMAS É $pcalmas")
    println("O NUMERO DE MULHERES NERVOSAS É: $mnerv")
    println("O NUMERO HOMENS AGRESSIVOS É: $hagre")
    println("O NUMERO DE OUTROS CALMOS É: $outcalmas")
    println("O NUMERO DE PESSOAS NERVOSAS COM MAIS DE 40 ANOS É: $npnervmaior40")
    println("O NUMERO DE PESSOAS CALMAS COM MENOS DE 18 ANOS É : $npcmenos18")

}
