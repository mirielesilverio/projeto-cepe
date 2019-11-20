/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.graficos;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import javax.swing.Renderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RectangleInsets;
import org.jfree.util.TableOrder;

public class GraficoDeSetores {
    double[] dados = new double[2];
    int w=0;
     public GraficoDeSetores() throws IOException{
    {
        try{
            dados[0]= 70;
            dados[1]=100 - dados[0];
            DefaultPieDataset result = new DefaultPieDataset();
	
                    result.setValue("Presença" , dados[0]);
                    result.setValue("Faltas", dados[1]);
                
                JFreeChart graf = ChartFactory.createPieChart("Presença", // título / gráfico 
				result, // dados 
				true, // include lenda
				true, false);
                PiePlot plot = (PiePlot) graf.getPlot();
                plot.setSectionPaint("Presença", Color.BLACK);
                plot.setSectionPaint("Faltas" , Color.WHITE);
                graf.setBorderPaint(Color.WHITE);
                graf.getPlot().setBackgroundPaint(Color.WHITE);
                OutputStream png = new FileOutputStream("Setor.png");
                ChartUtilities.writeChartAsPNG(png, graf, 600, 
                        400);
            }
           
        catch(Exception  e){
            
        }
     }
}
}
