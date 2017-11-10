package javaestruturascontrole;

class ExemploWhile {

    public static void main(String[] args) {
        int n = 8, c = 1;
        int m = n;
        System.out.println("Os múltiplos de " + n + " são:");
        while (m < 100) {
            System.out.println(m);
            c++;
            m = n * c;
        }
    }
}
