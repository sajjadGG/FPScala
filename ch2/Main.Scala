
object MyModule{
    
    def abs(n: Int): Int = 
        if (n<0) -n
        else n

    def factorial(n: Int) : Int = {
        def go(n: Int, acc: Int) : Int = {
            if (n<= 0) acc
            else go(n-1,n*acc)
        }
        
        go(n,1)
    }

    def fibonacci(n: Int) : Int = {
        def go(n: Int,acc: Int,v1: Int,v2: Int) : Int = {
            if (acc>=n) v1
            else go(n,acc+1,v1+v2,v1)
        }

        go(n,1,1,1)
    }

    def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s of %d is %d."
        msg.format(name, n, f(n))
    }
    def main(args: Array[String]) : Unit = 
        println(formatResult("fib" , 8 , fibonacci))
}
