package org.example

fun main() {
    val fraccion = Fraccion(3,0)
    println(fraccion.numerador)
    println(fraccion.denominador)
    println(fraccion) //se llama a toString automáticamente
    fraccion.mostrar()
}
