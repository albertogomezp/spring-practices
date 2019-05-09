	alert("holita");
function getResponse(msg,username){
	if(typeof msg !== 'undefined'){
		
		if(typeof username !== 'undefined'){
			alert(msg+" Welcome "+username);
		}
		else{
			alert(msg);
		}
	}
	
};
function getResponseNoUser(msg){
	if(typeof msg !== 'undefined'){
		alert(msg);
	}
	
};
function wro(){
	alert("holita");
	
};
function callJqueryAjax(action){
	  //var action = $('#name').val();
	  $.ajax(
	    {
	      url     : '/IvAl/Core',
	      method     : 'POST',
	      data     : {action: action},
	      success    : function(resultText){ $('#resultServlet').html(resultText); console.log("ok") },
	      error : function(jqXHR, exception){
	        console.log('Error occured!!');
	      }
	    }
	    );
	  };
	  function callJqueryAjaxLogin(action, user,password){
		  //var action = $('#name').val();
		  $.ajax(
		    {
		      url     : '/IvAl/Core',
		      method     : 'POST',
		      data     : {action: action, "username" : user, "password":password},
		      success    : function(resultText){ $('#resultServlet').html(resultText); console.log("ok") },
		      error : function(jqXHR, exception){
		        console.log('Error occured!!');
		      }
		    }
		    );
		  };	  
  function testcon(){
	  //var action = $('#name').val();
	  //var action = "test";
	  $.ajax(
	    {
	      url     : '/core',
	      method     : 'POST',
	      data     : {action: "test"},
	      success    : function(resultText){ $('#resultServlet').html(resultText); console.log("ok")},
	      error : function(jqXHR, exception){
	        console.log('Error occured!!');
	      }
	    }
	    );
	  };