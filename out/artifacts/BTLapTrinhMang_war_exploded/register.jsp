<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Tina Pham | Register</title>
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/animate.css">
  <link rel="stylesheet" href="css/header.css">
  <link rel="stylesheet" href="css/footer.css">
  <link rel="stylesheet" href="css/home.css">
  <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<div id="wrapper">
  <div class="top"></div>
  <header id="header">
    <div class="container">
      <nav class="navbar">
        <div class="container">
          <div class="navbar-header">
            <div class="logo">
              <a href="" class="navbar-brand">
                <img class="img-responsive" src="img/logo.png" alt="logo"/>
                <div class="logo-text">
                  <p class="logo-text-top">Tina Pham</p>
                  <p class="logo-text-bottom">Welcome to my private page</p>
                </div>
              </a>
            </div>
          </div>
          <div id="navbar" class="nav navbar-nav navbar-right navbar-collapse collapse">
          </div>
        </div>
      </nav>
    </div>
  </header>

  <div class="bg-white"></div>
  <div class="bg-gray"></div>
  <section id="register">
    <section id="about">
      <div class="container">
        <div class="row">
          <div class="col-lg-10 col-lg-offset-1 text-center">
            <form action="RegisterServlet" method="post">
              <div class="col-xs-12 padding-none">
                <div class="panel panel-success">
                  <div class="panel-heading">
                    Username
                  </div>
                  <div class="panel-body">
                    <input type="text" name="username"/>
                  </div>
                </div>
              </div>
              <div class="col-xs-12 padding-none">
                <div class="panel panel-danger">
                  <div class="panel-heading">
                    Password
                  </div>
                  <div class="panel-body">
                    <input type="password" name="password"/>
                  </div>
                </div>
              </div>
              <div class="col-xs-12 padding-none">
                <div class="panel panel-success">
                  <div class="panel-heading">
                    Fullname
                  </div>
                  <div class="panel-body">
                    <input type="text" name="fullname"/>
                  </div>
                </div>
              </div>
              <div class="col-xs-12 padding-none">
                <div class="panel panel-danger">
                  <div class="panel-heading">
                    Roles
                  </div>
                  <div class="panel-body">
                    <input type="text" name="roles"/>
                  </div>
                </div>
              </div>
              <div class="col-xs-12 padding-none">
                <div class="panel panel-success">
                  <div class="panel-body">
                    <input class="btn btn-primary btn-lg" type="submit" value="Register"/>
                    <input class="btn btn-primary btn-lg" type="reset" value="Reset"/>
                  </div>
                </div>
              </div>
              <%
                String temp = (String) request.getAttribute("fail");
                if(!"".equals(temp)) out.print(temp);
              %>
            </form>
          </div>
        </div>
      </div>
    </section>
  </section>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/isotope.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>





