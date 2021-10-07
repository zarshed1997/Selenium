package Week1.Day5;

public class StringManipulation {
    public static void main(String[] args) {
        String rawText="Your order has been successfully processed!\n" +
                "Order number: 1020316\n" +
                "Click here for order details.\n";
 //       System.out.println(rawText);
        String[] rawText2=rawText.split("Order number:");
        String secandPartText=rawText2[1];

        String[] rawOrderNum=secandPartText.split("Click here");
  //      System.out.println(rawOrderNum);
        String orderNum=rawOrderNum[0].trim();
        System.out.println(orderNum);
    }
}
