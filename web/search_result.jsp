<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.Admin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Tina Pham | Search</title>
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
  <br>
  <section id="search">
    <div class="container">
      <div class="row">
        <div class="col-xs-12 text-center">
          <h2>Welcome <%=session.getAttribute("username")%></h2>
          <%
            ArrayList<Admin> list = (ArrayList<Admin>)request.getAttribute("searchArray");
            if(list.size()==0) {
          %>
          <h1 class="text-center">No result is match</h1>
          <%
            return;
          } else {
          %>
          <table id="example1" class="table table-bordered table-hover">
            <thead class="box-header">
              <tr>
                <td>Username</td>
                <td>Fullname</td>
                <td>Role</td>
                <td></td>
              </tr>
            </thead>
            <tbody>
              <% for (int i = 0; i < list.size(); i++){ %>
              <tr>
                <td><%= list.get(i).getUsername()%></td>
                <td><%= list.get(i).getFullname()%></td>
                <td><%= list.get(i).getRoles()%></td>
                <td>
                  <a href="update.jsp?id=<%=list.get(i).getUsername()%>">Update</a> |
                  <a href="UpdateServlet?id=<%=list.get(i).getUsername()%>">Delete</a>
                </td>
              </tr>
              <% } }%>
            </tbody>
          </table>
        </div>
        <!-- /.box-body -->
      </div>
      <!-- /.box -->
    </div>
    <!-- /.col -->
  </section>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/isotope.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>




