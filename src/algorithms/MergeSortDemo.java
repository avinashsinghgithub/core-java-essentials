package algorithms;

public class MergeSortDemo {

    public static void main(String args []){

        int [] arr = {5,7,3,1,45,3,34,43,21,12};
        mergeSort(arr,0,arr.length-1);

    }

    public static int [] mergeSort(int [] input , int start, int end){
        int[] result = new int[end-start+1];
        int mid = (start + end)/2;
        if(start == end){
            result[0] = input[start];
            return result;
        }

        int[] part1 = new int[mid - start +1];
        int [] part2 = new int[end - mid +1];


        if(start !=end){

            part1  = mergeSort(input,start,mid);
            part2  = mergeSort(input,mid+1,end);
        }
        int j=0,k=0;
        for(int i=0;i<part1.length;){
            if(part1[i]>part2[j]){
                result[k]= part2[j];
                j++;
            }else{
                result[k]=part1[i];
                i++;
            }
            k++;
        }
        if(j<part2.length-1){
            result[k]=part2[j];
            j++;
        }

        return  result;
    }

}
