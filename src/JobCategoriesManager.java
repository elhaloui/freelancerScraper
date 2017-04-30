
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL HALOUI
 */
public class JobCategoriesManager {
    public static void listAllJobCategories() throws IOException 
    {
        Document document = Jsoup.connect("https://www.freelancer.com/job/").get();
        List<JobCategory> jobCategories=new ArrayList<>();
       
       document.select(".PageJob-category-link").
               stream()
               .map(Element::ownText)
               .map(text->new JobCategory(text, Integer.parseInt(text.substring(text.lastIndexOf("(")+1, text.lastIndexOf(")")))))
               .sorted(Comparator.comparing(jobCategory->((JobCategory)jobCategory)
                       .getOpenProjectsCount()).reversed())
              .forEach(jobCategory->System.out.println(jobCategory));
    }
    public static void main(String[] args) throws IOException 
    {
        
        listAllJobCategories();
   
        
    }
}
