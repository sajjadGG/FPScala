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