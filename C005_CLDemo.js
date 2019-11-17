console.log("You entered " + (process.argv.length-2) + " command-line arguments");

if (process.argv.length > 2) {
  console.log("They were:");
  for (i=0; i<process.argv.length-2; i++) {
    console.log("   " + process.argv[i+2]);
  }
}
