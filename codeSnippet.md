Here I put usefule scala and FP code snippet for anyone who wants to take a quick look or look up something.

### Loop
    ```
       def factotial(n: Int) : Int = {
           def go(n; Int, acc: Int) : Int = {
               if (n<=0) acc
               else go(n-1,n*acc)
           }
           
           go(n,1)
       } 

    ```

### Higher order funciton (aka: pass function as argumet)
    ```
        def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s of %d is %d."
        msg.format(name, n, f(n))
        }
    ```
    