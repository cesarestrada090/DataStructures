public class RevertArray {
    public static void main(String[] args) {
        String test = "test1 que tal";
        StringBuilder sb = new StringBuilder();
        for(int i = test.length()-1; i >= 0 ; i--){
            sb.append(test.charAt(i));
        }
        System.out.println(sb);

    }
}
