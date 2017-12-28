$(document).ready(function(){
	doGetObjects();
	$("#queryFormId").on("click",".btn-search",doQueryObject)
//	$("#tbodyId").on("click",".btn-delete",DeleteObject)
});
//function DeleteObject(){
//	if(!confirm("您确定要删除吗"))return;
//   var uid=$(this).parents("tr").data("id");
//   var url="delectUser.do";
//   var params={"uid":uid};
//   $.post(url,params,function(result){
//	   if(result.state==1){
//		   doGetObjects();
//	   }else{
//		   alert("删除成功");
//	   }
//   });
//
//}
function doQueryObject(){
	$("#pageId").data("pageCurrent",1);
	doGetObjects();
}

function getQueryFormDate(){
	var params={
	"nickName":$("#nickName").val(),
	"openId":$("#openId").val()
	};
	return params;

}
function doGetObjects(){
	var url="dofindObject.do";
	var params=getQueryFormDate();
	var pageCurrent = $("#pageId").data("pageCurrent");
	if(!pageCurrent){
		pageCurrent=1;
	}
	params.pageCurrent=pageCurrent;
	$.post(url,params,function(result){
		if(result.state==1){
			setTableBodyRows(result.data.list);
			setPagination(result.data.pageObject);
		}else{
			alert(result.message);
		}
	});
}
function setTableBodyRows(result){
	var tBody=$("#tbodyId");
	tBody.empty();
	
	for(var i in result){
		var tr=$("<tr></tr>");
		tr.data("id",result[i].uid);
		var str = result[i].avatarurl;
		
//		var firstTd='<td><input type="checkbox" name="checkName" value="[id]"></td>'
		tr.append('<td>'+result[i].nickName+'</td>');
		tr.append('<td>'+result[i].balance+'</td>');
		tr.append('<td><img src='+str+' width="30" height="30"/></td>');
		tr.append("<td><a href='getUserPalyByopenid.do?pageCurrent=1&openId="+result[i].openid+"'>"+result[i].openid+"</a></td>");
		tr.append('<td>'+result[i].createtime+'</td>');
		tr.append('<td><input type="button" class="btn btn-danger btn-delete" value="删除"><input type="button" class="btn btn-default btn-update" value="备用"></td>');
		tBody.append(tr);
		
	}
	
}
$(document).ready(function(){
	$("#pageId").on("click",".next,.last,.pre,.first",jumpToPage)
});
function setPagination(pageObject){
	//1.初始化页面总页数
	console.log("00003");
	//1.1首先获得pageCount类选择器代表的对象
	//1.2在对象内部写入总页数
	$(".pageCount").html("总页数("+pageObject.pageCount+")");
	//2.初始化页面当前页
	$(".pageCurrent").html("当前页("+pageObject.pageCurrent+")");
	//2.数据绑定(当前也，和总页数)，就是将下一个数据绑定法哦对应的对象上
	$("#pageId").data("pageCurrent",pageObject.pageCurrent);
	$("#pageId").data("pageCount",pageObject.pageCount);
}
console.log("0000");
function jumpToPage(){
	console.log("00010");
	//获得点击的对象上的类选择器
	var classz = $(this).attr("class");
	
	//1)需要获得当前页
	var pageCurrent = $("#pageId").data("pageCurrent");
	//2)需要获得总页数
	var pageCount = $("#pageId").data("pageCount");
	//点击next要跳转到下一页
	if(classz == "next" && pageCurrent<pageCount){
		pageCurrent++;
	}
	if(classz == "last"){
		pageCurrent = pageCount;
	}
	//点击pre要跳转到上一页
	if(classz =="pre" && pageCurrent>1){
		pageCurrent--;
	}
	//点击first要跳转到首页
	if(classz == "first"){
		pageCurrent=1;
	}
	//重新绑定pageCurrent的值(当前页的值)
	$("#pageId").data("pageCurrent",pageCurrent);
	//重新执行查询
	doGetObjects();
}











