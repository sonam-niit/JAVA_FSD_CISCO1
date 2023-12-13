const todos = [];

function addTodo(item) {
    todos.push(item);
    console.log("Todo Added");
}
function removeTodo(task) {
    let index=undefined;
    for(let i=0;i<todos.length;i++){
        if(todos[i]==task){
            index=i;
            break;
        }
    }
    if(index!=undefined){
        todos.splice(index,1);
        console.log("Task Removed "+task);
    }else{
        console.log("Task not found "+task);
    }
}
function display() {
    console.log(todos);
}

addTodo("hello");
addTodo("Check");
addTodo("Testing");
display();

removeTodo("Check");
removeTodo("Sonam");
display()