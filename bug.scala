```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) {
      throw new ArithmeticException("Division by zero")
    } else {
      x / y 
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
}
```