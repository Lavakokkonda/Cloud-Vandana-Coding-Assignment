function reverseWordsInSentence(sentence) {
  var reversedSentence = "";
  var word = "";
  for (var i = 0; i < sentence.length; i++) {
    if (sentence[i] !== " ") {
      word = sentence[i] + word;
    } else {
      reversedSentence += word + " ";
      word = "";
    }
  }
  reversedSentence += word;
  return reversedSentence;
}

var testSentence = "This is a sunny day";
var result = reverseWordsInSentence(testSentence);
console.log(result);
