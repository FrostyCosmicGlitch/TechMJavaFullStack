/*function fetchData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let sucesses = Math.random() > 0.5;
            if (sucesses) {
                resolve("data fetched sucessfully!");
            }
            else {
                reject("Error in fetching data!");
            }
        }, 3000);
    });
}

//*fetchData()
//    .then(response => console.log(response))  
 //   .catch(error => console.log(error)); 


    async function fetchDataAsync() {
        try {
            let response = await fetchData();  
            console.log(response);  
        } catch (error) {
            console.log(error);  
        }
    }
    
fetchDataAsync(); 
    






async function fetchUserData() {
    try {
        let response = await fetch("https://jsonplaceholder.typicode.com/users/3"); // Fetch data
        let data = await response.json(); 
        console.log(`Name:${data.name}`);
        console.log(`Email:${data.email}`);
    } catch (error) {
        console.log("Error fetching data:", error);
    }
}

fetchUserData(); 


console.log("or we can do this way too");
fetch("https://jsonplaceholder.typicode.com/users/3")
    .then(response => response.json()) 
    .then(data => console.log(`Name:${data.name}`,`Email:${data.email}`))
    .catch(error => console.log("Error:", error));
*/

async function fetchUserData() {
    try {
        let response = await fetch("https://jsonplaceholder.typicode.com/users/100");
        if (!response.ok) {
            throw new Error(`API Error:${response.status} - ${response.statusText}`);

        }
        let data = await response.json();
        console.log(`Name:${data.name}`);
        console.log(`Email:${data.email}`);

    }
    catch (error) {
        console.log("Error fetching data:", error.message)
    }
}
fetchUserData()