//associa��o

public class A {
    int number;
}
 class B {
    int number;
}
 class Associa {
    public static void main(String[] args) {
        // Aqui fa�o a associa��o
        A a = new A();
        B b = new B();
        // Aqui acesso os dados
        a.number = 1;
        b.number = a.number;
        // Aqui imprimo os dados pra ter certeza que deu tudo certo
        System.out.println(a.number);
        System.out.println(b.number);
    }
}