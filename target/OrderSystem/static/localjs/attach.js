$(document).ready(function(){
	doGetObjects();
	$("#uploadFormId").on("click",".btn-upload",doUpload)
	$("#tbodyId").on("click",".btn-delete",delectObject)
});
function delectObject(){
	if(!confirm("您确定要删除吗"))return;
	var imagesno=$(this).parents("tr").data("imagesno");
	var filePath=$(this).parents("tr").data("filePath");
	var url = "attachment/dodelete.do";

	var params={"imagesno":imagesno,"filePath":filePath};
	$.post(url,params,function(result){
		if(result.state==1){
			doGetObjects();
		}else{
			alert(result.message);
		}
	});
}
/**
 * 分页查询
 */
function doGetObjects(){
	var url="attachment/dofind.do";
	var pageCurrent=$("#pageId").data("pageCurrent");
	if(!pageCurrent){
		pageCurrent=1;
	}
	var params={"pageCurrent":pageCurrent};
	$.post(url,params,function(result){
		if(result.state==1){
			setTableBodyRows(result.data.list);
			setPagination(result.data.pageObject);
		}else{
			alert(result.message);
		}
	});
}
/**
 * 动态添加td,将取到数据动态添加
 * @param list
 */
function setTableBodyRows(list){
	var tBody=$("#tbodyId");
	tBody.empty();
	for(var i in list){
		var tr=$("<tr></tr>");
		var str = "https://www.alicehertz.com:8443/bgimages/"+list[i].filePath
		console.log(str);
		tr.data("imagesno",list[i].imagesno);
		tr.data("filePath",list[i].filePath);
		tr.append("<td>"+list[i].title+"</td>");
		tr.append("<td>"+list[i].athtype+"</td>");
		tr.append('<td id="ss"><img src='+str+' width="50"/></td>');
		tr.append('<td><input type="button" class="btn btn-danger btn-delete" value="删除"></td>');
		tBody.append(tr);
	}
}
/**
 * 下一页
 * 上一页
 * 首页，和尾页
 */
$(document).ready(function(){
	console.log("00002")
	$("#pageId").on("click",".next,.last,.pre,.first",jumpToPage)
})
function setPagination(pageObject){
	//1.初始化页面总页数
	console.log("00003")
	//1.1首先获得pageCount类选择器代表的对象
	//1.2在对象内部写入总页数
	$(".pageCount").html("总页数("+pageObject.pageCount+")");
	//2.初始化页面当前页
	$(".pageCurrent").html("当前页("+pageObject.pageCurrent+")");
	//2.数据绑定(当前也，和总页数)，就是将下一个数据绑定法哦对应的对象上
	$("#pageId").data("pageCurrent",pageObject.pageCurrent);
	$("#pageId").data("pageCount",pageObject.pageCount);
}
console.log("0000")
function jumpToPage(){
	console.log("00010")
	//获得点击的对象上的类选择器
	var classz = $(this).attr("class")
	
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
function doUpload(){
	var s = $("#d").val();
	console.log(s);
	
	var d =$("d").val();
	if(d==""){
		alert("红包类型不能为空");
		return;
	}
	var k = $("#a").val();
	if(k==""){
		alert("图像标题不能为空");
		return;
	}
	var p = $("#b").val();
	if(p==""){
		alert("背景图像主题不能为空");
		return;
	}
	
	//异步提交表单
	//ajaxSubnit在jquery.form.js文件中
	$("#uploadFormId").ajaxSubmit({
		url:"attachment/doUpload.do",
		type:"post",
		success:function(result){
			if(result.state==1){
				doGetObjects()
				alert("上传成功");
			}else{
				alert("上传失败");
			}	
		}
	});
}