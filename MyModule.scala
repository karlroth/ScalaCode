package FunctionalProgramming

/**
  * Created by karoth on 7/3/17.
  */
object MyModule {

  def fib(n: Int): Int = {
    /**
      * Returns the nth Fibonacci Number
      * Each Fibonacci Number is the sum of
      * the previous two. The first two are
      * 0 and 1.
      *
      * Functional Programming Notes:
      * This code utilize Scala's tail recursive
      * iteration. ("for loop")
      *
      * It doesn't use stack for the recursive calls
      * when it is in this format. (i.e. it only
      * takes as much memory as a while loop)
      *
      * @param n = which Fibonacci Number to compute
      * @param res = the current number
      * @param prev = the previous number
      * @param acc = the current iteration
      * @return Integer Fibonacci Number
      */
    @annotation.tailrec
    def go(n: Int, res: Int, prev: Int, acc: Int): Int =
      if(acc == n) res
      else go(n, res + prev, res, acc + 1)

    go(n, 0, 1, 1)
  }


  def main(args:Array[String]): Unit = {
    for( i <- 1 to 10) {
      println(fib(i))
    }

  }

}
