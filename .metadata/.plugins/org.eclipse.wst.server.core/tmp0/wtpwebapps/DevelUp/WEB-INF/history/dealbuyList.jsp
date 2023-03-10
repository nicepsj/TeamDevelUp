<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="/ongo/common/css/dealhistory.css">

<style type="text/css">
#invoice {
	
}

.invoice {
	position: relative;
	background-color: #FFF;
	padding: 15px
}

.invoice header {
	padding: 10px 0;
	margin-bottom: 20px;
	border-bottom: 1px solid #3989c6
}

.invoice .company-details {
	text-align: right
}

.invoice .company-details .name {
	margin-top: 0;
	margin-bottom: 0
}

.invoice .contacts {
	margin-bottom: 20px
}

.invoice .invoice-to {
	text-align: left
}

.invoice .invoice-to .to {
	margin-top: 0;
	margin-bottom: 0
}

.invoice .invoice-details {
	text-align: right
}

.invoice .invoice-details .invoice-id {
	margin-top: 0;
	color: #3989c6
}

.invoice main .thanks {
	margin-top: -100px;
	font-size: 2em;
	margin-bottom: 50px
}

.invoice main .notices {
	padding-left: 6px;
	border-left: 6px solid #3989c6
}

.invoice main .notices .notice {
	font-size: 1.2em
}

.invoice table {
	width: 100%;
	border-collapse: collapse;
	border-spacing: 0;
	margin-bottom: 20px
}

.invoice table td, .invoice table th {
	padding: 15px;
}

.invoice table th {
	white-space: nowrap;
	font-weight: 400;
	font-size: 16px
}

.invoice table td h3 {
	margin: 0;
	font-weight: 400;
	color: #3989c6;
	font-size: 1.2em
}

.invoice table .qty, .invoice table .total, .invoice table .unit {
	text-align: center;
}

.product id {
	text-align: center;
}

.invoice table .no {
	color: #fff;
	font-size: 1.6em;
	background: #3989c6
}

.invoice table .unit {
	background: #ddd
}

.invoice table .total {
	background: #3989c6;
	color: #fff
}

.invoice table tbody tr:last-child td {
	border: none
}

.invoice table tfoot td {
	background: 0 0;
	border-bottom: none;
	white-space: nowrap;
	text-align: right;
	padding: 10px 20px;
	font-size: 1.2em;
	border-top: 1px solid #aaa
}

.invoice table tfoot tr:first-child td {
	border-top: none
}

.invoice table tfoot tr:last-child td {
	color: #3989c6;
	font-size: 1.4em;
	border-top: 1px solid #3989c6
}

.invoice table tfoot tr td:first-child {
	border: none
}

.invoice footer {
	width: 100%;
	text-align: center;
	color: #777;
	border-top: 1px solid #aaa;
	padding: 8px 0
}

@media print {
	.invoice {
		font-size: 11px !important;
		overflow: hidden !important
	}
	.invoice footer {
		position: absolute;
		bottom: 10px;
		page-break-after: always
	}
	.invoice>div:last-child {
		page-break-before: always
	}
}
}
</style>

<script type="text/javascript"> 

/* ??????????????? ????????? ??????  */
var type = "${product_state}" 
$(document).ready(function () {
	$("#product_state").val(type).attr("selected","selected");
	$("#product_state").change(function () {
		location.href="/ongo/history/dealbuyList?member_id=${user.member_id}&product_state="+encodeURI($(this).val());
	})
})

	function fnHome() {
		location.href = '/ongo/index.do';
	}

	function fnLogin() {
		location.href = '/ongo/payment/paymentlist';
	}

