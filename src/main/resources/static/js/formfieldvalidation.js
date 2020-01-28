//DOM elements
let email_field_reg = document.getElementById("email-field-reg");
//Regex
var emailPattern = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
//Event Listeners
email_field_reg.addEventListener('keyup', keyUpValidation(email_field_reg, emailPattern));

//functions
function keyUpValidation (element, regex){
    console.log("element getarged " + element);
    if(element.value.length > 0){
        element.classList.add('validate-getinput');
    } else if (regex.test(element.value)){
        element.classList.add('validate-ok');
    } else{
        element.classList.remove('validate-getinput','validate-ok');
    }
}

function blurValidation(element, regex){
    if(!regex.test(element.value)){
        element.classList.add('validate-error')
    }
}