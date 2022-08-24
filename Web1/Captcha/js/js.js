const captcha = document.querySelector(".captcha"),
refreshBtn = document.querySelector(".refresh-btn"),
inputField = document.querySelector("input"),
checkBtn = document.querySelector(".check-btn"),
statusTxt = document.querySelector(".status-txt");

let allChars = ['A', 'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',   'T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', 1,2,3,4,5,6,7,8,9,0];

function getCaptcha(){
    for (let i = 0; i < 6 ; i++) {
      let randomChar = allChars[Math.floor(Math.random() * allChars.length)];
      captcha.innerText += randomChar;
        
    }
}

getCaptcha();
refreshBtn.addEventListener("click", ()=>{
    captcha.innerText = "";
    getCaptcha();
});


checkBtn.addEventListener("click", e =>{
    e.preventDefault();
    statusTxt.style.display = "block";
    let inputVal = inputField.value.split('').join('');
    
    if(inputVal == captcha.innerText){
        statusTxt.style.color = "#4db2ec";
        statusTxt.innerText = "No eres un robot!!!";
        setTimeout(()=>{
            statusTxt.style.display ="";
            inputField.value = "";
            captcha.innerText = "";
            getCaptcha();

        }, 4000);
        
    }else{
        statusTxt.style.color = "red";
        statusTxt.innerText = "Incorrecto. Intentelo de nuevo.";

    }
});
