<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="myform" action="/hgc/test" method="post">
        <table cellpadding="0" cellspacing="0" border="0" class="tab_case_01"  >
             <tr>
                <td colspan="1" style="text-align: right;">
                  <input type="button" id="seache" value="测试跳转" onclick="subData();" class="button icon edit" />
                </td>
             </tr>
            </table>
        </div>
    </form>
    <script type="text/javascript">
	    function subData() {
	        $("#myform").attr("action","/hgc/test");
	       $("#myform").submit();
	   }
    </script>
</body>
</html>