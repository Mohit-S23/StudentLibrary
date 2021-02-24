# StudentLibrary

## Table of contents

1. ###### [Technology Used](https://github.com/Mohit-S23/StudentLibrary/blob/master/README.md#techonology-used)

2. ###### [Functionalities](https://github.com/Mohit-S23/StudentLibrary/blob/master/README.md#functionalities-1)

3. ###### [Curl Commands](https://github.com/Mohit-S23/StudentLibrary/blob/master/README.md#curl-commands-1)

4. ###### [EER Diagram](https://github.com/Mohit-S23/StudentLibrary/blob/master/README.md#eer-diagram-1)

## Techonology Used

- ###### Java

- ###### Spring Boot

- ###### Hibernate

- ###### RESTful APIS


## Functionalities

###### Student

	• Create Student
		○ Create Card
	• Delete Student
		○ Deactivate Card
	• Update Student Details
		
		
###### Author

	• Create Author
	• Update Author details


###### Book

	• Create Book
	• Get Books
		○ All books written by a particular author
			§ All books
			§ Only Available books
		○ All books for a particular genre
			§ All books
			§ Only Available books
		○ All books for a particular genre and written by a particular author
			§ All books
			§ Only Available books

    
###### Transaction

	• Issue a book
		○ Check whether book is Available or not + Is Limit reached or not
		○ Mark book as Unavailable
		○ Link the book with card
		○ Add transaction entry in the table
	• Return a book
		○ Mark book as available
		○ Unlink the book with card
		○ Calculate fine if any
		○ Add transaction entry in the table




## Curl Commands

###### To Create Student:
	
	curl -XPOST "localhost:70/createStudent" -H "Content-type: application/json" -d '{"name": "<Name>", "emailId": "<Email-Id>", "age": <Age>, "country": "<Country>"}' -v


###### To Update Student:

	curl -XPUT "localhost:70/updateStudent" -H "Content-type: application/json" -d '{"id": <id>, "name": "<Name>", "age":<Age>, "country": "<Country>", "emailId": "<Email-Id>"}' -v


###### To Delete Student:

	curl -XDELETE "localhost:70/deleteStudent?id=1" -v


###### To Add Author:
	
	curl -XPOST "localhost:70/createAuthor" -H "Content-type: application/json" -d '{"name": "<Name>", "age": <Age>, "country": "<Country>", "email": "<Email-Id>"}' -v
	

###### To Add Book:

	curl -XPOST "localhost:70/createBook" -H "Content-type: application/json" -d '{"name": "<Name>", "genre": "<GENRE>", "available": <boolean>, "author": {"id": <id>}}' -v


###### To Issue Book:
	
	curl -XPOST "localhost:70/issueBook?cardId=1&bookId=1" -v
	
	
###### To Return Book:
	
	curl -XPOST "localhost:70/returnBook?cardId=1&bookId=1" -v
	
	
## EER Diagram
  
  ![EER Diagram](https://user-images.githubusercontent.com/47516842/108990331-b1920c80-76bc-11eb-9ad0-b56f093d01b7.png)

