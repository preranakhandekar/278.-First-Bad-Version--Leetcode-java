public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int li=1,hi=n;
        while(li<=hi){
           int  mid=li+(hi-li)/2;
            if(isBadVersion(mid))
            hi=mid-1;
            else
            li=mid+1;
            if(isBadVersion(mid) && !(isBadVersion(mid-1)))
            return mid;
        }
        return 1;
    }
}
