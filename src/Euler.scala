import scala.collection.immutable.Range
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

object Euler extends App{

  println("Executing Euler Code")
  val output = natural_number_multiples(1000)
  print(output)

  def natural_number_multiples( multipleValue : Int) : Int = {
    import scala.collection.mutable.ListBuffer
    var x =0;
    var multiples = new ListBuffer[Int]()

    for(x <- 3 to multipleValue-1)
    {
      if(x%3 == 0)
      {
        multiples += x
      }
      else if(x%5 == 0)
      {
        multiples += x
      }
    }
    var summation = 0;
    summation = multiples.sum
    return summation
  }


}