class Student {
    constructor(name, age, course, city, country) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = { city, country };
    }

    getDetails() {
        return `${this.name}, Age: ${this.age}, Course: ${this.course}`;
    }

    updateAge(newAge) {
        this.age = newAge;
    }

    getAddress() {
        return `${this.address.city}, ${this.address.country}`;
    }
}


let student = new Student("Alice", 22, "Computer Science", "Chennai", "India");


console.log(student.getDetails());
console.log(student.getAddress());


delete student.course;
console.log(student);
