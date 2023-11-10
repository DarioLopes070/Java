public class Condicional {
    public static void main(String[] args) {
        int nota;
        nota=5;
        String graduacao;
//        if(nota >= 70){
//            System.out.println("Aluno Aprovado!");
//        }else {
//            System.out.println("Aluno Reprovado!");
//        }
//        if(nota >= 80){
//            System.out.println("Graduação A");
//        }else if(70 <= nota && nota <80){
//            System.out.println("Graduação B");
//        }else if(60 <= nota && nota <70){
//            System.out.println("Graduação C");
//        }else if(0 <= nota && nota <60){
//            System.out.println("Graduação D");
//        }else {
//            System.out.println("Nota Inválida!");
//        }


        if(nota >= 80){
            graduacao = "A";
        }else if(70 <= nota && nota <80){
            graduacao = "B";
        }else if(60 <= nota && nota <70){
            graduacao = "C";
        }else if(0 <= nota && nota <60){
            graduacao = "D";
        }else {
            graduacao = "";
        }

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado!");
                break;
            default:
                System.out.println("Graduação Inválida!");
        }

    }
}
