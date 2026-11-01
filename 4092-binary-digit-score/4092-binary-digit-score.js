/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
var calculateScore = function(a, b) {
    const countSetBits = (num) => {
        let count = 0;
        while(num > 0){
            num = num & (num - 1);
            count++;
        }
        return count;
    };

    const s1 = countSetBits(a);
    const s2 = countSetBits(b);

    if(s1 >= s2){
        return s1*s2;

    }else{
        return Math.floor(s2/s1);
    }
};