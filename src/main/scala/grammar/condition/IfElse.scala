package grammar.condition

/**
  * Created by Qoo 
  * Date : 2019/09/08.
  */
object IfElse {
  def main(args: Array[String]): Unit = {
    var x = 30
    validate(x)

    x = 3
    validate(x)

    x = 15
    validate(x)

    x = 30
    validateWithoutBrace(x)
  }

  def validate(x: Int): Unit = {
    if (x > 15) {
      println("15보다 큰데 ?")
    } else if (x < 15) {
      println("15보다 작네 ?")
    } else {
      println("15냐 ?")
    }
  }

  def validateWithoutBrace(x: Int): Unit = {
    if (x > 15) println("15보다 큰데 ?")
    else if (x < 15) println("15보다 작네 ?")
    else println("15냐 ?")
  }
}
