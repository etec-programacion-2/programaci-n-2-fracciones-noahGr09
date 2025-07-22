package org.example

fun main() {
    val fraccion1 = Fraccion(3, 2)
    val fraccion2 = Fraccion(7, 8)
    println(fraccion1.numerador)
    println(fraccion1.denominador)
    println(fraccion1) //se llama a toString automáticamente
    fraccion1.mostrar()
    println(fraccion1.plus(fraccion2))
    println(fraccion2.minus(fraccion1))
}
