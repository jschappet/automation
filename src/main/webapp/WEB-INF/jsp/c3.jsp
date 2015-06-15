<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<h2>Weight Chart Last 30 Measures</h2>
<h3>Weight and Activity</h3>
<div id="chart"></div>
<h3>BP and Pulse</h3>
<div id="vitals"></div>

<script type="text/javascript" >

var size = 250;

var vitals = c3.generate({
	 size: {
	        height: size
	        
	    },
   bindto: '#vitals',
   data: {
       x: 'x',
       url: 'vitals/c3/last30/',
       mimeType: 'json',
       axes: {
           systolic: 'y',
           diastolic: 'y',
           pulse: 'y2'
       }
       
   },
	axis: {
		y2: {
	        show: true
	    },
	    x: {
	        type: 'timeseries',
	        tick: {
	            format: '%Y-%m-%d'
	       }
	   	
	    }
	}
});



var vitals = c3.generate({
	 size: {
	        height: size
	        
	    },
   bindto: '#chart',
   data: {
       x: 'monthYear',
       url: 'summarytable/',
       mimeType: 'json',
       
       axes: {
    	   avgActivity: 'y2',
    	   minActivity: 'y2',
    	   maxActivity: 'y2',
    	   avgWeight: 'y',
    	   minWeight: 'y',
    	   maxWeight: 'y'
       },
       keys: {
         x: 'monthYear', // it's possible to specify 'x' when category axis
         value: [
				'maxActivity',
                'avgActivity',
                'minActivity',
                 
                'maxWeight',
                'avgWeight',
                'minWeight'
               ],
     }
 },

	axis: {
		y2: {
	        show: true
	    },
	    x: {
	        type: 'category',
	        tick: {
	            format: '%Y-%m'
	       }
	   	
	    }
	}
});
</script>