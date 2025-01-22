/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Mother {
    static void show() {
        System.out.println("Hello from Mother (Static)");
    }
}
class Child extends Mother {
   
    static void show() {
        System.out.println("Hello from Child (Static)");
    }
}
class Main {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show();
        Mother m2 = new Mother();
        m2.show(); 
    }
}