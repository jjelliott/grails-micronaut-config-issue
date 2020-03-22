<%--
  Created by IntelliJ IDEA.
  User: jesse
  Date: 2020-03-22
  Time: 12:12 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <meta name="layout" content="main">
        <title></title>
    </head>

    <body>
        <g:each in="${blogPostList}" var="post">
            ${post.id} - ${post.title}<br/>
        </g:each>
    </body>
</html>
