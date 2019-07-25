//class Song (val title: String, val artist: String){
//    fun play () {
//        println("play the song" + title)
//    }
//    fun stop () {
//        println("stop the song" + title)
//    }
//}
//
//fun main(args: Array<String>){
//    var mysong = arrayOf(
//        Song("Star Sky", "Two Steps From Hell"),
//        Song("Monster", "Boondox"),
//        Song("Different World", "Alan Walker"),
//        Song("Midnight", "Cat")
//    )
//
//    mysong[1].play()
//}

class Drumkit(var hasTopHat: Boolean, var hasSnare: Boolean){
    fun playSnare(){
        if (hasSnare)println("bang bang bang")
    }
    fun playTopHat(){
        if (hasTopHat) println("ding ding ba-da-bing")
    }
}

fun main(args: Array<String>) {
    val d = Drumkit(true, true)

    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()
}