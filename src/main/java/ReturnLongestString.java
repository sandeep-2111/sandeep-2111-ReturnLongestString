
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int [] a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=arr[i].length();
            //Arrays.sort(a);
        }
        int large=a[0];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(large<a[i]){
               large=a[i];
               j=i;
            }
        }
        return arr[j];
    }
}
