<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/include.jsp"  %>
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<meta name="description" content="automation" />
<meta name="keywords" content="automation" />
<meta name="viewport" content="width=device-width, initial-scale=1">

<%-- disables device zooming --%>
<%-- <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<link rel="shortcut icon" href="<c:url value="/resources/images/favicon.ico" />" type="image/x-icon" /> --%>

<title>${ pageTitle }<c:if test="${ not empty pageTitle }"> : </c:if>Automation</title>

<!-- jquery -->
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/bower_components/jquery-ui/themes/base/jquery-ui.min.css" />" />
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/bower_components/jquery-ui/jquery-ui.structure.min.css" />" />
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/bower_components/jquery-ui/themes/cupertino/jquery-ui.min.css" />" />
<script type="text/javascript" src="<c:url value="/resources/bower_components/jquery/dist/jquery.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/bower_components/jquery-ui/jquery-ui.min.js"/>"></script>

<!-- bootstrap -->
<script type="text/javascript" src="<c:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"/>"></script>

<!-- data tables -->
<script type="text/javascript" src="<c:url value="/resources/datatable/media/js/jquery.dataTables.js" />"></script>
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/datatable/media/css/jquery.dataTables.min.css" />" />

<!-- responsive data tables -->
<script type="text/javascript" src="<c:url value="/resources/datatable/extensions/Responsive/js/dataTables.responsive.js" />"></script>
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/datatable/extensions/Responsive/css/dataTables.responsive.css" />" />

<!-- Load c3.css -->
<link href="<c:url value="/resources/bower_components/c3/c3.min.css"/>" rel="stylesheet" type="text/css">
<!--  /automation/src/main/webapp/resources/d3/js/d3.min.js -->

<!-- Load d3.js and c3.js -->
<script src="<c:url value="/resources/bower_components/d3/d3.min.js" />"></script>
<script src="<c:url value="/resources/bower_components/c3/c3.min.js" />"></script>


<!-- bootstrap -->
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.css"/>" />

<!-- application css and js -->
<link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/css/layout.css"/>" />
<script type="text/javascript" src="<c:url value="/resources/js/utils.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/messager.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/init.js" />"></script>

  <script src="<c:url value="/resources/bower_components/angular/angular.js"/>"></script>
  <script type="text/javascript" src="<c:url value="/resources/bower_components/angular-resource/angular-resource.min.js" />"></script>
  
  <script src="<c:url value="/resources/js/controllers.js"/>"></script>
  
  <link type="text/css" media="screen" rel="stylesheet" href="<c:url value="/resources/bower_components/angular-ui-grid/ui-grid.css"/>" />
  <script src="<c:url value="/resources/bower_components/angular-ui-grid/ui-grid.min.js"/>"></script>


<!--[if lte IE 8]>
<script type="text/javascript" src="<c:url value="/resources/js/json2.js" />"></script>
<![endif]-->

<script type="text/javascript">
	$(function(){
		intializePage(); // see resources/js/init.js 
	});
</script>
