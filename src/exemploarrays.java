public class exemploarrays {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Percorrendo com for: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

        System.out.println("\nPercorrendo com while: ");
        int j = 0;
        while (j < numeros.length) {
            System.out.println("Elemento na posição " + j + ": " + numeros[j]);
        }

        System.out.println("\nPercorrendo com do-while: ");
        int k = 0;
        do {
            System.out.println("Elemento na posição " + k + ": " + numeros[k]);
        } while (k < numeros.length);
    }
}
