let car={make:"Toyota",model:"Corolla",year:2020,color:"Blue" };
console.log(car);
car.year=2000;
car.color="Platinum";
car.owner="Hannah";
console.log("The updated car object is :",car);

console.log("Printing the elements using for loop.")

for (let a in car){
    console.log(a+": "+car[a]);
}

console.log("Lets add function to our object ");

car.displaydetails=function(){console.log("This car is a "+this.name+" from the year "+this.year+" . Its color is "+this.color+" the owner is "+this.name)};
car.displaydetails();