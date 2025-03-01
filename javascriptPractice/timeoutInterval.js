/*console.log("Start");
setTimeout(() => {
    console.log("this will run after 2 seconds");

}, 2000);
console.log("End");

let count = 1;
let interval = setInterval(() => {
    console.log("Hello! count:", count);
    count++;
    if (count > 5) {
        clearInterval(interval);
        console.log("Stopped interval")
    }
}, 1000);
*/


console.log();
function countdown(n) {
    let count = n;
    let counting = setInterval(() => {
        console.log(count);
        count--;
        if (count < 1) {
            clearInterval(counting);
            console.log("Time's up!");
        }
    }, 1000);
}
countdown(5);