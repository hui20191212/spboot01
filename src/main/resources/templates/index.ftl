<!DOCTYPE html>
<html>
<head>
<#include "common/head.ftl">
</head>
<style>
    ol > li {
        font-size: 30px;
        font-weight: bold;
    }
</style>
<script>
     $(function () {
         $('#btn_add').click(function () {
             $.ajax({
                 url:'json',
                 data:{},
                 dataType:'json',
                 type:'post',
                 async:false,
                 success:function (data) {
                     console.log(data)
                 },error:function (x,y,z) {

                 }
             });
         });
     });
</script>
<body style="">
<h1 align="center" style="color: red;">hello</h1>
<button id="btn_add">点击</button>
<#--<img src="${ctx}/images/a.jpg">-->
<p>
    <ol>
        <li>取值</li>
<p>
    <ul>
        <li>
            1.1提供默认值
        </li>
<p>welcome ${name!'未知'} to niubi</p>
<li>
    1.2if_exists用来打印东西
</li>
<p>welcome ${name!'未知'} to niubi</p>
<li>
    1.3??是判断对象是否为空
</li>
<p><#if name??>
    ${name}
    <#else>
    不存在
</#if></p>

</ul>
</p>
<li>条件</li>
<p>
    <#if gender==0>
        女
    <#elseif gender==1>
		男
    <#else>
		保密
    </#if>
</p>
<li>循环</li>
<p>
     <#list lst as item>
         姓名：${item.textname} , 编号：${item.id}
     </#list>
</p>
<li>include</li>

${ctx}
<li>局部变量(assign)/全局变量(global)</li>
</ol>
</p>
</body>
</html>