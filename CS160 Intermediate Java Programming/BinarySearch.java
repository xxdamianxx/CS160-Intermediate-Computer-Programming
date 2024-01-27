public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(gcd(18, 24));
        System.out.println(reverseString("SDSU CS160"));
        int [] arr = {-4, 2, 0, 1, 5, 7, 11, 80};
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearchRecursive(arr, 7, 0, -1));
    }

    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiply(a, -b);
        }
        return multiply(a, b - 1) + a;
    }

    public static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b,a % b);
    }

    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }
        else {
            return binarySearchRecursive(arr, target, left, mid + 1);
        }
    }
}