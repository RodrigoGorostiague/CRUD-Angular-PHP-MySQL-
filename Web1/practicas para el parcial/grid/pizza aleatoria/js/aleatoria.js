document.querySelector("#pizza").addEventListener("click", pizza);
document.querySelector("#twist").addEventListener("click", twist);

let tipos = ["muzzarella", "peperoni", "anana","barrigona"];
let condimentos = ["oregano", "tomates", "huevo frito", "panceta"];

function pizza(){
    console.log("llego");
    let acapizza = document.querySelector(".acapizza");
    let pos = Math.floor((Math.random()*4));
    console.log(pos);
    
    acapizza.innerHTML =  ("Que tal una pizza de " + tipos[pos]);
}
function twist(){
    let acatwist = document.querySelector(".acatwist");
    let pos = Math.floor((Math.random()*4));
    
    acatwist.innerHTML = ("Agregale " +  condimentos[pos]);
}