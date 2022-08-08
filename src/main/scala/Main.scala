import scala.language.postfixOps
import scala.math._


case class Frequency(var freq: Double, var n: Int)

object Main extends App {
  val c = 299792458;
  val Vc = c*80/100;
  val Re = 6.371*pow(10,3);    //±11
  val freqN = 7
  var freqs = new Array[Frequency](freqN)

  // for loop execution with a range
  for( i <- 0 until freqN){
    var f = Frequency(calculateFrequency(i+1), i)
    freqs(i) = f
  }

  printFrequency();

  def calculateFrequency(n: Int): Double = {
    return ((c/(Re*2*Pi))/1000)*n;            //7.48 Hz, n=1 fundamental frequency
  }

  def printFrequency(): Unit = {
    for( i <- 0 until  freqN){
      println(freqs(i).freq + " HZ at order " + freqs(i).n)
    }
  }
}
