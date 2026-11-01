/**
 * @param {number[]} nums
 * @return {number}
 */
var countStaircase = function(nums) {
    const n = nums.length;
    let totalStairCases = 0;
    for(let l = 0; l<n; l++){
        const freq = {};
        const quota = {};
        let distinctCount = 0;
        let matchedCount = 0;
        for(let r = l; r < n; r++){
            const val = nums[r];
            if(freq[val] === undefined){
                freq[val] = 0;
                distinctCount++;
                quota[val] = distinctCount;
            }

            if(freq[val] === quota[val]){
                matchedCount--;
            }

            freq[val]++;

            if(freq[val] === quota[val]){
                matchedCount++;
            }else if(freq[val] > quota[val]){
                break;
            }

            if(matchedCount === distinctCount){
                totalStairCases++;
            }
        }
    }
    return totalStairCases++;
};