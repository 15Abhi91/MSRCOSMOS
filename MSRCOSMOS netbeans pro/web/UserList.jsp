<%@page import="com.abhinay.model.userEditModel"%>
<%@page import="com.abhinay.controller.UserEditController"%>
<%@page import="servlet.UserEdit"%>
<%--<%@page import="com.abhinay.controller.UserEdit"%>--%>
<%@page import="com.abhinay.model.UserList"%>
<%@page import="com.abhinay.controller.UserListController"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>MSRCosMos</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>  

    </head>
    <body>

       <div class="container">
            <h2>User Table</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>                        
                        <th>Id</th>
                        <th>name</th>
                        <th>email</th>
                        <th>phone</th>
                        <th>Action</th>
                    </tr>
                </thead>
                             <%
                                    try {
//                                        List list = UserListController.UserRegisList();
                                        List list = UserListController.UserRegisList();
                                        for (int i = 0; i < list.size(); i++) {
                                        UserList t1 = (UserList) list.get(i);
             %>

                <tbody>
                    <tr>
                        <td><%=i+1%></td>
                        <td><%= t1.getF_name()%> <%= t1.getM_name()%> <%= t1.getL_name()%></td>
                        <td><%=t1.getMobile()%></td>
                        <td><%=t1.getEmail()%></td>
                        <td><a href="UserDelete?id=<%=t1.getId()%>" >Delete</a></td>
                        <td><a href="UserEdit?id=<%=t1.getId()%>">Edit</a></td>
                        
                    </tr>
                </tbody>
                <%}}
                    catch(Exception ex)
                     {
                     
                     }
                     
             %>
            </table>
             
        </div>
            

        <div class="container">
            <h2>User Registration</h2>
            <form class="form-horizontal" action="registerServlet" method="post">
                 <%
                                                try {
//                                        List list = userEditController.;
                                        List list = UserEditController.SelectUser();
                                        for (int i = 0; i < list.size(); i++) {
                                        userEditModel t1 = (userEditModel) list.get(i);
             %>

                <input type="hidden" class="form-control" id="id">
                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">First Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" placeholder="Enter First Name" value="<%=t1.getF_name()%>" name="Fname">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Middle Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" placeholder="Enter Middle Name" value="<%=t1.getM_name()%>" name="Mname">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Last Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" placeholder="Enter Last Name" name="Lname" value="<%=t1.getL_name()%>">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Email:</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="email" placeholder="Enter email" value="<%=t1.getEmail()%>" name="email">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">mobile No:</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control" id="email" placeholder="Enter mobile no" name="mobile" value="<%=t1.getMobile()%>">
                    </div>
                </div>
   

                <div class="form-group"> 
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                </div>
                <%}}
                    catch(Exception ex){
                                                     
                }%>
            </form>
        </div>

        
    </body>
</html>
