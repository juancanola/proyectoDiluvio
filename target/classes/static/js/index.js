


$(document).ready(function() {
	
	$("#btndnsattack").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/dnsattack",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});
	
	
	
	
	
	
	
	
	
	
	
	
	$("#btnsynflood").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/synflood",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});
	
	
	
	
	$("#btnudpflood").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/udpflood",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});
	
	
	
$("#btnntpattack").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/ntpattack",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});


	
	
	
	$("#btnicmpflood").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/icmpflood",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});
	
	
	
	
	$("#btntcpflood").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/tcpflood",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});
	
	
	
	
	
	$("#btnslowhttp").click(function(e) {
		
		var ipaddress = $('#inputip').val(); 
	
	
		
		if(ipaddress==""){
			alert('No hay IP');
			return;
		}
		
		 $.ajax({
			    type: "POST",
			    dataType: 'text',
	            url: "/diluvio/slowhttp",
	            data: {    ip : ipaddress},
	            success: function(data) {
	            	console.log(data);
	            	alert(data);
	            },
	            error: function(data) {
	            	console.log(data);
	            }
	        }); 
		 
	});

	 
	});
