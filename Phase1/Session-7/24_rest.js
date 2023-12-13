
//Rest Parameter
//Variable Length Arguments
function sum(...nums){

    let total=0;
    for(let n of nums){
        total+=n;
    }

    return total;
}

console.log(sum(1,2,3));
console.log(sum(1,2,3,4,5,6,7,8));
console.log(sum(1,2,3,4,5,6,7,8,9,10));