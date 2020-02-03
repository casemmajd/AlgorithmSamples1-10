#!/usr/bin/env pythong36

import http.client
import json

conn = http.client.HTTPSConnection("jsonplaceholder.typicode.com")
headers = {"Content-type": "application/json"}
conn.request("GET", "/todos/1", None, headers)
response = conn.getresponse()
print(response.status, response.reason)

data = json.dumps(json.loads(response.read()), indent=2)
print(data)
conn.close()

