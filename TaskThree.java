public class TaskThree {
        private static final int[] chars = new int[26];

        public static void main(String[] args) {
            fillRestAlgo("abc", "tcd");
            fillRestAlgo("robocontest", "slcldlkepte");
            fillRestAlgo("dasturchi", "ottefsdef");
            fillRestAlgo("shifrlash", "tefysatte");
            fillRestAlgo("hello", "epaal");


            System.out.println(convertToCipherMessage("kelajak"));
        }

        public static void fillRestAlgo(String openMessage, String cipherMessage) {
            for(int i=0; i<openMessage.length(); i++) {
                int index = (int) openMessage.charAt(i) - 'a';
                if (index < 26) {
                    chars[index] = cipherMessage.charAt(i);
                }
            }
        }

        public static String convertToCipherMessage(String message) {
            StringBuilder sb = new StringBuilder();
            for (char c : message.toCharArray()) {
                int index = c - 'a';
                sb.append((char)chars[index]);
            }
            return sb.toString();
        }

}


