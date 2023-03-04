package Session_2;


public class MethodDemo {


    //non static entities cannot be called inside static methods

    public static void main(String[] args) {
        method1();
        method1();
        method1();
        method1();

        int[] principleValues = {1000,3000,5000};
        double[] finalAmts = new double[3];
        for(int i=0;i<principleValues.length;i++){
            finalAmts[i] = interestCalculator(principleValues[i],12,1);
        }
        for(int i=0;i<finalAmts.length;i++){
            System.out.println(finalAmts[i]);
        }


        greetTheUser("Anusha");

        System.out.println(methodDemo());
//        double finalAmt = interestCalculator(1000,12,1);
//        System.out.println(finalAmt);

    }

    static void  method1(){
        System.out.println("hi");
    }

    //final amt = p(1+rt)
    static double interestCalculator(int principleAmt, int rateOfInterest, int years){

        double amt = principleAmt*(1+rateOfInterest*0.01*years);

        return amt;
    }

    static void greetTheUser(String username){
        System.out.println("Hi " + username + " Good Morning!");
    }

    static int methodDemo(){
        return 10;
    }
}
