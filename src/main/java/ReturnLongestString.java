
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int m=arr[0].length();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i+1].length()>m){
                m=arr[i+1].length();
                j=i;
            }

        }
        return arr[i];
    }
}
