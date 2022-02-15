function validate(frm){
	
document.getElementById("nameErr").innerHTML="";
document.getElementById("ageErr").innerHTML="";

//read form data
var name = frm.pname.value;
var age = frm.page.value;

// change the value of hidden box to "yes"

 frm.vflag.value="yes";

alert("Client side validation....");

//write client side validation business logic

if(name==""){
document.getElementById("nameErr").innerHTML="Person name is mandatory";
document.getElementById("nameErr").style.color="red";
frm.pname.focus();
return false;
}

if(age==""){
	
	document.getElementById("ageErr").innerHTML="Person age is mandatory";
	document.getElementById("ageErr").style.color="red";
	frm.page.focus();
	return false;
}
else{
  if(isNaN(age)){
   document.getElementById("ageErr").innerHTML="person age must numeric value";
   document.getElementById("ageErr").style.color="red";
   frm.page.focus();
   frm.page.value="";
   return  false;
 }
 return true;
}
}


