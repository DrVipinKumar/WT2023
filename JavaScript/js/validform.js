
function printError(errorID,errorValue){
    document.getElementById(errorID).innerHTML=errorValue
  
}
function checkValue(){
    var nameErr=mailErr=mobileErr=langErr=subErr=true
    var name=document.regform.name.value
    var mail=document.regform.mail.value
    var mobile=document.regform.mobile.value
    var lang=document.getElementsByName("lang")
    var sub =document.regform.sub.value

    if(sub==="Select"){
        printError("subErr","*Please select your subject")
  } else{
    printError("subErr","")
    subErr=false
  }
    var langChoice=[] 
    console.log(langChoice)
    if(lang.length>0)
    {
        for(var i=0;i<lang.length;i++){
            if (lang[i].checked===true){
                langChoice.push(lang[i].value)
                langErr=false
                printError("langErr","") 
               } 
        }  
          
    } 
    if(langChoice.length===0){
        printError("langErr","Select your language choice")
        langErr=true
    }
    
    if(mobile===""){
        printError("mobileErr","*Please enter mobile number")
  } else{
     var regex=/^[6-9]\d{9}$/
     if (regex.test(mobile)===false){
      printError("mobileErr","*Please enter valid mobile")
     } else {
      printError("mobileErr","")
      mobileErr=false
     }

  }
    if(mail===""){
        printError("mailErr","*Please enter mail")
  } else{
     var regex=/^\S+@\S+\.\S+$/
     if (regex.test(mail)===false){
      printError("mailErr","*Please enter valid mail")
     } else {
      printError("mailErr","")
      nameErr=false
     }

  }
    if(name===""){
          printError("nameErr","*Please enter name")
    } else{
       var regex=/^[a-zA-Z\s]+$/
       if (regex.test(name)===false){
        printError("nameErr","*Please enter valid name")
       } else {
        printError("nameErr","")
        mailErr=false
       }

    }
    if ((nameErr||mailErr||mobileErr||langErr)===true){
        return false
    } else {
        var data;
        data ="You enter name="+name+"\n";
        data+="You enter email="+mail+"\n";
        data+="You enter mobile="+mobile+"\n";
        data+="Your lang choice are="+langChoice.join(",")+"\n";
        data+="Your subject is="+sub+"\n";
        alert(data);
        return true
    }
}