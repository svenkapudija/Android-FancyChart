Android-FancyChart
==================

FancyChart (line chart) with nice graphics

Usage
-----

Add view to your XML layout

    <com.svenkapudija.fancychart.FancyChart
        android:id="@+id/chart"
        android:layout_width="match_parent"
        android:layout_height="match_parent" >
    </com.svenkapudija.fancychart.FancyChart>
    
and then initialize it in your Activity

    FancyChart chart = (FancyChart) findViewById(R.id.chart);

    // First data set
    ChartData data = new ChartData(ChartData.LINE_COLOR_BLUE);
    int[] yValues = new int[]{0, 8, 9, 18, 35, 30, 33, 32, 46, 53, 50, 42};
    for(int i = 8; i <= 19; i++) {
      data.addPoint(i, yValues[i-8]);
      data.addXValue(i, i + ":00");
    }
    chart.addData(data);

    // Second data set
    ChartData data2 = new ChartData(ChartData.LINE_COLOR_RED);
    int[] yValues2 = new int[]{0, 5, 9, 23, 15, 35, 45, 50, 41, 45, 32, 24};
    for(int i = 8; i <= 19; i++) {
      data2.addPoint(i, yValues2[i-8]);
      data2.addXValue(i, i + ":00");
    }
    chart.addData(data2);

![FancyChart Example](http://i.imgur.com/qv50v17.png)

`addXValue` and `addYValue` are optional. If you don't add any, FancyChart will add ~10 points on X and Y axis automatically.

onPointClickListener
----

You can add listener when specific point is clicked

    chart.setOnPointClickListener(new FancyChartPointListener() {
        
    	@Override
    	public void onClick(Point point) {
    		Toast.makeText(MainActivity.this, "I clicked point " + point, Toast.LENGTH_LONG).show();
    	}
    });

Styling
----

Use `FancyChartStyle` if needed - there are all the colors, stroke widths etc. for visual fine-tuning. For example if you don't
want translucent background below lines set it to `false`

    FancyChartStyle style = chart.getChartStyle();
    style.setDrawBackgroundBelowLine(false);

How to build project on Android Studio
----
* Clone repository
* Open an existing Android Studio project
* Choose build.gradle file in reprository


Developed by
------------
* Sven Kapuđija

License
-------

    Copyright 2012 Sven Kapuđija
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
