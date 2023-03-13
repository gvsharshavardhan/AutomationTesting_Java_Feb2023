package Session_3.Assignment2Solutions;

public class MissingNumbersFromArray {


    public static void main(String[] args) {

        int[] i = {1,3,5,8,12,15,17,19};
        int[] j = {1,3,12,15,19};

        boolean flag = true;

        for(int a = 0;a<i.length;a++){
            for(int b = 0;b<j.length;b++){
                if(i[a]==j[b]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i[a]);
            }
            flag = true;
        }



    }
}
