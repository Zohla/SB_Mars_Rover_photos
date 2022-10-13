
const marsApiButtons = document.querySelectorAll("button[id*='marsApi']");
let urlParams = new URLSearchParams(window.location.search);
let displayedRover = urlParams.get("marsApiRoverData")

for (let i = 0;i<marsApiButtons.length;i++){
    if (marsApiButtons[i].innerHTML.toLowerCase() == displayedRover.toLowerCase()){
        marsApiButtons[i].style.backgroundColor = 'orange';
    } else{
        marsApiButtons[i].style.backgroundColor = '#0d6efd';
    }
}
for (let i = 0;i<marsApiButtons.length;i++){
    let currentRoverBtn = marsApiButtons[i];
    currentRoverBtn.addEventListener('click', function(){
        let apiData = document.getElementById("marsApiRoverData");
        apiData.value = currentRoverBtn.innerHTML;
        document.getElementById('frmRoverType').submit();
        currentRoverBtn.style.backgroundColor ='orange';
    })
}


