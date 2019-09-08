package grammar.loop

/**
  * Created by Qoo 
  * Date : 2019/09/08.
  */
object For {
  def main(args: Array[String]): Unit = {
    println("for loop(to)")
    for(x <- 1 to 10) {
      println("x : " + x)
    }

    println("for loop(until)")
    for(x <- 1 until 10) {
      println("x : " + x)
    }

    println("double loop")
    for(x <- 1 to 9; y <-1 to 9) {
      println(x + "*" + y + "=" + (x * y))
    }

    println("for loop that has condition")
    for(x <- 1 to 10; if x % 2 == 0) {
      println(x)
    }

    println("for loop(array)")
    val array = Array(1, 2, 3, 4, 5)
    for(num <- array) {
      println(num)
    }

    println("for loop(array) with index")
    for((num, index) <- array.zipWithIndex) {
      println(num, index)
    }
  }
}
