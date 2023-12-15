const welcome= ()=>console.log("Welcome");

const add= (num1,num2)=>num1+num2;

const calculate= (num1,num2)=>{
    const mul=num1*num2;
    const add=num1+num2;

    return mul+add;
}

welcome();
console.log(`Addition: ${add(2,3)}`);
console.log(`Calculation: ${calculate(2,3)}`);