
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
    
    //Exercise 2.1
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

    def findFirst(arr: Array[String],key: String): Int = {
        @annotation.tailrec
        def go(i: Int) : Int = {
            if (i==arr.length) -1
            else if(arr(i) == key) i
            else go(i+1)
        }

        go(0)
    }

    def findFirstGeneric[A](arr: Array[A], p: A => Boolean): Int = {
        @annotation.tailrec
        def go(i: Int): Int = 
            if (i==arr.length) -1
            else if (p(arr(i))) i
            else go(i+1)

        go(0)
    }

    //Exercies 2.2
    def isSorted[A](arr: Array[A] , ordered: (A,A) => Boolean) : Boolean = {
        @annotation.tailrec
        def go(i: Int,acc: Boolean): Boolean = 
            if(i>=arr.length) acc 
            else go(i+1 , acc && ordered(arr(i) , arr(i-1)))
        
            go(1,true)
    }

    def partial1[A,B,C] (a: A, f:(A,B)=> C) : B => C =
        (b:B) => f(a,b)

    //Exercise 2.3
    def curry[A,B,C] (f: (A,B) => C) : A => (B=>C) = 
        (a:A) => (b:B) => f(a,b)

    //Exercise 2.4
    def uncurry[A,B,C] (f: A => B => C) : (A,B) => C =
        (a:A,b:B) => f(a)(b) 

    //Exercise 2.5
    def compose[A,B,C](f: B => C , g : A => B) : A => C =
        (a:A) => f(g(a))
    
    

    def main(args: Array[String]) : Unit = { 
        // println(formatResult("fib" , 8 , fibonacci))
        // println(findFirstGeneric(Array(7,9,13), (x:Int) => x==13))
        println(isSorted(Array(1,4,12,-13) , (a:Int, b:Int) => a>b))
    }
}
