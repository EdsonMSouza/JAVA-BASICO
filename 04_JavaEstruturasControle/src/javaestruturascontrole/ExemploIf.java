package javaestruturascontrole;

class ExemploIf {

    public static void main(String[] args) {
        double n1 = 5, n2 = 8, media = 0;
        media = (n1 + n2) / 2;
        if (media < 6) {
            System.out.println(" Aluno Reprovado");
        } else {
            System.out.println(" Aluno Aprovado");
        }
    }
}
