package pavanChanges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample extends BaseClass {
    @Test
    public void sortingPrices() throws InterruptedException {
        launch();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2Sn47c']/descendant::button[1]")).click();
        Thread.sleep(3000);

        //clicked on ac image
        driver.findElement(By.xpath("(//div[@id='container']//following-sibling::div)[35]")).click();
        driver.findElement(By.xpath("(//img[@alt='AC'])[2]")).click();

                ArrayList originallist = new ArrayList();
                ArrayList  templist = new ArrayList();
                //clicked on price to low option
                WebElement lowtohigh= driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
                lowtohigh.click();
                Thread.sleep(3000);
                //collecting all prices in to list
                List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
                System.out.println(prices.size());
                for(int i=0;i< prices.size();i++){
                    String list=prices.get(i).getText().replace("₹","").replace(",","");
                    originallist.add(list);
                    templist.add(list);
                }
                System.out.println("original list :  "+originallist);
                System.out.println("Before sorting templist : "+templist);
                Collections.sort(templist);
                System.out.println("After sorting templist : "+templist);
                Assertions.assertEquals(originallist,templist);


            }
        }


//    public void arrayListCompare(){ArrayList<String> arraylist1 = new ArrayList<>();
//    arraylist1.add("India");
//    arraylist1.add("Syria");
//    arraylist1.add("New Zealand");
//    arraylist1.add("Belgium");
//    arraylist1.add("Australia");
//    ArrayList<String> arraylist2 = new  ArrayList<>();
//    arraylist2.add("Syria");
//    arraylist2.add("India");
//    arraylist2.add("");
//    arraylist2.add("Australia");
//    arraylist2.add("Belgium");
//    System.out.println("given list of countries before sorting : " +arraylist1);
//    System.out.println("Given list of countries before sorting : " +arraylist2);
//    System.out.println("comparing given data " +arraylist1.equals(arraylist2));
//    Collections.sort(arraylist1);
//    Collections.sort(arraylist2);
//    System.out.println("Given list of the countries after sorting : "+arraylist1);
//    System.out.println("Given List of the countries after sorting : "+arraylist2);
//    System.out.println("comparing give data " +arraylist1.equals(arraylist2));    }}
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//public class Sample {



//    @RunWith(Parameterized.class)
//    public class CompareClassTest {
//        public List<String> actualList;
//        public String expectedResult;
//        public CompareClassTest dc=new CompareClass();

        //constructor
//        public CompareClassTest(List<String> actualList, String expectedResult)
//        {
//            this.actualList = actualList;
//            this.expectedResult =expectedResult;
//        }

        //testdata provider function
//        @Parameterized.Parameters
//        public static Collection<Object> testData()
//        {
//            return Arrays.asList(new Object[][] {
//                    {Arrays.asList("africa","america","brazil","china","denmark"), "sorted" },
//                    { Arrays.asList("india","america","armenia","korea","japan","china","brazil"), "unsorted" }
//
//            });
//        }

        //actual test
//        @Test
//        public void sortTest()
//        {

//            List<String> expectedList=dc.sortIt(new ArrayList<>(actualList));
//            Assert.assertEquals(dc.compareIt(actualList,expectedList), expectedResult);//testing the compareIt functionality
//        }

//    }
//
//
//}
