/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
        return s.trim().replace(/\s+/g, ' ').split(' ').pop().length

};