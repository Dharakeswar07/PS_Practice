package L2_Interview_Prep.LeetCode;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] nums={3,4};
        int[] nums1={1,2};
        System.out.println(findMedianSortedArrays(nums,nums1));
    }
    public static int[] arraySort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m=nums1.length;
            int n=nums2.length;
            int[] arr=new int[m+n];
            /*for(int i=0;i<m;i++)
            {
                arr[i]=nums1[i];
            }
            for(int i=0;i<n;i++)
            {
                arr[i+m]=nums2[i];
            }*/
            System.arraycopy(nums1,0,arr,0,m);
            System.arraycopy(nums2,0,arr,m,n);
            arraySort(arr);
            double res=0;
            int mid=(m+n)/2;
            if((m+n)%2==0)
            {
                res=(arr[mid-1]+arr[mid])/2.0;
            }
            else
            {
                res=arr[mid];
            }
            return res;
        }
    }
