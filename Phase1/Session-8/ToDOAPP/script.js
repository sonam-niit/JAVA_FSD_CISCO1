class Todo{
    constructor(){
        this.todos=[];
    }

    addTodo(item){
        this.todos.push({id:Date.now(),name:item})
    }
    removeTodo(id){
        const newArray=this.todos.filter((item)=>item.id!=id);
        this.todos=newArray;
    }
    getAll(){
        return this.todos;
    }
}