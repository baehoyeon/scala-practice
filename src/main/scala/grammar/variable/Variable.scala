package grammar.variable

/**
  * Created by Qoo 
  * Date : 2019/09/08.
  */
object Variable {
  def main(args: Array[String]) {
    var notImmutableVariable = "not immutable"
    val immutableVariable = "immutable"

    println(notImmutableVariable)
    println(immutableVariable)

//    immutableVariable = immutableVariable + "add"; This is error line because immutableVariable is val
    notImmutableVariable = notImmutableVariable + " add something"
    println(notImmutableVariable)
  }
}
