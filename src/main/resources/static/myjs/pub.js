
var success = "0000";//成功状态

function showResult(data){
	if(data.status == success){
		$.messager.show({
			title:'交易成功',
			msg:data.msg,
			timeout:5000,
			showType:'slide'
		});
		return true;
	}else {
		$.messager.alert("交易失败", "交易失败："+data.msg, "error");
		return false;
	}
	
}

function showResult(data , isShowSuccess){
	if( data.status == success){
		if(isShowSuccess ){
			$.messager.show({
				title:'交易成功',
				msg:data.msg,
				timeout:5000,
				showType:'slide'
			});
		}
		return true;
	}else {
		$.messager.alert("交易失败", "交易失败："+data.msg, "error");
		return false;
	}
	
}