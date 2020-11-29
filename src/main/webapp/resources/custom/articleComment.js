/**
 * Insert Comment Script
 */

$("#commentSave")
		.on(
				"click",
				function() {
					var memberId = $("#memberId").val();
					if (!memberId) {
						if (confirm("로그인이 필요한 기능입니다. 로그인 하시겠습니까?")) {
							location.href = "login";
						}
					} else {
						var boardId = $("#boardId").val();
						var commentContent = $("#comentContent").val();

						if (!commentContent) {
							alert("내용을 입력해 주세요");
						} else {

							var boardReply = {
								"boardId" : boardId,
								"memberId" : memberId,
								"content" : commentContent
							}

							$
									.ajax({
										method : 'post',
										url : 'insertArticleComment',
										data : JSON.stringify(boardReply),
										dataType : 'JSON',
										contentType : 'application/json; charset=UTF-8',
										success : function(response) {
											$("#comentContent").val("");

											$("#replyCount").html(
													response["repliesCount"]);

											var tag = "";
											if (response["replies"].length < 3) {
												$
														.each(
																response["replies"],
																function(index,
																		value) {
																	tag += '<div>';
																	tag += '<div class="d-flex flex-row comment-row m-t-0">';
																	tag += '<div class="comment-text w-100">';
																	tag += '<div class="row">';
																	tag += '<div class="col-8">';
																	tag += '<h6 class="font-medium">'
																			+ response["replies"][index].memberId
																			+ '</h6>';
																	tag += '</div>';
																	tag += '<div class="col-4">';
																	tag += '<i class="fa fa-spin fa-star" style="color: #ffe83f;"></i>&nbsp;&nbsp; 4점';
																	tag += '</div>';
																	tag += '</div>';
																	tag += '<span class="m-b-15 d-block">'
																			+ response["replies"][index].content
																			+ '</span>';
																	tag += '<div class="comment-footer">';
																	tag += '<i class="fas fa-heart" style="color: #f77497;"></i>15 <span class="text-muted float-right">'
																			+ response["replies"][index].updatedDate
																			+ '</span>';
																	tag += '<span class="action-icons">';
																	tag += '<a href="javascript:void(0)"><i class="ti-pencil-alt"></i></a>';
																	tag += '<a href="javascript:void(0)"><i class="ti-trash"></i></a>';
																	tag += '<a href="javascript:void(0)"><i class="ti-heart"></i></a>';
																	tag += '</span>';
																	tag += '</div>';
																	tag += '</div>';
																	tag += '</div>';
																	tag += '</div>';
																});
											} else {

												tag += '<div class="owl-carousel">';
												$
														.each(
																response["replies"],
																function(index,
																		value) {
																	tag += '<div>';
																	tag += '<div class="d-flex flex-row comment-row m-t-0">';
																	tag += '<div class="comment-text w-100">';
																	tag += '<div class="row">';
																	tag += '<div class="col-8">';
																	tag += '<h6 class="font-medium">'
																			+ response["replies"][index].memberId
																			+ '</h6>';
																	tag += '</div>';
																	tag += '<div class="col-4">';
																	tag += '<i class="fa fa-spin fa-star" style="color: #ffe83f;"></i>&nbsp;&nbsp; 4점';
																	tag += '</div>';
																	tag += '</div>';
																	tag += '<span class="m-b-15 d-block">'
																			+ response["replies"][index].content
																			+ '</span>';
																	tag += '<div class="comment-footer">';
																	tag += '<i class="fas fa-heart" style="color: #f77497;"></i>15 <span class="text-muted float-right">'
																			+ response["replies"][index].updatedDate
																			+ '</span>';
																	tag += '<span class="action-icons">';
																	tag += '<a href="javascript:void(0)"><i class="ti-pencil-alt"></i></a>';
																	tag += '<a href="javascript:void(0)"><i class="ti-trash"></i></a>';
																	tag += '<a href="javascript:void(0)"><i class="ti-heart"></i></a>';
																	tag += '</span>';
																	tag += '</div>';
																	tag += '</div>';
																	tag += '</div>';
																	tag += '</div>';
																});
												tag += '</div>';
											}

											$("#replysRefrain").html(tag);
										},
										error : function() {

										}
									});
						}
					}
				});