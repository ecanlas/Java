public class ReverseString{


    public static void main(String[] args) {


        String name = "Supercalifab";

        String reverse = "";
        for (int i = name.length() -1 ; i >= 0; i--) {

            char reversedName[] =  name.toCharArray();
            String newName = Character.toString(reversedName[i]);
            reverse = reverse + newName;
        }

        System.out.println(reverse);
}