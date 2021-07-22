This repo is used as a guide in the jourany of Functional Programming using Scala
and will contains important inforamtion and tips and hints revolving this subject

## Functional Programming Concepts

### Higher-order function
since functions are values they can be passed into another functions.

### Recursion as loop
The way to wite loop without mutating the loop variable
is using recursion usually via local definition (e.g. a recursive helper function that is often called go or loop)

#### Tail call elimination
A call is said to be in tail position if the caller does nothing other than return the value of the recursive call.
to give hint to compile and get and error in case of not being tail call use `@annotation.tailrec`



## AHAs
- There are no operators in scala simply calling the method without infix 
`2+1` is `2.+(1)` since + is the name of a method in object 2 and any method with single
argument can be called this way : `MyModule.abs(42)` is the same as `MyModule abs 42`


## Hints

### Using scala REPL
you can run it by typing `scala` and to load some code into it use `:load MyModule.scala`


## Resources
- Functional Programmingin Scala
PAUL CHIUSANO
RÚNAR BJARNASON
