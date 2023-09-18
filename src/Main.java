public class Main {
    public static void main(String[] args) {
        String[] arr  = new String[] {"Hello", "2", "world", ":-)"};

        int count = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i].length() <= 3){
                count++;
            }
        }
        String[] arr2 = new String[count];
        int count1 = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i].length() <= 3){
                arr2[count1] = arr[i];
                count1++;
            }
        }

        for(int i = 0; i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
