package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "Hello World!";
        String s3 = "Hello " + "World!";
        System.out.println(s3);
        System.out.println(s2.equals(s3));

        System.out.println(s3.indexOf("World!"));
        System.out.println(s3.indexOf("Xxx"));
        System.out.println(s3.length());
        System.out.println(s3.substring(0, 2)); //0. az első és a 2. már nem kerül kiíírásra. Nem módosít, csak kiír.
        System.out.println(s3);


        String message = "Hello Java";
        System.out.println(message);
        int index = message.indexOf("J");
        System.out.println(index);
        String word = message.substring(index);
        System.out.println(word.length());
    }


}
