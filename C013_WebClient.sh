#!/bin/bash -


num1=todos
num2=1
result=

result=$(curl -X GET -s --write-out %{http_code} -H "Accept:application/json" -H "Content-Type:application/xml" https://jsonplaceholder.typicode.com/$num1/$num2)
echo $result | echo $(grep -oE "[^}]+$") "OK"
echo $result | echo $(cut -d'}' -f1) "}" | python -mjson.tool
exit
