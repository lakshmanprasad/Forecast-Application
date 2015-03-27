google.load("visualization", "1", {packages:["corechart"]});
google.setOnLoadCallback(drawCharts);
function drawCharts() {
  
  // BEGIN BAR CHART
  
  // create zero data so the bars will 'grow'
  var barZeroData = google.visualization.arrayToDataTable([
    ['ForeCast', 'Total Hours', 'Billable Hours'],
    ['October',  0,      0],
    ['November',  0,      0],
    ['December',  0,      0],
   /* ['Wed',  0,      0],
    ['Thu',  0,      0],
    ['Fri',  0,      0],
    ['Sat',  0,      0]*/
  ]);
  // actual bar chart data
  var barData = google.visualization.arrayToDataTable([
    ['ForeCast', 'Total Hours', 'Billable Hours'],
    ['October',  10,      35],
    ['November',  20,      45],
    ['December',  50,       40],
   /* ['Wed',  1030,      540],
    ['Thu',  1000,      480],
    ['Fri',  1170,      960],
    ['Sat',  660,       320]*/
  ]);

  // set bar chart options
  var barOptions = {
    focusTarget: 'category',
    backgroundColor: 'transparent',
    colors: ['cornflowerblue', 'tomato'],
    fontName: 'Open Sans',
    chartArea: {
      left: 50,
      top: 10,
      width: '100%',
      height: '60%'
    },
    bar: {
      groupWidth: '40%'
    },
    hAxis: {
      textStyle: {
        fontSize: 11
      }
    },
    vAxis: {
      minValue: 0,
      maxValue: 50,
      baselineColor: '#DDD',
      gridlines: {
        color: '#DDD',
        count: 4
      },
      textStyle: {
        fontSize: 11
      }
    },
    legend: {
      position: 'bottom',
      textStyle: {
        fontSize: 12
      }
    },
    animation: {
      duration: 1200,
      easing: 'out'
    }
  };
  // draw bar chart twice so it animates
  var barChart = new google.visualization.ColumnChart(document.getElementById('bar-chart'));
  barChart.draw(barZeroData, barOptions);
  barChart.draw(barData, barOptions);
  
   // draw bar chart twice so it animates
  var barChart = new google.visualization.ColumnChart(document.getElementById('bar-chart1'));
  barChart.draw(barZeroData, barOptions);
  barChart.draw(barData, barOptions);
     var barChart = new google.visualization.ColumnChart(document.getElementById('bar-chart2'));
  barChart.draw(barZeroData, barOptions);
  barChart.draw(barData, barOptions);
  
   // draw bar chart twice so it animates
  var barChart = new google.visualization.ColumnChart(document.getElementById('bar-chart3'));
  barChart.draw(barZeroData, barOptions);
  barChart.draw(barData, barOptions);
 }



 /*start*/
