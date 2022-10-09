
const marsApiButtons = document.querySelectorAll("button[id*='marsApi']");

for (let i = 0;i<marsApiButtons.length;i++){
    let currentRoverBtn = marsApiButtons[i];
    currentRoverBtn.addEventListener('click', function(){
        //alert(currentRoverBtn.innerHTML + " clicked!")
        let apiData = document.getElementById("marsApiRoverData");
        apiData.value = currentRoverBtn.innerHTML;
        document.getElementById('frmRoverType').submit();

    })
}