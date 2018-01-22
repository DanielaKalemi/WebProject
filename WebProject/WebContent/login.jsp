<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login</title>
<style type="text/css">
h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:blu;
text-align: center;  }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: lightpink; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}
</style>
</head>
<body>
<form method="post" action="LoginServlet">
<div style="padding: 100px 0 0 250px;">
<div id="login-box">
<h2>Login</h2>
<div id="login-box-name" style="margin-top:20px;">Username:</div>
<div id="login-box-field" style="margin-top:20px;">
<input name="userName" class="form-login" title="Username" value="" size="30" maxlength="50" />
</div>
<div id="login-box-name">Password:</div>
<div id="login-box-field">
<input name="password" type="password" class="form-login" title="Password" value="" size="30" maxlength="48" />
</div>
<br />
<span class="login-box-options">
New User?  <a href="register.jsp" style="margin-left:30px;">Register Here</a>
</span>
<br />
<br />
<input style="margin-left:100px;" type="submit" value="Login" />
</div>
</div>
</form>
</body>
</html>