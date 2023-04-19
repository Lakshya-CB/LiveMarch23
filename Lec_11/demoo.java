package Lec_11;

public class demoo {
	public static void main(String[] args) {
		int num = Integer.MAX_VALUE;
		System.out.println(num + Integer.MAX_VALUE);
	}
	public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans = n;
        while(s<=e){
            // long midL=(0l+s+e)/2;
            // int mid = (int)midL;
            // int mid=(int)((0l+s+e)/2);
            int mid = s+(e-s)/2;
            if(isBadVersion(mid)){
                ans = mid;
                e = mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}
