package Lec_15;

import java.util.Scanner;

public class book_allo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			t--;
			int [] books = new int[scn.nextInt()];
			int tot_student = scn.nextInt();
			int sum = 0;
			for(int i=0;i<books.length;i++) {
				books[i] = scn.nextInt();
				sum = sum+ books[i];
			}
			int s =0;
			int e = sum;
			int ans = sum;
			while(s<=e){
			    int max_pages = (s+e)/2;
			    if(isPos(books, tot_student, max_pages)) {
					ans = max_pages;
					e =  max_pages-1;
				}else{
				    s = max_pages+1;
				}
			}
			System.out.println(ans);
//			System.out.println("???");
//			for(int max_pages =0;max_pages<=sum;max_pages++) {
//				if(isPos(books, tot_student, max_pages)) {
//					System.out.println(max_pages);
//					break;
//				}
//				
//			}
		}
	}
	public static boolean isPos(int[] books, int tot_students, int max_page) {
//		{12 ,34 ,67 ,90}
//		max_pages = 50
		int curr_st =0;
		int load=0;
		for(int book: books) {
			if(book>max_page) {
				return false;
			}
			load = load +book;
			if(load>max_page) {
				curr_st++;
				load = book;
			}
			if(curr_st >=tot_students) {
				return false;
			}
		}
		
		
		return true;
	}
}
