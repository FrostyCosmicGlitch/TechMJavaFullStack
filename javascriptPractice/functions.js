function printTable(n,limit){
    for (let i=1; i<=limit;i+=1) {
        console.log(n," * ", i,"=",(n*i));
    }
}

console.log("6 table");
printTable(6,12);
console.log("3 table");
printTable(3,8);


// storing the result in an array

console.log("Storing in array");

function printTable(n, limit) {
    let resultArray = [];  

    for (let i = 1; i <= limit; i++) {
        let result = `${n} * ${i} = ${n * i}`; 
        resultArray.push(result); 
    }

    return resultArray; 
}


let tableOf4 = printTable(4, 5);
console.log(tableOf4);

let tableOf6 = printTable(6, 10);
console.log(tableOf6);

console.log("spread operator(...)");
const colors1=["Read","Green","Blue"];
const colors2=["Yellow","Purple"];
const merged=[...colors1,...colors2];
console.log (merged);
const multiplyAll=(...nums) =>{
    return nums.reduce((total,num)=>total*num,1);
};
console.log(multiplyAll(2, 3, 4));