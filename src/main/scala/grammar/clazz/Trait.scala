package grammar.clazz

/**
  * Created by Qoo 
  * Date : 2019/09/08.
  */
object Trait {
  def main(args: Array[String]): Unit = {
    val bird = new Bird
    bird.eat
    bird.fly
    bird.run

    val qoo = new Developer
    qoo.eat
    qoo.run
    qoo.swim
    qoo.think
  }

  class Developer extends Person with Running with Swimming with Eating {
    override def think: Unit = println("think ~~")
  }

  abstract class Person {
    def think
  }

  class Bird extends Flying with Eating with Running {
    override def fly: Unit = println("fly ???")
  }

  trait Flying {
    def fly = println("fly ~~")
  }

  trait Running {
    def run = println("run ~~")
  }

  trait Eating {
    def eat = println("eat ~~")
  }

  trait Swimming {
    def swim = println("swim ~~")
  }

}
