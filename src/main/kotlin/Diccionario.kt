class Diccionario {
    fun maxLength(vararg palabras:String): Int {
        var max = 0

        for (palabraEnConcreto in palabras) {
            if(palabraEnConcreto.length>max)
            max=palabraEnConcreto.length
        }
        return max
    }
}