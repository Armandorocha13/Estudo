package operadores;

public class Relacionais {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 97;
        int b = 'a'; // 'a' é um caractere, mas é convertido para o valor inteiro 97
        
        // Operador de igualdade
        System.out.println(a == b); // true, pois a e b possuem o mesmo valor
        
        // Operador de diferença
        System.out.println(a != b); // false, pois a e b possuem o mesmo valor
        
        // Operador de maior que
        System.out.println(a > b); // false, pois a não é maior que b
        
        // Operador de menor que
        System.out.println(a < b); // false, pois a não é menor que b
        
        // Operador de maior ou igual a
        System.out.println(a >= b); // true, pois a é maior que b
        
        // Operador de menor ou igual a
        System.out.println(a <= b); // true, pois a é menor que b
    }
    
}
