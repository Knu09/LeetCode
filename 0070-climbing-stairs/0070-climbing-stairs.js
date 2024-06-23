/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
        let dp = []
    // set initial base case
    dp[1] = 1;
    dp[2] = 2;

    // loop if starting step 3 is less than the given n
    for (let i = 3; i <= n; i++) {
        // add i - 1 and i - 2
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];

};