/* Navigation Functions */

function open_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "25%";
    document.getElementById("main_Body").style.marginLeft = "100px";
}

function close_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "0";
    document.getElementById("main_Body").style.marginLeft= "0";
}