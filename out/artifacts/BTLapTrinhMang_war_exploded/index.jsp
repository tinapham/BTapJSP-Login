<%--
  Created by IntelliJ IDEA.
  User: TiNa
  Date: 09/05/2017
  Time: 8:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Tina Pham | Login</title>
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
  <section id="main-content">
    <div id="carousel-example-generic" class="carousel intro slide">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active">1</li>
        <li data-target="#carousel-example-generic" data-slide-to="1">2</li>
        <li data-target="#carousel-example-generic" data-slide-to="2">3</li>
      </ol>
      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
        <!-- First slide -->
        <div class="item active" style="background-image:url(img/P1020176.jpg?q=40&w=1650&sharp=30)">
          <div class="carousel-caption">
            <h2 data-animation="animated bounceInDown">
              Welcome to
            </h2>
            <h1 data-animation="animated bounceInUp">
              Tina's page
            </h1>
          </div>
        </div>
        <!-- /.item -->
        <!-- Second slide -->
        <div class="item" style="background-image:url(img/Life-of-Pix-free-stock-food-fruits-healthy-Slike.jpg)">
          <div class="carousel-caption">
            <h2 data-animation="animated zoomInLeft">
              Welcome to </h2>
            <h1 data-animation="animated zoomInRight">
              Tina's page
            </h1>
          </div>
        </div>
        <!-- /.item -->
        <!-- Third slide -->
        <div class="item" style="background-image:url(img/HNCK4585.jpg?q=40&w=1650&sharp=30)">
          <div class="carousel-caption">
            <h2 data-animation="animated bounceInLeft">
              Welcome to</h2>
            <h1 data-animation="animated bounceInRight">
              Tina's page
            </h1>
          </div>
        </div>
        <!-- /.item -->
      </div>
      <!-- /.carousel-inner -->
      <!-- Controls (currently displayed none from style.css)-->
      <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </section>
  <section id="about">
    <div class="container">
      <div class="row">
        <div class="col-lg-10 col-lg-offset-1 text-center">
          <form action="CheckLoginServlet" method="post">
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
                <div class="panel-body">
                  <input class="btn btn-primary btn-lg" type="submit" value="Login"/>
                  <input class="btn btn-primary btn-lg" type="reset" value="Reset"/>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>
  <footer id="footer" class="footer panel-footer">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 copy-right">
          <ul class="social mb-60 wow fadeInUp" data-wow-duration="1.5s">
            <li>
              <a class="facebook-icon" target="_blank" href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
            </li>
            <li>
              <a class="tumblr-icon" target="_blank" href="https://www.tumblr.com/"><i class="fa fa-tumblr"></i></a>
            </li>
            <li>
              <a class="google-icon" target="_blank" href="https://google.com/"><i class="fa fa-google"></i></a>
            </li>
            <li>
              <p>Copyright @ by Tina</p>
            </li>
          </ul>

        </div>
      </div>
    </div>
  </footer>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/isotope.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>
