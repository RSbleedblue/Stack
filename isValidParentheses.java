class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = bSUB(arr, target);
        ans[1] = bSLB(arr, target);
        return ans;
    }

    public static int bSUB(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        if (si < arr.length && arr[si] == target) {
            return si;
        }
        return -1;
    }

    public static int bSLB(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] <= target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        if (ei >= 0 && arr[ei] == target) {
            return ei;
        }
        return -1;
    }
}
