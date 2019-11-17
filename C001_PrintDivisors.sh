#!/bin/bash -
# Note you can omit #!/bin/sh as this should not spawn an extra shell. 

printDivisors() 
{
  N=$1;
  echo "The divisors of" $N "are:"
  for (( D = 1; D <= $N; D++ ))
    do
      if ((  ($N % D) == 0 ));
      then echo $D;
      fi
    done
}

printDivisors 22;