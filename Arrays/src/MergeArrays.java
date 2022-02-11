public class MergeArrays {
    public static void main(String[] args) {
        String [] array1 = new String[]{"a","c","e"};
        String [] array2 = new String[]{"b","d"};
        StringBuilder stringBuilder = new StringBuilder();

        int maxLengthArray = Math.max(array1.length, array2.length);

        for( int i = 0 ; i<maxLengthArray ; i++){
            if(i<array1.length){
                stringBuilder.append(array1[i]);
            }
            if(i<array2.length){
                stringBuilder.append(array2[i]);
            }
        }

        System.out.println(stringBuilder);
    }
}
