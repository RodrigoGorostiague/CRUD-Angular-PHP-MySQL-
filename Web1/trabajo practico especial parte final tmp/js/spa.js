function select_tab(id){
    document.querySelectorAll(".route")
    .forEach((item) => item.classList.remove("selected"));
    document.querySelectorAll("#" + id)
    .forEach((item) => item.classList.add("selected"));
}
async function load_content(id){
    let container = document.querySelector("#content");
    container.innerHTML= "Content Loading for /" + id + "...";
    try{
        let response = await fetch(`${id}.html`);
        if (response.ok){
            let content = await response.text();
            container.innerHTML = content;
    }
    else{
        container.innerHTML = "fallo";
    }
}
catch (error){

}


}

function push(event) {
    let id = event.target.id;
    select_tab(id);
    document.title = id;
    load_content(id);
    window.history.pushState({ id }, `${id}`, `/page/${id}`);
}


window.onload = (event) =>{
    document.querySelector("#preguntas_frecuentes").addEventListener("click", (event)=> push(event));
    document.querySelector("#condiciones").addEventListener("click", (event)=> push(event));
    document.querySelector("#quiero_donar").addEventListener("click", (event)=> push(event));
    document.querySelector("#home").addEventListener("click", (event)=> push(event));
    document.querySelector("#contacto").addEventListener("click", (event)=> push(event));
    
 document.querySelector("#btn_abrir");
document.querySelector("#btn_close"); 
document.querySelector("#modal-container");
document.querySelector("#modal");
document.querySelector("#formBanco")

document.querySelector("#nombre");
document.querySelector("#apellido");
document.querySelector("#grupoSanguineo");

document.querySelector("#listado")
}

window.addEventListener("popstate", (event)=>{
    let stateId = event.state.id;
    select_tab(stateId);
    load_content(stateId);
});