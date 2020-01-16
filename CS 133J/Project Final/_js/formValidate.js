function validateHomeForm() {
    var name = document.forms["registration"]["name"];
    var email = document.forms["registration"]["email"];
    var phone = document.forms["registration"]["phone"];

    if (name.value == "") {
        window.alert("Enter your name");
        name.focus();
        return false;
    }
    else if (email.value == "") {
        window.alert("Enter your email");
        email.focus();
        return false;
    }
    else if (phone.value == "") {
        window.alert("Enter your phone number");
        phone.focus();
        return false;
    }
    else {
        return true;
    }
}

function validateAboutForm() {
    // Not Needed
}