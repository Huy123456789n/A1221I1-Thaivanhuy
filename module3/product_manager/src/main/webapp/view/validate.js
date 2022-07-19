let regex = /^[Nn][Aa]-\d{3}$/
let name = document.getElementById("name");
let validate = regex.test(name);
if (!validate){
alert("Error")
}