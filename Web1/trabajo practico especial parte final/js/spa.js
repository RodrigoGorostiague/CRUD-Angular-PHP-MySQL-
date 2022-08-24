function select_tab(id){
    document.querySelectorAll(".route")
    .forEach((item) => item.classList.remove("selected"));
    document.querySelectorAll("#" + id)
    .forEach((item) => item.classList.add("selected"));
}
async function load_content(id){
    let container = document.querySelector("#content");
    container.innerHTML= "se esta cargando  /" + id + "...";
    try{
        let response = await fetch(`${id}.html`);
       
        
            
        

        if (response.ok){
            let content = await response.text();
            container.innerHTML = content;
            initTabla()
            //jsjs
            initCaptacha();
            
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
    window.history.pushState({ id }, `${id}`, `/${id}.html`);
}


window.onload = (event) =>{
    document.querySelector("#home").addEventListener("click", (event)=> push(event));
    document.querySelector("#preguntas_frecuentes").addEventListener("click", (event)=> push(event));
    document.querySelector("#condiciones").addEventListener("click", (event)=> push(event));
    document.querySelector("#quiero_donar").addEventListener("click", (event)=> push(event));
    document.querySelector("#contacto").addEventListener("click", (event)=> push(event));
    inicio();
    }

window.addEventListener("popstate", (event)=>{
    let stateId = event.state.id;
    select_tab(stateId);
    load_content(stateId);
});
async function inicio(){
    try{
    let container = document.querySelector("#content");
    let response = await fetch("home.html");
    if (response.ok){
        let content = await response.text();
        container.innerHTML = content;
    }
}
catch (error){

}
}





//aca no va
