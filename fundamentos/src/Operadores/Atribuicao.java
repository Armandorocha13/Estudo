package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 3;
        int b = a; // b recebe o valor de a
        int c = a + b; // c recebe a soma de a e b
        int d = a * b + c; // d recebe o produto de a e b somado a c
        int e = d; // e recebe o valor de d
        int f = d - e; // f recebe a diferença entre d e e
        int g = f; // g recebe o valor de f
        int h = f / g; // h recebe a divisão de f por g
        int i = h; // i recebe o valor de h
        int j = h % i; // j recebe o resto da divisão de h por i
        
        // Impressão dos valores
        System.out.println(a); // 3
        System.out.println(b); // 3
        System.out.println(c); // 6
        System.out.println(d); // 15
        System.out.println(e); // 15
        System.out.println(f); // 0
        System.out.println(g); // 0
        System.out.println(h); // 0
        System.out.println(i); // 0
        System.out.println(j); // 0
    }
}
