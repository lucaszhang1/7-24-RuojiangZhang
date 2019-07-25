fun main(agrs: Array<String>){
//    val x = arrayOf(0, 1, 2, 3, 4)
//    x[3] = x[2]
//    x[4] = x[0]
//    x[2] = x[1]
//    x[1] = x[0]
//    x[0] = x[1]
//    x[4] = x[3]
//    x[3] = x[2]
//    x[2] = x[4]
//    println("${x[4]}, ${x[3]}, ${x[2]}, ${x[1]}, ${x[0]}")

//    var x = 1
//    while (x < 3){
//        print(if (x == 1)"Yab" else "Dab")
//        print("ba")
//        x = x + 1
//    }
//    if (x == 3)println("Do")

//    var x = 1
//    while (x < 10){
//        x = x + 1
//        if (x > 3){
//            println("big x")
//        }
//    }

//    var x = 10
//    while (x > 1){
//        x = x - 1
//        if (x < 3){
//            println("small x")
//        }
//    }

//    var x = 0
//    var y = 0
//    while (x < 5){
//        if (y < 5){
//            x = x + 1
//            if (y < 3) x = x - 1
//
//        }
//        y = y + 3
//
//        print("$x$y")
//        x = x + 1
//    }


    val x: Int = 7
    val y: Int = 8
    printSum(x, y)



}
fun printSum(int1: Int, int2: Int){
    val result = int1 + int2
    println(result)
}