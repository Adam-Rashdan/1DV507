package XChart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.PieChart;



public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String path = "/Users/Adam/Desktop/LNU/histo.txt";
	   
	    int i =0;
		int outOfRange = 0;
	    int [] list = new int [10] ;
		File file = new File(path);
		System.out.println("Reading integers from the file: " + path);
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		while (scan.hasNextInt()) {
			int number = scan.nextInt();
		
			if (number < 101 || number >= 0) { 
			
			    i = ((number - 1) / 10);
				list[i]++;
			}
			
			else
			outOfRange++;
			
			
		}
		
		//for(int j = 0 ; j < list.length ; j++ )
			//System.out.println(list[j]);
		
	  CategoryChart chart = new CategoryChartBuilder().width(1200).height(600).build();

	    chart.addSeries("Number of integers",Arrays.asList(new String[] {"1 - 10", "11 - 20", "21 - 30", "31 - 40", 
	    		"41 - 50", "51 - 60", "61 - 70", "71 - 80", "81 - 90", "91 - 100", "Out Of Range"}), Arrays.asList(new Integer[] { list[0], list[1], list[2],
	    				list[3], list[4], list[5], list[6], list[7], list[8], list[9], outOfRange }));
	    
	    new SwingWrapper(chart).displayChart();
	   

	}

}
