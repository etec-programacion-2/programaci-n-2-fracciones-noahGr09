package org.example
class Fraccion(private var _numerador: Int, private var _denominador: Int){
    var numerador: Int
        get() = _numerador
        set(value){_numerador = value}

    var denominador: Int
        get() = _denominador
        set(value){
            _denominador = value        
        }

    init{
        require(denominador != 0) {"El denominador no puede ser 0"}
    }

    override fun toString(): String{
        return "$numerador/$denominador"
    }
    
    fun mostrar(){
        println("$numerador/$denominador")
    }
}