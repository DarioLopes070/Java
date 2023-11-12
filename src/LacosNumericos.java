public class LacosNumericos {
    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++){
//            System.out.println(i);
//        }
//        for(int i = 1; i<=10; i+=2){
//            System.out.println(i);
//        }
//        for(int i = 1; i<=10; i++){
//            System.out.println(1 * i);
//            System.out.println(2 * i);
//            System.out.println(3 * i);
//            System.out.println(4 * i);
//            System.out.println(5 * i);
//            System.out.println(6 * i);
//            System.out.println(7 * i);
//            System.out.println(8 * i);
//            System.out.println(9 * i);
//            System.out.println(10 * i);
//        }


        for(int i = 1; i<=10; i++){
            System.out.println("Tabuada do " + i);
            for (int n = 1; n<=10; n++){
                System.out.printf("%d * %d = %d%n",i, n,  i * n);
            }
        }



    }
}
