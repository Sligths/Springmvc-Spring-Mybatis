$(function() { 
    $("#register_btn").click(function() {  
        $("#register_form").css("display", "block");  
        $("#login_form").css("display", "none");  
    });  
    $("#back_btn").click(function() {  
        $("#register_form").css("display", "none");  
        $("#login_form").css("display", "block");  
    });  
}); 
$.ajax({
	cache: true,
	type: "POST",
	url:"/login",
	data:$('#login_form').serialize(),// 你的formid
	async: false,
	error: function(request) {
		alert("Connection error");
	},
	success: function(data) {
		alert("login yes");
	}
});