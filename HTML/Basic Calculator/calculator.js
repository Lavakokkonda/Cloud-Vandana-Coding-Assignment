
function display(value) {
  const resultField = document.getElementById("result");
  if (resultField.value === "0") {
    resultField.value = value;
  } else {
    resultField.value += value;
  }
}

function clearScreen() {
  const resultField = document.getElementById("result");
  resultField.value = "0";
}

function calculate() {
  const resultField = document.getElementById("result");
  try {
    resultField.value = eval(resultField.value);
  } catch (error) {
    resultField.value = "Error";
  }
}
