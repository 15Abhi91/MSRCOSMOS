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
            <h2>User Registration</h2>
            <form class="form-horizontal" action="registerServlet" method="post" name="myForm">

                <div class="form-group">
                    <label class="control-label col-sm-2" for="fname">First Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="fname" placeholder="Enter First Name" ng-model="Fname" name="Fname" required="">
                        <span ng-show="myForm.Fname.$touched && myForm.Fname.$invalid" style="color: #ff0000">The First name is required.</span>

                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Middle Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" placeholder="Enter Middle Name" name="Mname">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Last Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" placeholder="Enter Last Name" name="Lname">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Email:</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" ng-model="email" required="">
                        <span ng-show="myForm.email.$touched && myForm.email.$invalid" style="color: #ff0000">The Email is required.</span>

                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">mobile No:</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control" id="email" placeholder="Enter mobile no" name="mobile" ng-model="mobile" required="">
                        <span ng-show="myForm.mobile.$touched && myForm.mobile.$invalid" style="color: #ff0000">The mobile number is required.</span>

                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Password</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="email" placeholder="Enter password" name="pass" ng-model="pass" required="">
                        <span ng-show="myForm.pass.$touched && myForm.pass.$invalid" style="color: #ff0000">The password is required.</span>

                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Confirm password</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="email" placeholder="Enter repassword" name="cpass" ng-model="cpass" required="" wj-validation-error="chkPwd != thePwd ? 'Passwords don't match' : ''" />
                        <span ng-show="myForm.cpass.$touched && myForm.cpass.$invalid" style="color: #ff0000" >The confirm password is required.</span>

                    </div>
                </div>

                <div class="form-group"> 
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                                                    <a href="UserLogin.jsp" >Login</a>

                </div>

            </form>
        </div>

        
    </body>
</html>
