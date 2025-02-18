let score=90;
if (score>=90){
    console.log("Grade A");
}
else if((75<=score)&&(score<=89)){
    console.log("Grade B");
}
else if((50<=score)&&(score<=74)){
    console.log("Grade C");
}
else if((0<=score)&&(score<50)){
    console.log("Fail");
}
else{
    console.log("Invalid score");
}

let a=(score>=90);
let b=((75<=score)&&(score<=89));
let c=((50<=score)&&(score<=74));
let d=((0<=score)&&(score<50));

// switch cases

switch(true){
    case (score>=90):
        console.log("Grade A");
        break;
    case ((75<=score)&&(score<=89)):
        console.log("Grade B");
        break;
    case ((50<=score)&&(score<=74)):
        console.log("Grade C");
        break;
    case ((0<=score)&&(score<50)):
        console.log("Fail");
        break;
    default:
        console.log("Invalid score");
}