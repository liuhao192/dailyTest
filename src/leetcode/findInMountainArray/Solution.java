package leetcode.findInMountainArray;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/29 15:16
 */
interface MountainArray {

    int get(int index);

    int length();
}

class MountainArrayImpl implements MountainArray {
    private final int[] arr;
    private final int size;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return size;
    }
}


public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int right = len - 1;
        int left = 0;
        //查找最高点
        while (left < right) {
            int mid = (left + right - 1) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }


        int leftFind = leftFind(0, left, target, mountainArr);
        if (leftFind != -1) {
            return leftFind;
        }
        return rightFind(left + 1, len-1, target, mountainArr);
    }

    private int leftFind(int left, int right, int target, MountainArray mountainArr) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (mountainArr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (mountainArr.get(left) == target) {
            return left;
        }
        return -1;
    }

    private int rightFind(int left, int right, int target, MountainArray mountainArr) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (mountainArr.get(mid) > target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (mountainArr.get(left) == target) {
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 0};
        int target = 0;
        MountainArray mountainArray = new MountainArrayImpl(arr);

        Solution solution = new Solution();
        int res = solution.findInMountainArray(target, mountainArray);
        System.out.println(res);
    }
}

