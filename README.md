# SpringBootHibernate
╭─shonparth@Sachins-MacBook-Pro.local ~/IdeaProjects/hibernate  
╰─➤  curl -d '{"studentId":2,"studentName":"pravin surve","city":"BHOR"}' -H 'Content-type: application/json' -X PUT localhost:8080/students/addstudent
{"timestamp":"2021-03-03T20:37:28.252+00:00","status":405,"error":"Method Not Allowed","message":"","path":"/students/addstudent"}%                             ╭─shonparth@Sachins-MacBook-Pro.local ~/IdeaProjects/hibernate  
╰─➤  curl -d '{"studentId":2,"studentName":"pravin surve","city":"BHOR"}' -H 'Content-type: application/json' -X PUT localhost:8080/students/updstudent
╭─shonparth@Sachins-MacBook-Pro.local ~/IdeaProjects/hibernate  
╰─➤  curl localhost:8080/students                                                                                                                      
[{"studentId":2,"studentName":"pravin surve","city":"BHOR"},{"studentId":1,"studentName":"sachin surve","city":"PUNE"},{"studentId":3,"studentName":"Deepak Veer","city":"PUNE1"}]%                                                                                                                                             ╭─shonparth@Sachins-MacBook-Pro.local ~/IdeaProjects/hibernate  
╰─➤  curl -d '{"studentId":2,"studentName":"pravin surve","city":"BHOR"}' -H 'Content-type: application/json' -X PUT localhost:8080/students/updstudent


