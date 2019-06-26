<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	   pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>




<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Hello, Employee CRUD App!</title>
    <!-- <script src="js/api.js"></script> -->
    <script src="js/fetchapi.js"></script>
  </head>
  <body>
      <!-- <div class="container mt-5">
          <h3 id='error-message' style="color:red;font-size:1em"></h3>
    <table class="table table-dark table-striped" id='repo-list-table'>
        <thead>
          <tr>
            <th scope="col">URL</th>
            <th scope="col">Owner</th>
            <th scope="col">Issues</th>
            <th scope="col">Fork Count</th>
          </tr>
        </thead>
        <tbody>
         
        </tbody>
      </table>
    </div> -->

    <div class="container">

        
            <div class="jumbotron text-center mt-5">
                <h2>EMPLOYEE CRUD APP</h2>
            </div>

            <form method="POST" action="saveEmployee" modelAttribute="employee">
                    <div class="form-group">
                        <label for="exampleInputPassword1">ID</label>
                        <input type="text" class="form-control" id="ID" placeholder="ID" name="id">
                    </div>
                     <div class="form-group">
                        <label for="exampleInputPassword1">Name</label>
                        <input type="text" class="form-control" id="name" placeholder="Name" name="empName">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Email address</label>
                      <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" name="empEmail">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Contact No</label>
                      <input type="number" class="form-control" id="contactno" placeholder="Enter Contact No" name="empContactNo">
                    </div>
                   
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </form>
                  <small style ="color:green" id="status"></small>
                  
                  <small style ="color:red" id="errMessage"></small>
                  <table class="table table-dark mt-5">
                        <thead>
                          <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Name</th>
                            <th scope="col">Email Id</th>
                            <th scope="col">Contact No</th>
                            <th scope="col">Update</th>
                            <th scope="col">Delete</th>
                          </tr>
                        </thead>
                        <tbody id='table-body'>
                       <!-- This should fetch the students details form DB  and display here-->
                       <!-- used core tag forEach -->
                       <c:forEach items="${employeeList}" var="employee">
                       <tr>
                       <td>${employee.id}</td>
                        <td>${employee.empName}</td>
                         <td>${employee.empEmail}</td>
                          <td>${employee.empContactNo}</td>
                          <td></td>
                          <td><a href="deleteEmployee?id=${employee.id}"><i class="fa fa-trash" style ="color:red;font-size:1.2em"></i></a></td>
                       </tr>
                       </c:forEach>
                       
                        </tbody>
                      </table>

       

    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
  </body>
</html>
