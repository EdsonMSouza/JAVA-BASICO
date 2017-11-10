package javaestruturascontrole;

class ExemploDoWhile {

    public static void main(String[] args) {
        int n = 8, c = 1;
        int m = n;
        System.out.println("Os múltiplos de " + n + " são:");
        do {
            System.out.println(m);
            c++;
            m = n * c;
        } while (m < 100);
    }
}
