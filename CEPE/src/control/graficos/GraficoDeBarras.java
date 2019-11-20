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
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.util.TableOrder;
import model.Notas;


public class GraficoDeBarras {
    
    private static NotaAccess notaAc;
    private static AvalicaoAccess avaliacaoAc;
    List<Float> dados;
    int w=0;
    public GraficoDeBarras(int aluno,int disc) throws FileNotFoundException, IOException{
        dados = new ArrayList<>();
        
        notaAc = new NotaAccess();
        avaliacaoAc = new AvalicaoAccess();
        
        DefaultCategoryDataset dado = new DefaultCategoryDataset();
        
        for(model.Notas nota:notaAc.lista(aluno,disc)){
            dados.add(nota.getValor());
            dado.addValue(nota.getValor(),avaliacaoAc.read(nota.getId()).getDescricao() ,"");
        }
        
        
        JFreeChart graf = ChartFactory.createBarChart("Gráfico de Linha","Nota", "" +w, dado, PlotOrientation.HORIZONTAL, true, true, true);
        graf.setBorderPaint(Color.WHITE);
        final CategoryPlot plo =graf.getCategoryPlot();
        final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plo.getRenderer();
        renderer.setBaseShapesVisible(true);
        renderer.setSeriesPaint(0, Color.black);
         graf.getPlot().setBackgroundPaint(Color.WHITE);
        OutputStream png = new FileOutputStream("LINHA.png");
        ChartUtilities.writeChartAsPNG(png, graf, 800, 600);
    }
    
}
