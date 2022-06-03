fun main(args: Array<String>) {
    println( "Як тебе звати?")
    val name = readln()
    println("В якому місті ти живеш?")
    val city = readln()
    println("Скільки тобі років?")
    val age = readln()
    println( "Яке твоє хоббі?")
    val hobby = readln()

    println("Твоє ім'я: $name")
    println("Місто: $city")
    println("Твій вік: $age")
    println("Твоє хоббі: $hobby")

    println("Людина, яку звати $name , проживає в місті $city . ")
    println("Цій людині $age , і в неї є хоббі $hobby ")

    println("$name: ім'я")
    println("$city: Місто ")
    println("$age: Твій вік")
    println("$hobby: Твоє хоббі")
}