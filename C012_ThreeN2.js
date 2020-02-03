var sprintf = require("sprintf-js").sprintf, vsprintf = require("sprintf-js").vsprintf;

function nextN(currentN) {
  if (currentN % 2 == 1)
    return 3 * currentN + 1;
  else
    return currentN / 2;
}  
   

function print3NSequence(startingValue) {
  N = startingValue;   
  count = 1;           
   
  console.log("The 3N+1 sequence starting from " + N);
  console.log();
  process.stdout.write(sprintf("%8d", N));   
  onLine = 1; 
   
  while (N > 1) {
    N = nextN(N);  
    count++; 
    if (onLine == 5) {  
      console.log();  
      onLine = 0;      
    }
    process.stdout.write(sprintf("%8d", N));   
    onLine++;   
  }
   
  console.log();  
  console.log();  
  console.log("There were " + count + " terms in the sequence.");
}  



console.log("This program will print out 3N+1 sequences");
console.log("for starting values that you specify.");
console.log();

var stdin = process.openStdin();
console.log("Enter a starting value;");
process.stdout.write("To end the program, enter 0: ");
stdin.addListener("data", function(d) {
  K = d.toString().trim();
  if (K <= 0) {process.exit(0)}
  if (K > 0) {
    print3NSequence(K);
    console.log("Enter a starting value;");
    process.stdout.write("To end the program, enter 0: ");
  }
});
