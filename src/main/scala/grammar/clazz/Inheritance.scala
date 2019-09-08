package grammar.clazz

/**
  * Created by Qoo 
  * Date : 2019/09/08.
  */
object Inheritance {
  def main(args: Array[String]): Unit = {
    val qoo = new Developer("qoo", 29, "java")
    qoo.showUser
  }

  class User(name: String, age: Int)

  case class Developer(name: String, age: Int, mainSkill: String) extends User(name, age) {
    val showUser = println(this)
  }
}
