/**
 * 
 */

function validateContent(inp){
	var name = inp.name.value;
	var uid = inp.uid.value;
	var contactNo = inp.contactNo.value;
	var look = inp.look.value;
	
	if(name == ""|| uid == "" || contactNo == "" || look == ""){
		alert("Please fill all the boxes");
		return flase;
	}
	else{
		return true;
	}
	
	if(isNaN(contactNo)){
		alert("Please enter valid conatactNo");
		return false;
	}
	else{
		return true;
	}
	
	
}