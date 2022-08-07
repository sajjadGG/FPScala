package fpinscala.datastructures
sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A,tail:List[A]) extends List[A]

object List {
    def sum(ints: List[Int]): Int = ints match {
        case Nil => 0
        case Cons(x,xs) => x+sum(xs)
    }

    def product(ds:List[Double]): Double = ds match{
        case Nil => 1.0
        case Cons(0.0,_) => 0.0
        case Cons(x,xs) => x* product(xs)
    }
    
    //Ex3.2
    def tail[A](ds:List[A]): List[A] = ds match{
        case Nil => Nil
        case Cons(_,as) => as
    }
    //Ex3.3
    def setHead[A](ds:List[A],h:A):List[A] = ds match{
        case Nil => Cons(h,Nil)
        case Cons(_,as) => (h,as)
    }
    //Ex3.4
    def drop[A](l:List[A],n:Int):List[A] = (l,n) match{
        case (Nil,_) => Nil
        case (l,0) => l
        case (Cons(_,as),a) if a>0 => drop(as,n-1) 
    }
    //Ex3.5
    def dropWhile[A](l:List[A],f:A=>Boolean): List[A] = l match{
        case Nil => Nil
        case Cons(a,as) if f(a) => dropWhile(as)
        case Cons(a,as) if !f(a) => Conhs(a,as)
    }
    def append[A](a1:List[A],a2:List[A]):List[A] = a1 match{
        case Nil => a2
        case Cons(h,t) => append(h,append(t,a2))
    }
    //Ex3.6
    def reverse[A](l:List[A]):List[A] = {
        @annotation.tailrec
        def go(l:List[A] , acc:List[A]):List[A] = l match{
            case Nil => acc
            case Cons(h,t) => go(t,Cons(h,acc))
        }
        go(l,Nil)
    }
    def init[A](l:List[A]):List[A] = 
        reverse(tail(reverse(l)))
    
    def apply[A](as: A*): List[A] = 
        if(as.isEmpty) Nil
        else Cons(as.head,apply(as.tail:_*))

}