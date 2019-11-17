function print3NSequence(N) {
  count = 1;
  console.log("The 3N+1 sequence starting from " + N);
  console.log();
  console.log(N);  // print initial term of sequence

  while (N > 1) {
    if (N % 2 == 1) 
      N = 3 * N + 1;
    else
      N = N / 2;
    count++;   
    console.log(N);  
  }

  console.log();
  console.log("There were " + count + " terms in the sequence.");
}

print3NSequence(17);

