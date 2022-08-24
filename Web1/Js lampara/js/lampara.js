document.getElementById("btn-prender").addEventListener("click", prender);
document.getElementById("btn-apagar").addEventListener("click", apagar);
apagar();



function prender(){
    document.getElementById("img-foco").src = "images/foco_on.jpg";
    document.getElementById("fondo").classList.add("prendido");
    document.getElementById("fondo").classList.remove("apagado");
    document.getElementById("btn-prender").innerHTML="Apagar";
}

function apagar(){
    document.getElementById("img-foco").src = "images/foco_off.jpg";
    document.getElementById("fondo").classList.add("apagado");
    document.getElementById("fondo").classList.remove("prendido");
}
