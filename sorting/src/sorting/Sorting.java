package sorting;
import java.util.*;
public class Sorting {
public static void printArr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	
	}
	System.out.println();		
}

//Bubble sort : - Largest element is thrown at last
public static void bubbleSort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	printArr(arr);
	
}

//Selection Sort : - Smallest element is thrown at first
public static void selectionSort(int arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		int smallest= i ;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[smallest]>arr[j]) {
			smallest=j;
		}
		int temp=arr[smallest];
		arr[smallest]=arr[i];
		arr[i]=temp;
	}
	}
	printArr(arr);
}

//Insertion Sort:- divides the array into parts sorted and unsorted part and then sorts it using the current index
public static void insertionSort(int arr[]) {
	for(int i=1;i<arr.length;i++) {
		int current = arr[i];
		int j=i-1; //sorted array index last element
		while(j>=0  && current<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		//placement current index
		arr[j+1]=current;
	}
	printArr(arr);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,8,3,1,2};
		
		bubbleSort(arr);
		
		selectionSort(arr);
		
		insertionSort(arr);
		}

}
