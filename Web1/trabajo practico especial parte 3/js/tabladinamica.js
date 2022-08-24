const url = "https://62b7869b691dcea2733fbc05.mockapi.io/api/banco";
const lista = document.querySelector("#listado");
let abrir = document.querySelector("#btn_abrir");
let abrir3 = document.querySelector("#btn_abrir3");
let cerrar = document.querySelector("#btn_close"); 
let modalCont = document.querySelector("#modal-container");
let modal = document.querySelector("#modal");
let formBanco = document.querySelector("#formBanco")
let nombre = document.querySelector("#nombre");
let apellido = document.querySelector("#apellido");
let grupoSan = document.querySelector("#grupoSanguineo");
let next = document.querySelector("#next");
let prev = document.querySelector("#prev");
let buscar = document.querySelector("#buscar");
let resultados = '';
let opcion = '';
let page = 1;
let limit = 5;
let finalLenght;
let lenght;
let filtro = '';
//Botones
abrir.addEventListener("click", mostrarModal);

abrir3.addEventListener("click", (e)=>{
    opcion="crear3"
    crear(e)
});
cerrar.addEventListener("click", ocultarModal);
next.addEventListener("click", ()=>{
    page++;
    mostrar();
});
prev.addEventListener("click", ()=>{
    page--;
    mostrar();
});
buscar.addEventListener("keyup",(e)=>{
    filtro=""
    if(e.keyCode === 13){
        e.preventDefault();
        let busqueda = buscar.value;
        
        filtro = "&search="+busqueda
        mostrar()
    }
})
formBanco.addEventListener('submit', crear );
//para cargar al inicio
mostrar();


//metodos
function mostrarModal(){
    modalCont.classList.add("visible")
    modalCont.classList.remove("hidden")
    modal.classList.toggle("modal-close");
    opcion = "crear"
}


function ocultarModal(){
    modal.classList.toggle("modal-close")
    setTimeout(function(){
        modalCont.classList.add("hidden")
        modalCont.classList.remove("visible")
        nombre.value=''
        apellido.value=''
        grupoSan.value=''
    },800)
}
async function largoTotal(){
    finalLenght=0
    try {
        let res = await fetch(url); 
        let json = await res.json(); 
        json.forEach(() => {
            finalLenght++
        });
    }
    catch(error){
        console.log(error)
    }
}
function paginacionVisible(){
    if(page==1){
        prev.classList.add("hidden")
        prev.classList.remove("visible")
    }
    else{
        prev.classList.add("visible")
        prev.classList.remove("hidden")
    }
    if((lenght!=limit)||(lenght*page==finalLenght)){
        next.classList.add("hidden")
        next.classList.remove("visible")
    }
    else{
        next.classList.add("visible")
        next.classList.remove("hidden")
    }
}
async function mostrar(){
    largoTotal()
    resultados = '';
    try {
        let res = await fetch(url+"?page="+page+"&limit="+limit+filtro); 
        let json = await res.json(); 
        lenght = 0;
        for (const dataBanco of json) {
            
            resultados += `<tr>
            <td>${dataBanco.id}</td>
        <td>${dataBanco.nombre}</td>
        <td>${dataBanco.apellido}</td>
        <td>${dataBanco.grupo}</td>
        <td class="text-center"><button class="btnEditar btn btn-primary">Editar</button><button class="btnBorrar btn btn-danger">Borrar</button></td>
        </tr>
        `  
        lenght++;
    }
    listado.innerHTML = resultados
    paginacionVisible()
} catch (error) {
    console.log(error);
}}

const on = (element, event, selector, handler) => {
        element.addEventListener(event, e => {
        if(e.target.closest(selector)){
            handler(e)
        }
    })
}


//Procedimiento Borrar
on(document, 'click', '.btnBorrar', e => {
    const fila = e.target.parentNode.parentNode
    const id = fila.firstElementChild.innerHTML
    alertify.confirm("Realmente desea hacerlo?",
    function(){
        fetch(url+"/"+id, {
            method: 'DELETE'
        })
        mostrar();
        alertify.success('Eliminado')
    },
    function(){
        alertify.error('Cancel')
    })
})

//Procedimiento Editar
let idForm = 0
on(document, 'click', '.btnEditar', e => {    
    const fila = e.target.parentNode.parentNode
    idForm = fila.children[0].innerHTML
    const descripcionForm = fila.children[1].innerHTML
    const precioForm = fila.children[2].innerHTML
    const stockForm = fila.children[3].innerHTML
    nombre.value =  descripcionForm
    apellido.value =  precioForm
    grupoSan.value =  stockForm
    mostrarModal()
    opcion = 'editar'
    
})

//Procedimiento para Crear y Editar
function crear(e){
    e.preventDefault()
    console.log(opcion)
    if(opcion=='crear'){
        fetch(url+"/", {
            method:'POST',
            headers: {
                'Content-Type':'application/json'
            },
            body: JSON.stringify({
                nombre:nombre.value,
                apellido:apellido.value,
                grupo:grupoSan.value
            })
        })
        .then( response => response.json() )
        .then( data => {
            const nuevoArticulo = []
            nuevoArticulo.push(data)
            
            mostrar()
        })
        ocultarModal()

    }
    if(opcion=='editar'){    
        fetch(url+"/"+idForm,{
            method: 'PUT',
            headers: {
                'Content-Type':'application/json'
            },
            body: JSON.stringify({
                nombre:nombre.value,
                apellido:apellido.value,
                grupo:grupoSan.value
            })
        })
        .then( response => response.json() )
        .then( ()=> location.reload() )
        ocultarModal()
    }
    if(opcion=='crear3'){        
            for(let i=0;i<3;i++){
        
            fetch(url+"/", {
                method:'POST',
                headers: {
                    'Content-Type':'application/json'
                },
                
                body: JSON.stringify({
                    //estando vacio y en mockapi el Faker.js se crean elementos aleatorios
                })
                
            })
            .then( response => response.json() )
        .then( ()=> location.reload() )
        }
      
        mostrar()
    }
}






