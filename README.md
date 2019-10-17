"# EmployeeApi" 
` mvn clean install ` will execute the unit test cases and print the request and reponses in the console

# Inputs

-------- Department ------
{
"id": 1,
"name": "IT Department"
}

---- Full time employee ---
{
  "dateOfJoining": "12/07/2019",
  "employee": {
  "address": "3/63A, salem",
  "department": {
  "id": 1,
  "name": "IT Department"
},
  "employeeNumber": "23434",
  "name": "Prabu"
},
 "insuranceNumber": 34978678
}

--- vendor employee ---
{
  "employee":{
    "name": "Kumar",
    "employeeNumber": "23434",
    "address": "3/63A, Theni",
    "department": {
      "id": 1,
      "name": "IT Department"
    }
  },

  "vendorName": "Babin Consultancy",
  "vendorPeriod": 567
}