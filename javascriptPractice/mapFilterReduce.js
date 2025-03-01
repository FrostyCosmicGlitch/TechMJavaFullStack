function addFive(a) {
    let adddFive = a.map(num => num + 5);
    return adddFive;
}
console.log("A code using map");
console.log(addFive([10, 20, 30]));
function filterOdd(a) {
    let odd = a.filter(nums => (nums % 2 != 0));
    return odd;
}
console.log("A code using filter");
console.log(filterOdd([10, 15, 20, 25]));
function multiplyAll(a) {
    let result = a.reduce((total, num) => total * num, 1);
    return result;
}
console.log("A code using reduce");
console.log(multiplyAll([2, 3, 4]));


console.log("Lets try with everything now.");

console.log("");
function processNumbers(a) {
    let maps = a.map(nums => nums * 2);
    let filterr = maps.filter(num => (num > 10));
    let reducee = filterr.reduce((total, n) => total + n, 0);
    return { doubled:maps, filter:filterr, sum:reducee };
}
console.log(processNumbers([2, 5, 8, 10, 12]));  