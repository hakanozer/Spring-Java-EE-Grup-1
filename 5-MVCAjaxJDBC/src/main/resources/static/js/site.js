function fncAllUser() {
	$.ajax({
		type: "post",
		url: "/userAll",
		contentType: "application/json",
		success: function(response) {
			console.log(response.users)
			rowCreate(response.users)
		},
		error: function(err) {
			console.log(err);
		}
	});
}

function rowCreate( arr ) {
	var rows = ""
	arr.map( item => {
		rows += `<tr id="`+item.uid+`" >
				      <th scope="row">`+item.uid+`</th>
				      <td>`+item.name+`</td>
				      <td>`+item.mail+`</td>
				      <td> <img src="img/`+item.logo+`" width="48" /> </td>
					  <td> <button onclick="fncUserDelete(`+item.uid+`)" class="btn btn-danger btn-sm w-100"><i class="far fa-trash-alt"></i> Delete</button> </td>
			    </tr>` 
	})
	$("#rows").html(rows)
}

function fncUserDelete( uid ) {
	
	const params = {
		uid: uid
	}
	const url = "/userDelete"

		$.ajax({
		type: "post",
		url: url,
		data: JSON.stringify(params),
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			const status = response.status;
			if (status) {
				$("tr#"+uid).hide(500, function() {
					fncAllUser()
				})
				
			} else {
				alert("Insert Fail");
			}
		},
		error: function(err) {
			console.log(err);
		}
	});
	
}

fncAllUser()

$(document).ready(function() {

	function animate(obj) {
		const h = obj.innerHeight();
		obj.animate({
			//opacity: 0.25,
			height: 0,
		}, 200, function() {
			obj.animate({
				//opacity: 1, 
				height: h,
			}, 100)
		});
	}

	$("#btnSend").click(function() {

		const name = $("#name").val();
		const mail = $("#mail").val();
		const pass = $("#pass").val();
		const logo = $("#logo").val();

		if (name === "") {
			animate($("#name"))
		} else if (mail === "") {
			animate($("#mail"))
		} else if (pass === "") {
			animate($("#pass"))
		} else {

			const params = {
				name: name,
				mail: mail,
				pass: pass,
				logo: logo
			}

			const url = "/userInsert";

			$.ajax({
				type: "post",
				url: url,
				data: JSON.stringify(params),
				dataType: "json",
				contentType: "application/json",
				success: function(response) {
					const status = response.status;
					if (status) {
						fncAllUser()
						$("#name").val("");
						$("#mail").val("");
						$("#pass").val("");
						//$("#logo").val("");
						$("#name").focus();
					} else {
						alert("Insert Fail");
					}
				},
				error: function(err) {
					console.log(err);
				}
			});

		}

	})


});