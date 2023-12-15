function f1(){
    console.log("Function 1 executed");
}
function f2(cb1,cb2){
    setTimeout(() => {
        console.log("F2 execution completed");
        cb1();
        cb2();
    }, 2000);
}
function f3(){
    console.log("Function 3 executed");
}
function f4(){
    console.log("Function 4 executed");
}
f1();
f2(f3,f4);//passing function as argument
// f3();
// f4();
