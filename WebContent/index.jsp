<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<title>PizzaMover!</title>
<h1>Welcome to the Grand Circus Pizza Mover!</h1>
<h4>The application for the people mover.</h4>


<c:if test="${message != null}">
    <p><i>${message}</i></p>
</c:if>

<form action="DummyServlet" method="post">
    <label class="pad_top">Station:</label>
    <select name="stationID" value="Grand Circus">
    	<option value="GrandCircus">Grand Circus Park</option>
    	<option value="TimesSquare">Times Square</option>
    </select>
    <select name="pointOfInterest" value="Pizza">
    	<option value="Pizza">Pizza</option>
    	<option value="Bars">Bars</option>
    	<option value="Casinos">Casinos</option>
    	<option value="Strip CLubs">Strip Clubs</option>
    </select>
    <label>&nbsp;</label>
    <input type="submit" value="Let's find some fun!" class="margin_left">
</form>

