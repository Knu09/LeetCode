/**
 * @param {string[]} strs
 * @return {string}
 */
let longestCommonPrefix = function(strs) {
    if (strs.length === 0) return ""; // return empty string if there's no element

    let prefix = strs[0] // sets the initial prefix

    for (let i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) !== 0) { // check if it's not common
            prefix = prefix.substring(0, prefix.length - 1) // cut the last character of prefix
        }
    }

    return prefix;
};