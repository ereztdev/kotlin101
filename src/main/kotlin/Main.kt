import com.entities.Person

fun main(args: Array<String>) {
    println("Hello World!")

    val me = Person("Erez")
    val sayThis = "This is me speaking"

    println("Hello ${me.Name}, can you speak? can you say this: ${me.speak(sayThis)}")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}