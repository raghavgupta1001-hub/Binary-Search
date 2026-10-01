public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in dec part of array
                //this may be ans but look at left
                //this is why end!= mid-1
                end = mid;
            }else{
                //you are in asc part of array
                start = mid+1;//because we know thatmid+1 elemen is greater than mid element

            }
        }
        //in the end, start == end and pointing to the largest no because of the two checks above
        //start and end are always tying to find max element in the above two checks
        //hence, when they are pointing to just one element, that is the maximum one thai is what the checks say
        //more elaboration : at every point of time for strat and end, they have the best possible ans till that time
        //and if we are saying that only one item is remaining, hence cuz of above lne that is the best possible ans
      return start;// or return end as both are=
    }
}
