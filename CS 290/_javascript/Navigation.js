/* Navigation Functions */

function open_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "250px";
    document.getElementById("main_Body").style.marginLeft = "250px";
}

function close_Nav_Bar() {
    document.getElementById("side_Nav").style.width = "0";
    document.getElementById("main_Body").style.marginLeft= "0";
}