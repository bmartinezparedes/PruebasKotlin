/**
 *
 */
fun square(base: Int = 10)= base * base +10
fun potencia(base: Double=2.0, exponente:Double)= Math.pow(base,exponente)
fun saludo(nombre: String)="Hola $nombre"
fun isVowel(c: Char): Unit {
    when (c) {
        'a', 'e',  'o' -> println("$c es una vocal abiertas")
        'i', 'u'-> println("$c es una vocal cerrada")
        else -> println("$c no es una vocal")
    }
}

fun main(args: Array<String>) {

    println(Diccionario().maxLength("apio","patata","lechuga"))



    /*
    var elcuadrado = square()
    println(elcuadrado)

    println(saludo("Braiskiskos"))

    isVowel('a')
    println(potencia(exponente=4.0, base=5.0))
    */

}