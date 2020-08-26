package suabai;


public class Activity52 {
    public static void main(String[] args) {
        int[] numbers = {15, 5, 5, 1, 5, 2, 1, 9, 5, 8, 15, 16, 15};

        String uniqueNumber = "";
        for(int i : numbers){
            String soStr = "#" + i + "#";
            if(!uniqueNumber.contains(soStr)){
                System.out.print(i + " ");
                uniqueNumber = uniqueNumber + "#" + i + "#";
            }
        }
    }
}