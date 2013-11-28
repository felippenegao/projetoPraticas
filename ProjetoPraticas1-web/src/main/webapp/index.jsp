<%-- 
    Document   : login
    Created on : 28/11/2013, 17:01:08
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>

        <meta charset="utf-8">
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Patua+One'>
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="style.css" type="text/css">

    </head>

    <body>

        <div class="page-container">
            <form class='cadastro' action="AutAluno" method="post">
                <h1>Login</h1>
                <input type="text" name="login" class="name" placeholder="Login..." required="required">
                <input type="password" name="senha" class="name" placeholder="Senha..." required="required">
                <button type="submit">Entrar</button>
            </form>
        </div>

    </body>

</html>

