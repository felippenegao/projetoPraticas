<%-- 
    Document   : cadastroAluno
    Created on : 27/11/2013, 10:26:46
    Author     : carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>Formulario para Cadastro de Aluno</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Patua+One'>
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="style.css" type="text/css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -class="subject"->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <form class='cadastro' action="CadastroAluno" method="post">
                <h1>Cadastro de Aluno</h1>
                <input type="text" name="nome" class="name" placeholder="Nome..." required="required">
                <input type="text" name="matricula" class="name" placeholder="Matricula..." required="required">
                <input type="text" name="email" class="name" placeholder="E-mail..." required="required">
                <input type="text" name=bairro" class="name" placeholder="Bairro..." required="required">
                <input type="text" name="rua" class="name" placeholder="Rua..." required="required">
                <input type="text" name="cidade" class="name" placeholder="Cidade..." required="required">
                <input type="text" name="estado" class="name" placeholder="Estado..." required="required">
                <input type="text" name="cep" class="name" placeholder="Cep..." required="required">
                <button type="submit">Salvar</button>
            </form>
        </div>

    </body>

</html>
