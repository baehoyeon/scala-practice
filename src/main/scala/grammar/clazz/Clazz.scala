package grammar.clazz

/**
  * Created by Qoo 
  * Date : 2019/09/08.
  */
object Clazz {
  def main(args: Array[String]): Unit = {
    val hoyeon = new User(name = "hoyeon", 29)
    val jiwon = new User(name = "jiwon", 27)

    println(hoyeon)
    println(jiwon)

    val qoo = new Qoo
    println(qoo)

    val apple = new Fruit("apple")
    println(apple)

    val hoyeon2 = new UserCase(name = "hoyeon", 29)
    val jiwon2 = new UserCase(name = "jiwon", 27)

    println(hoyeon2)
    println(jiwon2)
  }

  class User(name: String, age: Int) {
    override def toString: String = return "name : " + this.name + " age : " + this.age
  }

  class Qoo() {
    val name = "Qoo"
    val age = 15
    override def toString: String = return "name : " + this.name + " age : " + this.age
  }

  class Fruit(input: String) {
    var name = input
    override def toString: String = return "input : " + this.input + " name : " + this.name
  }

  case class UserCase(name: String, age: Int)
}
