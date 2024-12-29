```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) {
      throw new ArithmeticException("Division by zero")
    } else {
      x / y 
    }
  }

  def myMethodSafe(y: Int): Option[Int] = {
    if (y == 0) {
      None 
    } else {
      Some(x / y)
    }
  }
}

object Main extends App {
  val obj = new MyClass(10)
  try {
    println(obj.myMethod(0))
  } catch {
    case e: ArithmeticException => println("Caught exception: " + e.getMessage)
  }
  println(obj.myMethod(2))

  println(obj.myMethodSafe(0).getOrElse(0)) // Handles division by zero gracefully
  println(obj.myMethodSafe(2).getOrElse(0)) // Handles other cases gracefully
}
```