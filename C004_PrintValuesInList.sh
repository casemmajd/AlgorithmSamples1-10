
function printValuesInList() {
    declare -a arr=("${@}")
    declare -i len=${#arr[@]}
    printf "["
    for ((n = 0; n < len; n++)) do
        echo -en " ${arr[$n]}"   # option "-en" removed line break
    done
    echo " ]"
}


array=(1 2 3 4 5)

printValuesInList ${array[@]}