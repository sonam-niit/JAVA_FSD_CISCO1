const array=[1,2,3,4,5,6,7,8,9];

// array.forEach((value,index)=>{
//     console.log(`${index}: ${value}`);
// })
//creating new array from original as per the logic
const newArray=array.map((value)=>value*3)
console.log(newArray);

//filteration of array use filter method
const evenArray= array.filter((value)=>value%2==0);
console.log(evenArray);

//find element in array return a value if that value found if not 
//found then return undefined

const found= array.find((value)=>value==9);
console.log(found);