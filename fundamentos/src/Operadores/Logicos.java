package Operadores;

public class Logicos {
    public static void main(String[] args) {
        // Declaração de variáveis booleanas
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // condicao2 será false
        
        // Operador lógico AND (E)
        System.out.println(condicao1 && condicao2); // false, pois uma das condições é falsa
        
        // Operador lógico OR (OU)
        System.out.println(condicao1 || condicao2); // true, pois uma das condições é verdadeira
        
        // Operador lógico XOR (OU Exclusivo)
        System.out.println(condicao1 ^ condicao2); // true, pois apenas uma das condições é verdadeira
        
        // Operador lógico NOT (NÃO)
        System.out.println(!condicao1); // false, pois condicao1 é true
        System.out.println(!!condicao1); // true, pois a negação dupla retorna ao valor original
        
        // Negação de condicao2
        System.out.println(!condicao2); // true, pois condicao2 é false
    }
}
