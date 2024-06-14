/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = []
    const mapping = {
        ")": "(",
        "}": "{",
        "]": "["
    }

    for (let char of s) {

        // Checks if the character is closing bracket
        if (char in mapping) {
            const topElement = stack.length === 0 ? "#" : stack.pop()
            if (mapping[char] !== topElement) { // return false if top element is not equals to the current character
                return false;
            }
        } else {
            stack.push(char) // push if it is a opening parantheses
        }
    }
    return stack.length === 0;
};