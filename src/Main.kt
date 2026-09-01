import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() { println("hola mundo")


    val primer_valor = 3
    val segundo_valor = 4
    val terceer_valor = 5

    println(primer_valor + segundo_valor + terceer_valor)

    val primer_val_resta = 500
    val sengundo_val_resta = 250

    println( primer_val_resta-sengundo_val_resta)

    val primer_val_mul = 5
    val segundo_val_mul = 10
    println(primer_val_mul * segundo_val_mul)

    val numero = 3
    if (numero % 2 == 0){
        println("El numero $numero es par")
    } else {
        println("El numero $numero es impar")
    }
 val paises_y_capitales = mapOf(
     "Colombia" to "Bogotá",
     "España" to "Madrid",
     "Francia" to "París",
     "Argentina" to "Buenos Aires",
     "Japón" to "Tokio"
 )
    println("paises y su capitales $paises_y_capitales")

val nombre = "Andres"
val edad = 20
println("Hola $nombre tienes $edad años ")


    val numero_eje_7 = -0
    val clasificar_num = when {
        numero_eje_7 < 0 -> "negativo"
        numero_eje_7 == 0 ->"cero"
        else -> "positivo"

    }
    println("el numero $numero_eje_7 es $clasificar_num")

    val num_1 = 4
    val num_2 = 4
    val comparar = when{
        num_1 > num_2 -> "$num_1 es mayor que $num_2"
        num_2 > num_1 ->"$num_2 es mayor que $num_1"
        else -> "los numeros son iguales"
    }
    println(comparar)

    val primerlista = listOf(2,4,6,8,10,12,14,16,18,20)
    val multiplicar = primerlista.map {it * 2}
    println("lista de numeros $primerlista resultados multiplicados x 2 $multiplicar")
}

