
const marsApiButtons = document.querySelectorAll("button[id*='marsApi']");
let urlParams = new URLSearchParams(window.location.search);
let displayedRover = urlParams.get("marsApiRoverData")

for (let i = 0;i<marsApiButtons.length;i++){
    if (displayedRover == null){
        displayedRover = "Curiosity";
    }
    if (marsApiButtons[i].innerHTML.toLowerCase() == displayedRover.toLowerCase()){
        marsApiButtons[i].classList.remove("btn-secondary");
        marsApiButtons[i].classList.add("btn-primary");
    } else{
        marsApiButtons[i].classList.add("btn-secondary");
        marsApiButtons[i].classList.remove("btn-primary");
    }
}
for (let i = 0;i<marsApiButtons.length;i++){
    let currentRoverBtn = marsApiButtons[i];
    currentRoverBtn.addEventListener('click', function() {
        let apiData = document.getElementById("marsApiRoverData");
        apiData.value = currentRoverBtn.innerHTML;
        document.getElementById('frmRoverType').submit();
    })
}


