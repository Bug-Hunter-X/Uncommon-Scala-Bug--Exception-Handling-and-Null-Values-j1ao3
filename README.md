# Uncommon Scala Bug: Exception Handling and Null Values

This repository demonstrates a common but often overlooked error in Scala: exceptions and null values. The code includes a method that can throw an `ArithmeticException` if the divisor is zero, with a `try-catch` block for exception handling.  However, it doesn't explicitly handle potential null values which could lead to a `NullPointerException` if not properly addressed. 

The `bug.scala` file contains the problematic code. The `bugSolution.scala` file provides a solution to handle both exceptions and null values effectively.