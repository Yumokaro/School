/* Navigation Functions */

function open_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "15%";
    document.getElementById("main").style.marginLeft = "15%";
}

function close_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "0";
    document.getElementById("main").style.marginLeft= "10%";
}