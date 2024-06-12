/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) return false // checks if the x is negative number

    let reversed = 0, original = x;

    while (x > 0) {
        let lastDigit = x % 10; // Get the last digit of x
        reversed = reversed * 10 + lastDigit; // Append the digit to reverse variable
        x = Math.floor(x / 10) // Remove the last digit of x
    }
    return reversed === original;
};