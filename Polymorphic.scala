package FunctionalProgramming

/**
  * Created by Karl Roth on 7/5/17.
  */
object Polymorphic {

  /**
    * @param as input array of any type
    * @param ordered function for comparing
    *                elements of the array
    * @return Boolean sorted or not
    * @tparam A any type
    *
    * Checks to see if Array 'as' is sorted by the
    * criterion of the function 'ordered'.
    */
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n+1 >= as.length) true
      else if (ordered(as(n), as(n+1))) loop(n + 1)
      else false
    }
    loop(0)
  }
  /**
    * A function to check if a is less
    * than b (i.e. ascending)
    */
  def ascending(a: Int, b: Int): Boolean = {
    if(a <= b) true
    else false
  }
  /**
    * A function to check if a is greater
    * than b (i.e. descending)
    */
  def descending(a: Int, b: Int): Boolean = {
    if(a >= b) true
    else false
  }



  def main(args:Array[String]): Unit = {
    /**
      * An implementation
      */
    val as: Array[Int] = Array(1,1,3,4,5)

    println("Ascending sort: " + isSorted[Int](as, ascending))
    println("Descending sort: " + isSorted[Int](as, descending))
  }

}
