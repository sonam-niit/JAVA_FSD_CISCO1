const user={id:1,name:"sonam",email:"sonam@gmail.com"};

for(let key in user){
    console.log(key+" : "+user[key]);
}

for(let key of Object.keys(user)){
    console.log(key+" : "+user[key]);
}

const stringFormat=JSON.stringify(user);
console.log(stringFormat);
const jsonObject= JSON.parse(stringFormat);
console.log(jsonObject);