$("#back").on("click",function(){
	window.location.href = "list";
});
$(document).ready(function(){
	console.log("222222");
	//注册保存按钮
	$("#queryFormId").on("click","#sss",doQueryObjects);
});
function doQueryObjects(){
	//获取表单的值赋值给params
	var params=getEditFormData();
	var url="dosaveSystem.do";
	console.log(params);
	$.post(url,params,function(result){
		if(result.state==1){
			console.log("333333");
			alert("保存成功");
		}else{
			alert(result.message);
		}
	});
}
function getEditFormData(){
	var params={
			"fundPool":$("#n").val(),
			"benefit":$("#o").val(),
			"confId":$("#p").val(),
			"appState":$("#m").val(),
			"minWithdraw":$("#g").val(),
			"minAmount":$("#h").val(),
			"maxSubPkg":$("#a").val(),
			"sentPkgRate":$("#b").val(),
			"sentInterval":$("#c").val(),
			"withdrawRate":$("#d").val(),
			"withdrawInterval":$("#e").val(),
			"snatchInterval":$("#f").val(),
			"secret":$("#k").val(),
			"appid":$("#l").val(),
			"payAccount":$("#i").val(),
			"payPwd":$("#j").val(),
	};
	 return params;
}
function doSaveObjects(){
	
}
