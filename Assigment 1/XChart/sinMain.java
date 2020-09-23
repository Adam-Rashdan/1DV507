package XChart;

import java.util.ArrayList;
import java.util.List;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

public class sinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYChart chart = new XYChartBuilder().width(1000).height(800).build();
		
		 List <Double> xData = new ArrayList<>();
		 List <Double> yData = new ArrayList<>();
		
		 for(double x = 0 ; x <= 2* Math.PI; x += Math.PI/1000){
				yData.add((1 + x / Math.PI) * Math.cos(x) * Math.cos(40 * x));
				xData.add(x);
			}
		 chart.addSeries("Chart", xData, yData);
		 new SwingWrapper<>(chart).displayChart();

	}

}
