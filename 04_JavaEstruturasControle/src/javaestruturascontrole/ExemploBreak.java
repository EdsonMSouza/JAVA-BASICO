package javaestruturascontrole;

class ExemploBreak {

    public static void main(String[] args) {
        int n1 = 0;
        while (true) {
            System.out.println(n1);
            n1++;
            if (n1 > 10) {
                break;
            }
        }
    }
}
