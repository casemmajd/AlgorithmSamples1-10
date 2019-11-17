function printDivisors(N){
    var D;
    console.log("The divisors of " + N + " are:");
    for  (D=1; D<=N; D++){
        if (N%D === 0) console.log(D);
    }
}

printDivisors(22);