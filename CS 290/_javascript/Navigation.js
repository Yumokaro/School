/* Navigation Functions */

function open_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "20%";
    document.getElementById("main").style.marginLeft = "20%";
}

function close_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "0";
    document.getElementById("main").style.marginLeft= "10%";
}