package buoi3;

public class Activity43 {
    public static void main(String[] args) {

        System.out.println("so chia het cho 3:");
        for(int i=1;i<100;i++){
            if(i%3==0){
                    System.out.print(+i+" ");
            }
        }

        System.out.println("\n so chia het cho 5");
        for(int i=1;i<100;i++){
            if(i%5==0){
                System.out.print(+i+" ");
            }
        }

        System.out.println("\n so chia het cho cả 3 và 5");
        for(int i=1;i<100;i++){
            if(i%3==0 && i%5==0){
                System.out.print(+i+" ");
            }
        }

    }
}
