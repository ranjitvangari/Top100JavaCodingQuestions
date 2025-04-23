package src.java;

import java.util.*;

public class Top30 {
    // 1. Reverse a String
    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // 2. Check if a Number is Prime
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 3. Reverse a Number
    public int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    // 4. Palindrome (String)
    public boolean isPalindromeString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // 4. Palindrome (Number)
    public boolean isPalindromeNumber(int num) {
        return num == reverseNumber(num);
    }

    // 5. Factorial
    public long factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // 5. Factorial (Recursive)
    public long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // 6. Fibonacci Series
    public void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    // 7. Missing Number in Array
    public int findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // 8. Swap Without Temp
    public void swapWithoutTemp(int[] nums, int i, int j) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    // 9. Find Duplicates
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                result.add(num);
            }
        }

        return result;
    }

    // 10. Largest/Smallest in Array
    public int[] findMinMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return new int[]{min, max};
    }

    // 11. Remove Duplicates
    public List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    // 12. Sort Array/List
    public void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public void sortList(List<Integer> list) {
        Collections.sort(list);
    }

    // 13. Count Character Occurrences
    public Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }

    // 14. First Non-Repeating Character
    public char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // If no non-repeating character found
    }

    // 15. Check Anagrams
    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    // 16. Generate Random Numbers
    public int generateRandomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }

    // 17. Integer Overflow
    public boolean willOverflow(int a, int b, char operation) {
        if (operation == '+') {
            if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
                return true; // Positive overflow
            }
            if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
                return true; // Negative overflow
            }
        } else if (operation == '*') {
            if (a > 0 && b > 0 && a > Integer.MAX_VALUE / b) {
                return true; // Positive overflow
            }
            if (a < 0 && b < 0 && a < Integer.MAX_VALUE / b) {
                return true; // Negative overflow after multiplication
            }
            if ((a > 0 && b < 0 && b < Integer.MIN_VALUE / a) ||
                    (a < 0 && b > 0 && a < Integer.MIN_VALUE / b)) {
                return true; // Mixed sign overflow
            }
        }

        return false;
    }

    // 18. Stack Implementation
    public class SimpleStack {
        private List<Integer> stack = new ArrayList<>();

        public void push(int item) {
            stack.add(item);
        }

        public int pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.remove(stack.size() - 1);
        }

        public int peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.get(stack.size() - 1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public int size() {
            return stack.size();
        }
    }

    // 19. Queue Implementation
    public class SimpleQueue {
        private List<Integer> queue = new ArrayList<>();

        public void enqueue(int item) {
            queue.add(item);
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return queue.remove(0);
        }

        public int peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return queue.get(0);
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public int size() {
            return queue.size();
        }
    }

    // 20. Count Words
    public int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        return sentence.trim().split("\\s+").length;
    }

    // 21. Common Elements in Arrays
    public List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        return new ArrayList<>(common);
    }

    // 22. Second Largest Number
    public int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array should have at least 2 elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return second;
    }

    // 23. Check if Array Contains Element
    public boolean arrayContains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // 24. Convert String to Integer
    public int stringToInteger(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        boolean negative = false;
        int i = 0;

        if (str.charAt(0) == '-') {
            negative = true;
            i = 1;
        } else if (str.charAt(0) == '+') {
            i = 1;
        }

        int result = 0;

        while (i < str.length()) {
            char c = str.charAt(i++);

            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("String contains non-digit characters");
            }

            result = result * 10 + (c - '0');
        }

        return negative ? -result : result;
    }

    // 25. Rotate Array
    public void rotateArray(int[] nums, int k) {
        k = k % nums.length; // Handle cases where k > length

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // 26. Longest Substring Without Repeats
    public String longestSubstringWithoutRepeats(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int startIndex = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(c);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startIndex = start;
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }

    // 27. Binary Search
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    // 28. Merge Two Sorted Arrays
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    // 29. Convert to Uppercase Without Built-in
    public String toUppercaseCustom(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }

        return new String(chars);
    }

    // 30. Balanced Brackets
    public boolean areBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
