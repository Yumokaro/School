function showTime() {
    var time = new Date();
    //var mil = time.getMilliseconds();
    var sec = time.getSeconds();
    var min = time.getMinutes();
    var hour = time.getHours();

    var day = time.getDay();
    var month = time.getMonth();
    var year = time.getFullYear();

    sec = checkTime(sec);
    min = checkTime(min);
    
    var dayArray = ["Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"];
    
    var short = (hour + ":" + min + ":" + sec);
    document.getElementById("shortTime").innerHTML = short;

    var long = (dayArray[day] + "/" + (month + 1) + "/" + year);
    document.getElementById("longTime").innerHTML = long;             


    setInterval(showTime, 1000);
}

function checkTime(t) {
    if (t < 10) {
        t = "0" + t;
    }
    return t;
}
