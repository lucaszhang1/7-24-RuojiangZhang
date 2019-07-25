fun main(agrs: Array<String>){
    var x = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    var y = arrayOf("empowered", "leveraged", "alihned", "targeted")
    var z = arrayOf("process", "paradigm", "solution", "portal", "vision")
    println("${x[(Math.random()*x.size).toInt()]}, " +
            "${y[(Math.random()*y.size).toInt()]}, " +
            "${z[(Math.random()*z.size).toInt()]}")
}