package Session_2.inheritance;

public class Daughter extends Father{

    Daughter(String gold, int cash, int dcash){
        super(gold,cash);
        this.cash = dcash;
    }

    int cash ;

    void fashionDesignerJob(){
        System.out.println("Vogue Fashion designer");
    }

    void goldBusiness(){
        System.out.println(super.cash);
        System.out.println(cash);
        super.goldBusiness();
        System.out.println("Great Great grand gold business!");
    }

}
