package org.example
class Fraccion(private var _numerador: Int, private var _denominador: Int){
    var numerador: Int
        get() = _numerador
        set(value){_numerador = value}

    var denominador: Int
        get() = _denominador
        set(value){_denominador = value}

    init{
        require(denominador != 0) {"El denominador no puede ser 0"}
    }

    override fun toString(): String{
        return "$numerador/$denominador"
    }
    
    fun mostrar(){
        println("$numerador/$denominador")
    }
    operator fun plus(otro: Fraccion):Fraccion{
        val sumnumerador = this.numerador * otro.denominador + otro.numerador * this.denominador
        val sumdenominador = this.denominador * otro.denominador
        return Fraccion(sumnumerador, sumdenominador)
    }
    operator fun minus(otro: Fraccion):Fraccion{
        val minnumerador = this.numerador * otro.denominador - otro.numerador * this.denominador
        val mindenominador = this.denominador * otro.denominador
        return Fraccion(minnumerador, mindenominador)
    }
    private fun simplificar():Fraccion{
        var num = this.numerador
        var den = this.denominador
        while(resto != 0){
            var resto = num % den
            num = den
            den = resto
        }
        return Fraccion(num, den)
    }
}