public class exemploif {
    public static void main(String[] args) {

        float media = 6;
        int numeroFaltas = 13;

    if(media >= 6) {
        System.out.println("Aprovado!");
    }

    if(media >= 6 && numeroFaltas <= 20) {
        System.out.println("Aprovado!");
    }

    if(media < 6 || numeroFaltas > 20) {
        System.out.println("Reprovado!");
    }


} }
