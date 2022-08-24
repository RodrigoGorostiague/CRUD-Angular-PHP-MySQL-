let tirara_dados = document.querySelector("#tirar_dados");
let dado1 = document.querySelector("#dado_1")
let dado2 = document.querySelector("#dado_2")
let d1
let d2

tirara_dados.addEventListener("click", tirar);

function tirar(){
    d1 = Math.floor((Math.random()*6)+1);
    d2 = Math.floor((Math.random()*6)+1);
 
    dado1.src = "images/dado" + d1 + ".png";
    dado2.src = "images/dado" + d2 + ".png";
    gane();
}
function gane(){
    if ((d1+d2) == 8){
        alert("ganaste");
    }
   
}