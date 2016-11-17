<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Rutas - Asignaci&oacute;n</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=0">
<spring:url value="/js/jquery.min.js" var="jquery" />
<spring:url value="/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/css/common.css" var="commonCss" />
<spring:url value="/js/common.js" var="commonJs" />

<script src="${jquery}"></script>
<link href="${bootstrapCss}" rel="stylesheet" />
<script src="${bootstrapJs}"></script>
<link href="${commonCss}" rel="stylesheet" />
<script src="${commonJs}"></script>
</head>
<body>
  <div class="container">
    <div class="form">
      <form action="/datos" method="post">
        <div class="row">
          <div class="col-xs-12">
            <div class="form-group">
              <label>Datos</label>
              <textarea name="datos" class="form-control"></textarea>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-xs-12">
            <input type="submit" class="btn btn-default">
          </div>
        </div>
      </form>
    </div>
    <c:forEach items="${datos}" var="dato">
      <div class="row">
        <div class="col-xs-12">${dato}</div>
      </div>
    </c:forEach>
  </div>
</body>
</html>