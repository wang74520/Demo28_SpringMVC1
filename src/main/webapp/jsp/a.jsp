<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/14
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button id="btn">点我接收返回值</button>
<button id="btn2">json格式传一个对象</button>
<button id="btn3">json格式传多个对象</button>
<p id="msg"></p>
<p id="list"></p>

<script>
    $(function () {
        var url = "http://localhost:8080/Demo28_SpringMVC";
        $("#btn").click(function () {
            /*$.ajax({
                url:url+"/getStu",
                type:"post",
                data:{
                    "name":"jerry",
                    "age":"30"
                },
                success:function (data) {
                    console.log(data);
                    $("#msg").html(data.id+" "+data.name+" "+data.gender)
                }
            })*/

            $.ajax({
                url:url+"/getList",
                type:"post",
                data:{
                    "name":"jerry",
                    "age":"30"
                },
                success:function (data) {
                    console.log(data);
                    for (var i = 0; i <data.length ; i++) {
                        var p =  $("<p></p>");
                        p.html(data[i].id+" "+data[i].name+" "+data[i].gender);
                        $("#list").append(p);
                    }
                }
            })
        });

        $("#btn2").click(function () {
            var json = {};
            json.id = "123";
            json.name = "jerry";
            json.gender = "女";
            $.ajax({
                url:url+"/getJson",
                type:"post",
                data:{
                    "json":JSON.stringify(json)
                },
                success:function (data) {
                }
            })
        });

        $("#btn3").click(function () {
            var jsonArr = [];
            var json1 = {};
            json1.id = "101";
            json1.name = "tom1";
            json1.gender = "女";
            var json2 = {};
            json2.id = "102";
            json2.name = "tom2";
            json2.gender = "女";
            jsonArr.push(json1);
            jsonArr.push(json2);
            $.ajax({
                url:url+"/getJsonArr",
                type:"post",
                data:{
                    "json":JSON.stringify(jsonArr)
                },
                success:function (data) {
                }
            })
        })

    })
</script>
</body>
</html>
