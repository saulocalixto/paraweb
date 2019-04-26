var alert = document.getElementById("seuImc");
var sexoInput = document.getElementById("inputState");

alert.style.display = "none";

function calcularIMC(){
  var formulario = document.getElementById("formulario");
  
  var kilos = +formulario.kilos.value;
  var centimetros = +formulario.centimetros.value;
  var sexo = sexoInput.value;

  var altura = (centimetros)/100;
  var imc = kilos / (altura * altura);
  alert.style.display = "block";
  if(imc) {
    alert.innerText = "Seu IMC é: " + imc.toFixed(2);
  } else {
      alert.innerText = "Dados inválidos";
  }

}