</script>
</head>
<body>

		<!-- content -->
	<div id="contents">
		<!-- title -->
		<div class="container">
			<div class="sub_top">
				<h1>????????????</h1><span>??????????????? ???????????? ??????????????? ??? ???????????? ??? ???????????? ????????? ??? ????????????.</span>
			</div>
			<!-- //title -->

		<!-- ?????? ????????? ?????? -->
			<div class="tableDefault table-vertical mb-5 mt-5">
				<table class="filter-tb">
					<tbody>
						 <tr>
							<th>????????? ??????
							</th>
							<td>
								<div class="form-inline">
									<div class="select ">
										<select class="form-select" id="product_state"
											name="product_state" title="???????????? ??????">
											<option value="all"  >??????</option>
											<option value="?????????">????????????</option>
											<option value="???????????????" >???????????????</option>
											<option value="????????????" >????????????</option>
										</select>
									</div>
								</div>
							</td>
						</tr> 
					<!-- 	<tr>
							<th rowspan="2">?????????<br class="visible-xs"> ??????
							</th>
						</tr>
						<tr>
							<td>
								<div class="visible-lg visible-md">
									<label class="radio-inline"> <input type="radio"
										name="type_radio" value="all" checked=""> ????????????
									</label> <label class="radio-inline"> <input type="radio"
										name="type_radio" value="month"> ????????????
									</label> <label class="radio-inline"> <input type="radio"
										name="type_radio" value="range-7d"> ???????????????
									</label> <label class="radio-inline"> <input type="radio"
										name="type_radio" value="range-1m"> ??????1??????
									</label> <label class="radio-inline"> <input type="radio"
										name="type_radio" value="range-3m"> ??????3??????
									</label>
								</div>
							</td>
						</tr>
						
						<tr>
							<th>????????? ??????</th>
							<td>
								<div class="form-inline">
									<div class="form-group">
										<select name="field" id="field" class="form-control dpInblock">
											<option value="SG" selected="">????????????</option>
											<option value="SA">????????????</option>
											<option value="SB">????????????</option>
											<option value="SC">?????????</option>
											<option value="SH">????????????</option>
										</select>
									</div>
									<p class="visible-xs mb5"></p>
									<div class="form-group">
										<input type="text" class="form-control inputSearchText"
											name="qry" id="qry" value="">
									</div>
								</div>
							</td>
						</tr> -->
					</tbody>
				</table>
			</div>
			<!-- ?????? ????????? ??? -->

				<!-- list ?????? -->

				<div class="table-responsive px-2">
					<div class="sellList">
						<table class="table table-borderless table-hover">
							<thead>
								<tr>
									<th class="table-header" width="5%" scope="col">??????</th>
									<th class="table-header" width="5%" scope="col">??????</th>
									<!-- <th class="table-header" width="10%" scope="col">????????????</th> -->
									<th class="table-header-title" width="28%" scope="col">??? ???</th>
									<th class="table-header" width="*%" scope="col">??????</th>
									<th class="table-header" width="*%" scope="col">?????????</th>
									<th class="table-header" width="*%" scope="col">?????????</th>
									<th class="table-header" width="*%" scope="col">????????????</th>
									<th class="table-header" width="*%" scope="col">????????????</th>
								</tr>
							</thead>
							<tbody class="text-center">
							
							<c:forEach var="buylist" items="${buylist }">
							
									<tr>
										<td>${buylist.deal_number }</td>
										<td>${buylist.dealType }</td>
									<!-- 	<td><img alt="" src="https://i.imgur.com/5Aqgz7o.jpg"
											width="50" height="50"></td> -->
										<td>${buylist.board_title }</td>
										<td><fmt:formatNumber value="${buylist.product_price }"
												pattern="#,###???" /></td>
										
										<td>${buylist.member_id }</td>
										<td>${buylist.write_date }</td>
										<c:choose>
											<c:when test="${buylist.product_state=='?????????' }">
												<td>???????????????</td>
											</c:when>
											<c:when test="${buylist.product_state=='???????????????' }">
												<td>???????????????</td>
											</c:when>
												<c:when test="${buylist.product_state=='????????????' }">
												<td>????????????</td>
											</c:when>
										</c:choose>
										<!-- payment??? board_number??? buylist??? deal_number??? ?????? ?????? -->
										<!-- ${pay.pay_state} == '????????????' -->
										<c:choose>
										<c:when test="${buylist.product_state=='???????????????' }">
											<td><a
												href="/ongo/payment/payInfoList?member_id=${user.member_id}&board_number=${buylist.deal_number }">
													<button type='button'
														class="btn btn-info paybtn text-white">????????????</button>
											</a></td>
										</c:when>
										<c:when test="${buylist.product_state=='????????????' }">
											<td>????????????</td>
										</c:when>
										<c:otherwise>
												<td> - </td>
											</c:otherwise>
										</c:choose>
									</tr>
								
							</c:forEach>
							
							</tbody>
						</table>



						<!-- ?????????????????? ?????? -->
						<!-- <div class="pagination">
							<input type="hidden" id="PAGE" name="PAGE" value="1"> <input
								type="hidden" id="CNT_PER_PAGE" name="CNT_PER_PAGE" value="10">
							<input type="hidden" id="START_INDEX" name="START_INDEX" value="">
							<input type="hidden" id="END_INDEX" name="END_INDEX" value="">
							<li class="page-item arr"><a class="page-link"
								href="javascript:fnMovePage(1, fnSearch, 'pagination');"
								aria-label="Previous"> <span class="visually-hidden">????????????</span>
									<span aria-hidden="true"><i
										class="las la-angle-double-left"></i></span>
							</a></li>
							<li class="page-item active"><a class="page-link"
								href="javascript:fnMovePage(1, fnSearch, 'pagination');">1</a></li>
							<li class="page-item arr"><a class="page-link"
								href="javascript:fnMovePage(1, fnSearch, 'pagination');"
								aria-label="NextEnd"> <span class="visually-hidden">????????????</span>
									<span aria-hidden="true"><i
										class="las la-angle-double-right"></i></span>
							</a></li>
						</div> -->
						<!-- //?????????????????? ???  -->

					</div>
				</div>
				
				<!-- list ???   -->

		</div>
		<!-- ???????????? ???  -->
	</div>
	<!-- ????????? ??? -->

