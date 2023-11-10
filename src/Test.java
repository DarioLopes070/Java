public class Test {
    public static void main(String[] args){
        boolean fimDeSemana =false;
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de Semana" : "Não é fim de semana";
//         "?" vai ser usado para representar o "SE" e ":" vai representar "ELSE"
        System.out.println(mensagem);


    }
}
