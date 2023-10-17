## __DELL__

1. Dependency Injection vs Inversion Controller
2. Race Over Condition and Dead lock.
3. Concurrent Hash Map internal working
4. What is purpose of dependency injection.
5. Serialization
6. WAP for 50 starting fibonacci series using recursion and naive solution.
7. Deployment in microservice service running status.
8. Running Polymerphism
class A{
    int a;
}

class B extends A{
    int b=10;
}

A obj = new B();
sopln(A.a); // 0 --> instance variable need to static 
sopln(A.b); // 10 --> b --> static variable 

---
```
class A {

    static int a;
}

class B extends A{
    static int b=10;
}

class PolymerphismCheck{
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(A.a);
        System.out.println(B.b);
        System.out.println(obj.a);
        System.out.println(((B) obj).b);
    }
}

```
9. Find the missing number between [1,2,3,4..100] in a given array.
```
    - Note:
      1.Cannot sort
      2. Space complexity O(1)
```

10. Microservice design pattern to find the service status. Reseilient Design Pattern.

11. What if all microservices are down how we overcome this situation.

12. How find the duplicate entries using java 8.

13. Using Employee list WAP to filter based on their salary>50000.

14. Internal working concurrent hash map.

15. Memory management(heap, stack).


 