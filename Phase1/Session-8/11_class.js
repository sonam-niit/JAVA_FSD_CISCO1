class Employee{
    constructor(id,name,department,salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary
    }
    displayData(){
        console.log('Id: '+this.id);
        console.log('Name: '+this.name);
        console.log('Department: '+this.department);
        console.log('Salary: '+this.salary);
    }
    employeeStatus(){
        if(this.salary>50000){
            console.log('Already having 2 Years of Exp');
        }else{
            console.log("Newly Hired Employee");
        }
    }
}

const e1= new Employee(1,'Alex','IT',20000);
const e2= new Employee(2,'BOb','Finance',200000);
e1.displayData();
e1.employeeStatus();
e2.displayData();
e2.employeeStatus();