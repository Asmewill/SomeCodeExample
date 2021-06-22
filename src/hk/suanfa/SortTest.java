package hk.suanfa;

import java.util.Arrays;

public class SortTest {
    static  int[] inputs={3,5,4,2,1,6,9,7};
    public static void main(String[] args){

        quickSort(inputs,0,inputs.length-1);
        System.out.println(Arrays.toString(inputs));

    }

    //直接插入排序
    public static void insertSort(int[] inputs){
        int size = inputs.length;
        for(int i=1; i<size; i++){
            int temp = inputs[i];
            int j=i-1;
//            for(; j>=0&&(inputs[j]>temp); j--){
//                inputs[j+1] = inputs[j];
//            }
            while(j>=0&&(inputs[j]>temp)){
                inputs[j+1]=inputs[j];
                j--;
            }
            inputs[j+1] = temp;//确定temp所在的位置
        }
    }

    //冒泡排序
    //比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
    public static void buddleSort(int[] inputs) {
        int size = inputs.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (inputs[j] < inputs[j - 1]) {
                    int temp = inputs[j];
                    inputs[j] = inputs[j - 1];
                    inputs[j - 1] = temp;
                }
            }
        }
    }

    //直接选择排序
    public static void selectSort(int[] inputs){
        int size = inputs.length;
        for(int i=0; i<size; i++){
            int temp = inputs[i];
            int min = temp;
            int minIndex = i;
            for(int j=i+1; j<size; j++){
                if(min > inputs[j]){
                    min = inputs[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                inputs[i] = inputs[minIndex];
                inputs[minIndex] = temp;
            }
        }
    }






    //快速排序
    public static void quickSort(int[] inputs, int left, int right){
        if(left >= right)
            return;
        int base = inputs[left];
        int baseIndex = left;
        int end = right;
        while(left < right){
            while(right>left && inputs[right]>=base){
                right--;
            }
            inputs[left] = inputs[right];
            while(left<right && inputs[left]<=base){
                left++;
            }
            inputs[right] = inputs[left];
        }
        inputs[right] = base;
        quickSort(inputs, baseIndex, right-1);
        quickSort(inputs, right+1, end);
    }

    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int L, int R) {
        if(L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while(p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while(p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while(p2 <= R) {
            temp[i++] = arr[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for(i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }


    //堆排序
    public static void heapSort(int[] inputs){
        int size = inputs.length;
        for(int i=size; i>0; i--){
            heapSortBuildHeap(inputs, i);
            heapSortSwap(inputs, i-1);
        }

    }
    private static void heapSortSwap(int[] inputs, int end){
        int temp = inputs[end];
        inputs[end] = inputs[0];
        inputs[0] = temp;
    }
    private static void heapSortBuildHeap(int[] inputs, int end){
        int size = end;
        int start = size/2 - 1;
        for(int i=start; i>=0; i--){
            if(2*i+2<size){
                if(inputs[2*i+1] > inputs[2*i+2]){
                    if(inputs[2*i+1] > inputs[i]){
                        int temp = inputs[2*i+1];
                        inputs[2*i+1] = inputs[i];
                        inputs[i] = temp;
                    }
                }else{
                    if(inputs[2*i+2] > inputs[i]){
                        int temp = inputs[2*i+2];
                        inputs[2*i+2] = inputs[i];
                        inputs[i] = temp;
                    }
                }
            }else{
                if(inputs[2*i+1] > inputs[i]){
                    int temp = inputs[2*i+1];
                    inputs[2*i+1] = inputs[i];
                    inputs[i] = temp;
                }
            }
        }
    }










}
