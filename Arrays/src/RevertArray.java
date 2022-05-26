public class RevertArray {
    public static void main(String[] args) {
        String test = "test1 que tal";
        StringBuilder sb = new StringBuilder();
        for(int i = test.length()-1; i >= 0 ; i--){
            sb.append(test.charAt(i));
        }
        System.out.println(sb);
        String strs[] = ;
        String solution;
        for(int i = 0; i< strs.length; i++) {
            if(strs[0].charAt(i) != Character.MIN_VALUE && strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                solution = solution + strs[0].charAt(i);
            } else {
                break;
            }
        }
        return solution;

    }
}
