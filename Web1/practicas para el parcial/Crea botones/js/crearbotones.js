document.querySelector("#bnt_agregar").addEventListener("click", agregar);

function agregar (){
    let btn = document.createElement("button");
    btn.innerHTML = "boton nuevo";
    let acabotones = document.querySelector("#acabotones");
    acabotones.append(btn);
    btn.addEventListener("click", ()=>alert("hola mi amor"));

}