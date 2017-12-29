<form action="listClass" method="get" >
内容<input type="text" name="file" values="${Myfile!}">
<input type="submit" value="查询"/>
</form>
<table>
<tr><th>编号</th><th>标题</th><th>内容</th></tr>
<#list classList as tmp>
<tr><td>${tmp.id}</td><td>${tmp.claname}</td><td>${tmp.file}</td></tr>
</#list>
</table>