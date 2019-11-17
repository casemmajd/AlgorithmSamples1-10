function printRow(ch, N){
  for (i=0; i<=N; i++) {
    process.stdout.write(ch);
  }
}

async function printRowsFromString(str){
  for (let i=0; i<str.length; i++) {
    await printRow(str.charAt(i), 25);
  }
}

printRowsFromString("Casem");
