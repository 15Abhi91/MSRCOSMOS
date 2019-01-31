<html ng-app="app">

<head>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.7/angular.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.min.css" />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-messages/1.5.7/angular-messages.min.js"></script>
</head>

<body ng-controller="">
  <form name="add_user_form">
    <div class="col-md-12">
      <div class="form-group" ng-class="{ 'has-error' : add_user_form.user_password.$dirty && add_user_form.user_password.$invalid }">
        <p class="help-text">Enter password</p>
        <input type="password" class="form-control" id="user_password" name="user_password" placeholder="password" required ng-model="user.user_password" password-verify="{{user.confirm_password}}">
        <div class="help-block" ng-messages="add_user_form.user_password.$error" ng-if="add_user_form.user_password.$dirty">
          <p ng-message="required">This field is required</p>
          <p ng-message="minlength">This field is too short</p>
          <p ng-message="maxlength">This field is too long</p>
          <p ng-message="required">This field is required</p>
          <p ng-message="passwordVerify">No match!</p>
        </div>
      </div>
      <div class="form-group" ng-class="{ 'has-error' : add_user_form.confirm_password.$dirty && add_user_form.confirm_password.$invalid }">
        <p class="help-text">Enter matching password</p>
        <input class="form-control" id="confirm_password" ng-model="user.confirm_password" name="confirm_password" type="password" placeholder="confirm password" required password-verify="{{user.user_password}}">
        <div class="help-block" ng-messages="add_user_form.confirm_password.$error" ng-if="add_user_form.confirm_password.$dirty">
          <p ng-message="required">This field is required</p>
          <p ng-message="minlength">This field is too short</p>
          <p ng-message="maxlength">This field is too long</p>
          <p ng-message="required">This field is required</p>
          <p ng-message="passwordVerify">No match!</p>
        </div>
      </div>
    </div>
  </form>
</body>

</html>
