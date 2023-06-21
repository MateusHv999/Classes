fun main(){

    var carro = Veiculo(20, 30,"Impala" )

    println(carro.velocidadeAtual())

    carro.aumentarVelocidade() // aumenta a velocidade para 50 -- 20+30
    carro.reduzirVelocidade() // reduz a velocidade para 0 -- 30 - 50

    carro.printTotal() // printa o nosso texto

}

class Veiculo(
    var longVelocity :Int = 0,
    var longAcceleration : Int = 10,
    val model : String
)
{

    fun aumentarVelocidade(): Int {
        longVelocity = longAcceleration + longVelocity
        return longVelocity
    }

    fun reduzirVelocidade(): Int{
        longVelocity = longAcceleration - longVelocity
        if(longVelocity < 0){
            longVelocity = 0
        }
        return longVelocity
    }

    fun velocidadeAtual(): Int {
        return this.longVelocity
    }

    fun printTotal(){
        println("A Velocidade do nosso ${model} é : ${longVelocity}, a aceleração é ${longAcceleration}")
    }
}