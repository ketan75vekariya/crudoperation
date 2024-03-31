
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Add New Todo</h1>
	<hr>
	<pre>${errorMessage}</pre>
	<div class="row">
		<div class="col-4">
			<form:form method="POST" modelAttribute="todo">
				<fieldset class="mb-3">
					<form:label path="description">Description</form:label>
					<form:input type="text" path="description" class="form-control"
						required="required" />
					<form:errors path="description" cssClass="text-warning" />
				</fieldset>
				<fieldset class="mb-3">
					<form:label path="targetDate">Target Date</form:label>
					<form:input type="text" path="targetDate" class="form-control"
						required="required" />
					<form:errors path="targetDate" cssClass="text-warning" />
				</fieldset>
				<br />
				<fieldset>
					<form:input type="hidden" path="id" />
				</fieldset>
				<fieldset>
					<form:input type="hidden" path="done" />
				</fieldset>
				<input type="submit" class="btn btn-success">
			</form:form>
		</div>
	</div>
</div>



<%@ include file="common/footer.jspf"%>
<script type="text/javascript">
	$('#targetDate').datepicker({
		format : 'yyyy-mm-dd',
		startDate : '-3d'
	});
</script>