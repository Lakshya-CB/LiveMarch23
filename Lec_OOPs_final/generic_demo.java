package Lec_OOPs_final;

import java.util.Comparator;

public class generic_demo {
	public static void main(String[] args) {
		student[] arr = new student[5];
		arr[0] = new student(10, "A");
		arr[1] = new student(1, "B");
		arr[2] = new student(5, "L");
		arr[3] = new student(13, "az");
		arr[4] = new student(8, "aZ");
		print(arr);
		sort(arr, new Student_com());
		print(arr);

	}

//	public static void print(Object[] arr) {
//		for(Object obj : arr) {
//			System.out.println(obj);
//		}
//	}
	public static <tui> tui print(tui[] arr) {
		for (tui ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
		return null;
	}

	public static <OO extends Comparable<OO>> void sort(OO[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int i = 0; i < arr.length - 1; i++) {
//				i and i+1!!

//				if (arr[i] > arr[i + 1]) {
//				if(arr[i]- arr[i+1]>0) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					OO temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	static class Student_com implements Comparator<student> {
		@Override
		public int compare(student o1, student o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	public static <OO> void sort(OO[] arr, Comparator<OO> camp) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int i = 0; i < arr.length - 1; i++) {
//				i and i+1!!

				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					OO temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
