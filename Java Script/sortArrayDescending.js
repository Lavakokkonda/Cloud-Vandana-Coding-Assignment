var array = [5, 2, 8, 1, 4];
for (var i = 0; i < array.length; i++) {
  for (var j = i + 1; j < array.length; j++) {
    if (array[i] < array[j]) {
      var temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
}
console.log(array); 
