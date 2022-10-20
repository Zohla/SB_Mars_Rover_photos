let urlParams = new URLSearchParams(window.location.search);


let userId = urlParams.get("userId");

if (userId == null && userId == ""){
    userId = localStorage.getItem("userId");
}

if (userId != null && userId != ""){
    localStorage.setItem("userId", userId);
    document.getElementById("userId").value = userId;

}


const marsApiButtons = document.querySelectorAll("button[id*='marsApi']");
let roverName = document.getElementById("marsApiRoverData");

for (let i = 0;i<marsApiButtons.length;i++){
    if (roverName.value == null){
        roverName.value = "Curiosity";
    }
    if (marsApiButtons[i].innerHTML.toLowerCase() == roverName.value.toLowerCase()){
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
        roverName.value = currentRoverBtn.innerHTML;
        document.getElementById('frmRoverType').submit();
    })
}
let displayedSol= document.getElementById("sol").value;

if (displayedSol != null && displayedSol != "" && displayedSol >=0){
    document.getElementById("sol").value = displayedSol;
}


