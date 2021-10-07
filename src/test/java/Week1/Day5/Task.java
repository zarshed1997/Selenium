package Week1.Day5;

public class Task {
    public static void main(String[] args) {
        String rawText="INFORMATION\n" +
                "Sitemap\n" +
                "Shipping & Returns\n" +
                "Privacy Notice\n" +
                "Conditions of Use\n" +
                "About us\n" +
                "Contact us";
     //   System.out.println(rawText);

        String[] rawText1=rawText.split("Privacy Notice");
        String secandPartText=rawText1[1];
        String[] rawinfo=secandPartText.split("of Use");
    //    System.out.println(secandPartText);
        String info=rawinfo[0].trim();
        System.out.println(info);


    }
}
