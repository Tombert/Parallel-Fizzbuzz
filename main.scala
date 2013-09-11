import scala.collection.parallel 
 object HelloWorld {
    def main(args: Array[String]) {
     val myList = (1 to 100)
     def fizzBuzzFunction(x:Int):(String, Int) = {
     	 var myString = ""
     	 if(x%3==0) myString +="fizz"
	 if(x%5==0) myString +="buzz"
	 if(x%3!=0 && x%5!=0) myString+=x
	 return (myString, x)
     }
     var processedList = myList.par.map(fizzBuzzFunction(_)).toList.sortBy(_._2)
     processedList.map {case(e,f) => println(e)}
    }
  }