public class Practical_13 {
    public static void main(String[] args) {
        // Create the string using StringBuilder
        String str = "My Name is yug Doshi and my enrollment number is 21609037028.";
        int len = str.length();
        System.out.println("Character at index 8: " + str.charAt(8));
        System.out.println(str.format("The length of String is = |%32d |", len));
        System.out.println(
                str.format("using Contains Methods: %s", str.contains("is") ? "Contians is" : "not Contains is"));
        String[] Arr = str.split(" ");
        System.out.println("Split Method: ");
        for (String string : Arr) {
            System.out.println(string);
        }

    }
}
