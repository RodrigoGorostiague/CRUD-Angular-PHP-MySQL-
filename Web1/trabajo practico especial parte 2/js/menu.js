menuBtn = document.querySelector(".btn_menu");
navigation = document.querySelector(".navigation");


  menuBtn.addEventListener("click", () => {
    menuBtn.classList.toggle("close");
    navigation.classList.toggle("show");
    console.log ("que pasa")
  });
  navigation.addEventListener("click", e => {
    if (e.target.id != "nav") {
      navigation.classList.remove("show");
      menuBtn.classList.remove("close");
    }
  });