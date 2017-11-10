package javaestruturascontrole;

class ExemploFor {

    public static void main(String[] args) {
        int n = 8, c, m = n;
        System.out.println("Os multiplos de " + n + " são: ");
        for (c = 2; m < 100; c++) {
            System.out.println(m);
            m = c * n;
        }
    }
}
