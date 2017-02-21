/**
 * Created by csechuan on 20/02/2017.
 */

fun main(args: Array<String>) {
    println(echo("Hello brother", 55))

    var a = 1;
    var b = 2;
    var bigger = if (a > b) a else b;
    println(bigger) // Prints 2
}

fun echo(foo: String, bar: Int): String {
    return "$foo $bar"
}