class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Simply add 1 if it's not 9
                return digits;
            }
            digits[i] = 0; // If it's 9, make it 0 and continue to the next digit
        }

        // If we reach this point, all digits were 9 (e.g., 999 → 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // The first digit becomes 1, rest are already 0

        return result;
    }
}
