

function reverse(str) {
    let copy; 
    let i;       
                 
    copy = "";   
    for ( i = str.length - 1;  i >= 0;  i-- ) {
      copy = copy + str.charAt(i);  
    }
    return copy;
}

console.log(reverse("Hello World"));
var word = "radar";
if (word === reverse(word)) {
  console.log("The word \"" + word + "\" is a  palindrome!");
}
