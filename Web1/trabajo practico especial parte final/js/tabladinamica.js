function initTabla(){

    const url = "https://62b7869b691dcea2733fbc05.mockapi.io/api/banco/";
    
    let abrir = document.querySelector("#btn_abrir"); 
    let cerrar = document.querySelector("#btn_close"); 
    let modalCont = document.querySelector("#modal-container");
    let modal = document.querySelector("#modal");
    let guardar = document.querySelector("#btn_guardar")
    let resultados = '';
    let nombre = document.querySelector("#nombre");
    let apellido = document.querySelector("#apellido");
    let grupoSan = document.querySelector("#grupoSanguineo");
    let opcion = '';
    const listado = document.querySelector("#listado")
    
    abrir.addEventListener("click", mostrarModal)
    cerrar.addEventListener("click", ocultarModal)

    
    function mostrarModal(){
        console.log(opcion)
        
        modalCont.classList.add("visible")
        modalCont.classList.remove("hidden")
        modal.classList.toggle("modal-close");
        opcion= 'crear';
        
        
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
    
    
    //funcion para mostrar los resultados
    const mostrar = (banco) => {
        banco.forEach(dataBanco => {
            resultados += `<tr>
                                <td>${dataBanco.id}</td>
                                <td>${dataBanco.nombre}</td>
                                <td>${dataBanco.apellido}</td>
                                <td>${dataBanco.grupo}</td>
                                <td class="text-center"><button class="btnEditar btn btn-primary">Editar</button><button class="btnBorrar btn btn-danger">Borrar</button></td>
                           </tr>
                        `    
        })
        listado.innerHTML = resultados
    }
    
    //Procedimiento Mostrar
    fetch(url)
        .then( response => response.json() )
        .then( data => mostrar(data) )
        .catch( error => console.log(error))
        
      
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
        alertify.confirm("This is a confirm dialog.",
        function(){
            fetch(url+id, {
                method: 'DELETE'
            })
            .then( res => res.json() )
            .then( ()=> actualizarTabla())
            alertify.success('Ok')
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
         console.log(opcion)
    })
    
    //Procedimiento para Crear y Editar
    guardar.addEventListener('click', ()=>{
       
        console.log(opcion)
        if(opcion=='crear'){        
            //console.log('OPCION CREAR')
            fetch(url, {
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
                mostrar(nuevoArticulo)
            })
            
            console.log(opcion)
        }
        if(opcion=='editar'){    
            //console.log('OPCION EDITAR')
            fetch(url+idForm,{
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
            .then( ()=> actualizarTabla() )
        }
        ocultarModal()
        console.log(opcion)
    })
}







