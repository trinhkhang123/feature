public class TelexWordCounter {

    public static int countTelexWords(String inputStr) {
        String[] telexWords = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        int count = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            boolean letters = false;
            if (i != 0) {
                String text = inputStr.substring(i - 1, i + 1);

                for (int j = 0; j < 7; j++) {
                    if (text.equals(telexWords[j])) {
                        count++;
                        letters = true;
                        break; 
                    }
                }
            }
            
           if (inputStr.charAt(i) == 'w' && letters == false) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hwfdawhwhcoomddfgwdc";
        int result = countTelexWords(input);
        System.out.println("Output: " + result); 
    }
}
