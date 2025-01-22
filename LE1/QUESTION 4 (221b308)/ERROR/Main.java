/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class One {
    One(int x) {
        System.out.println("One's constructor called with value: " + x);
    }
}
class Two extends One {
    
    Two() {
        
        System.out.println("Two's constructor called");
    }
}
public class Main {
    public static void main(String[] args) {
        Two obj = new Two();
    }
}