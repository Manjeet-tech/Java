import java.util.*;
import java.util.stream.*;

class AssignmentPayment{

    String payType;
    List<Integer> amount;

    public AssignmentPayment(String payType, List<Integer> amount){
            this.payType = payType;
            this.amount = amount;

    }

    public String getPayType(){
        return payType;
    }

    public List<Integer> getAmount(){
        return amount;
    }


public static void main(String args[]){
        
        AssignmentPayment p1 = new AssignmentPayment("imps",Arrays.asList(100,500,7000));
        AssignmentPayment p2 = new AssignmentPayment("nft",Arrays.asList(1000,400,7000));
        AssignmentPayment p3 = new AssignmentPayment("gpay",Arrays.asList(100,300,7000));

    List<AssignmentPayment> payments = Arrays.asList(p1,p2,p3);

    getImpsAmount(payments);

     System.out.println("========================================");

    Integer impsAmount = 0;
    for(AssignmentPayment pt : payments){

        if(pt.getPayType().equals("imps")){
            for(Integer amt : pt.getAmount()){
                impsAmount += amt;
            }
        }
    }

    System.out.println(impsAmount);
}

public static void getImpsAmount(List<AssignmentPayment> payments){
  List<AssignmentPayment> impsPayments =   payments.stream()
                    .filter(payType -> payType.getPayType().equals("imps"))
                    .collect(Collectors.toList());
                    

  Integer listofInts = impsPayments.stream()
                    .map(pt -> pt.getAmount())
                    .flatMap(list -> list.stream())
                    .collect(Collectors.summingInt(Integer::intValue));

    System.out.println(listofInts);

}


}