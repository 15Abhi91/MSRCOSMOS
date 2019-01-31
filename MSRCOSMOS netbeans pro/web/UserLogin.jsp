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
<body ng-app="">

<div class="container">
  <h2>User Login</h2>
  <form action="loginServlet" method="post" name="myForm">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" ng-model="email" required>
      <span ng-show="myForm.email.$touched && myForm.email.$invalid">The Email is required.</span>

    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required="">
    </div>
    <button type="submit" class="btn btn-default">Login</button>
    <a href="index.jsp">Register...</a>
  </form>
</div>

</body>
</html>
