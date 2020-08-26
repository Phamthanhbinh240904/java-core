package suabai;

public class Activity51 {
    public static void main(String[] args) {
        for(int i = 1; i<=500; i++){
            String iStr = String.valueOf(i);
            char[] cacChuSo = iStr.toCharArray();

            int soMu = cacChuSo.length;
            int tong = 0;
            for(char chuSo : cacChuSo){
                int chuSoMu = (int) Math.pow(Character.getNumericValue(chuSo), soMu);
                tong = tong + chuSoMu;
            }

            if(tong == i){
                System.out.println(i + " ");
            }
        }
    }
}