<!-- <!-- 
payment modal
	<div class="modal fade" id="paymentModal" tabindex="-1"
		aria-labelledby="Modal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<div class="modal-tit">
						<h2 class="h3 ms-4">?????????</h2>
					</div>
					<div class="login_container container">
			?????? ??? ??????
			<h2 class="visually-hidden">??????</h2>
			//?????? ??? ??????
			<div class="payment_wrap">
				<div id="invoice">
					<div class="invoice overflow-auto">
						<div style="">
							<header>
								<div class="row">
									<div class="col-md-9">
										<div>???????????? :2042-122123</div>
										<div>???????????? :23.01.06</div>

									</div>
									<div class="col-md-3"></div>
								</div>
							</header>
							<main>
								<div class="row">
									<div class="col-md-2">
										<img
											src="https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcR6NbjHprfrQQnPnli8KD6Twz0f83FurA6s2trUKBBnwEfcci59kOrPEV2tGgAG1T0Qr879b6pPOw&amp;usqp=CAc"
											width="auto," height="100px/">
									</div>
									<div class="col-md-7">
										<h3 class="invoice-id">A??? ??????????????????.</h3>
									</div>

									<table border="0" cellspacing="0" cellpadding="0"
										class="table table-borderless table-hover">
										<thead>
											<tr>

												<th class="table-header" scope="col">??????</th>
												<th class="table-header-title" scope="col">??? ???</th>
												<th class="table-header" scope="col">????????????</th>
												<th class="table-header" scope="col">?????????</th>
												<th class="table-header" scope="col">?????????</th>


											</tr>
										</thead>
										<tbody class="text-center">

											<tr>
												<td>??????</td>

												<td>????????? ?????? ????????????</td>
												<td>0???</td>

												<td>id</td>
												<td>2022-01-01</td>
											</tr>

										</tbody>
										<tfoot>

											<tr>
												<td></td>
											</tr>
											<tr>
												<td colspan="3"></td>
												<td colspan="">????????????</td>
												<td>30,000???</td>

											</tr>
										</tfoot>
									</table>

								</div>
							</main>

						</div>
						DO NOT DELETE THIS div. IT is responsible for showing footer always at the bottom
						<div></div>
					</div>
				</div>

			</div>
			<div class="btn-area">
				<button type="button" class="btn btn-primary btn-large me-md-2"
					onclick="fnLogin()">??????</button>
				<button type="button" class="btn btn-outline-secondary btn-large"
					onclick="fnHome()">??????</button>
			</div>
		</div>
					????????????
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close">
						<i class="las la-times"></i>
					</button>
					//????????????
				</div>
			</div>
		</div>
	</div>
	//user info modal

 --> 

		
		
		

<!-- Footer -->
<jsp:include page="../include/footer.jsp"/>
<!-- //Footer -->
</body>
</html>