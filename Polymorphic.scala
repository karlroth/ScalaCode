package FunctionalProgramming

/**
  * Created by karoth on 7/5/17.
  */
object Polymorphic {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n+1 >= as.length) true
      else if (ordered(as(n), as(n+1))) loop(n + 1)
      else false
    }
    loop(0)
  }
    def ascending(a: Int, b: Int): Boolean = {
      if(a <= b) true
      else false
    }
    def descending(a: Int, b: Int): Boolean = {
      if(a >= b) true
      else false
    }

  def main(args:Array[String]): Unit = {
    val as: Array[Int] = Array(1,1,3,4,5)

    println("Ascending sort: " + isSorted[Int](as, ascending))
    println("Descending sort: " + isSorted[Int](as, descending))
  }

}
