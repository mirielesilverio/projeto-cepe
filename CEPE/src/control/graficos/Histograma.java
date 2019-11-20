/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.graficos;

import control.connection.dataAccess.AvalicaoAccess;
import control.connection.dataAccess.NotaAccess;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Renderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;



    
    
    
    
    
public class Histograma {
    private static NotaAccess notaAc;
    private static AvalicaoAccess avaliacaoAc;
    List<Float> dados = new ArrayList<>();
    int w=0;
    OutputStream png;
    public Histograma (int aluno,int disc){
        notaAc = new NotaAccess();
        avaliacaoAc = new AvalicaoAccess();
        JFreeChart graf = null;
        try{
            
            DefaultCategoryDataset dado = new DefaultCategoryDataset();
            for(model.Notas nota:notaAc.lista(aluno,disc)){
                dados.add(nota.getValor());
                dado.addValue(nota.getValor(), avaliacaoAc.read(nota.getId()).getDescricao(),"" +1);
                graf = ChartFactory.createBarChart("Notas","Nota" , "" +avaliacaoAc.read(nota.getId()), dado, PlotOrientation.VERTICAL, true, true, false);
                
            }
            
            
            


            final CategoryItemRenderer enderer = graf.getCategoryPlot().getRenderer();
            enderer.setSeriesPaint(0, Color.BLACK);
            graf.getPlot().setBackgroundPaint(Color.WHITE);
            png = new FileOutputStream("barras.png");
            ChartUtilities.writeChartAsPNG(png, graf, 600, 400);
            png.close();
        }
        catch(Exception e){
                }
        
    }
    
}
    

