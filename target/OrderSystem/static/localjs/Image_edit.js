$(document).ready(function(){
	console.log("lallalallalal");
	//素材提交按钮
	$("#editFormId").on("click","#sss",doSaveImages);
});
function doSaveImages(){
	//获取表单的值赋值给params
	var params=getEditFormData();
	var url="doSaveImages.do";
	console.log(params);
	$.post(url,params,function(result){
		if(result.state==1){
			console.log("aaaaa");
			alert("保存成功");
		}else{
			alert(result.message);
		}
	});	
}

function getEditFormData(){
	var params={
		"imageSNo":$("#a").val(),
		"tittle":$("#b").val(),
		"url":$("#c").val(),
	}
	return params;
}
