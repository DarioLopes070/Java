import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
//        int[] numeros = new int[5];
//        String[] letras = new String[5];
//        letras[0] = "A";
//        letras[1] = "B";
//        letras[2] = "C";
//        letras[3] = "D";
//        letras[4] = "E";
//        String[] letras2 = {"D", "A", "R", "I", "O"};
//        for(int i = 0; i<5; i++){
//            System.out.println(letras[i]);
//        }
//        for(int i = 0; i<5; i++){
//            System.out.println(letras2[i]);
//        }
//        for(int i = 0; i<5; i++){
//            numeros[i] = i;
//        }
//        for(int i = 0; i<numeros.length; i++){
//            System.out.println(numeros[i]);
//        }
//
//        System.out.println(Arrays.toString(letras2));


        int[] numeros = {5, 90, 60, 4, 150};
        int maior = numeros[0];
        int menor = numeros[0];
        float media = 0;

//        for(int i=0; i<numeros.length; i++){
//            if(numeros[i] > maior){
//                maior = numeros[i];
//            } else if(numeros[i] < menor){
//                menor = numeros[i];
//            }
//            media += numeros[i];
//        }

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
            media += numero;
        }

        System.out.printf("Maior Número: %d%nMenor Número: %d%nMédia: %.2f", maior, menor, media/numeros.length);

    }
}
