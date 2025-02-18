let movies=["Avengers","Little Women","Joker"];
movies.push("Beauty and the Beast");
movies.push("Deadpool");
movies.shift();
movies.pop();
movies.unshift("Inception");
movies.splice(2,1,"Interstellar");
console.log(movies);
let leng=movies.length;
let a=1;
for (let i =0;i<leng;i++){
    console.log(a+". "+movies[i]);
    a+=1;
}

console.log("-----------");

console.log("Destructuring arrays");
const numbers = [10, 20, 30];
const [first, second] = numbers;
console.log(first, second); 

console.log();
const fruits=["Apple","Banana","Mango"];
const [f,s]=fruits;
console.log(f,s);

const car={brand:"Tesla",model:"Model 3",year:2022};
const {brand,model}=car;
console.log(brand,model)
console.log();

console.log("spread operator(...)");
const colors1=["Read","Green","Blue"];
const colors2=["Yellow","Purple"];
const merged=[...colors1,...colors2];
console.log (merged);
const multiplyAll=(...nums) =>{
    return nums.reduce((total,num)=>total*num,1);
};
console.log(multiplyAll(2, 3, 4));