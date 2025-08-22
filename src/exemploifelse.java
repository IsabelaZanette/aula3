public class exemploifelse {
    public static void main(String[] args) {

        float media = 8;
        int numeroFaltas = 5;

        if(media >= 6 && numeroFaltas <= 20) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");

        }

        if(media < 6 || numeroFaltas > 20) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado!");
        }

    }
}
