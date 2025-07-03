Promt 1:
-fecha:3/7/2025
-herramienta:chat gpt
-promt:dime como verificar que un atributo privado de una clase no sea 0 en su constructor en kotlin
-respuesta importante: class Producto(private var precio: Int) {
    init {
        require(precio != 0) { "El precio no puede ser 0" }
    }
}