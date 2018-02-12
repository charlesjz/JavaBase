/**
 * 
 */
/**
 * @author Jiang
 *
 */
package dom4j;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class testXML2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            File file = new File("G:/�����ѧϰ/SSH/Hibernate/2012��1�·�������hibernate��Ƶ�̳�/time.gplf");
            SAXReader reader=new SAXReader();
            //��ȡxml�ļ���Document��
            Document doc=reader.read(file);
            //��ȡxml�ļ��ĸ��ڵ�
            Element rootElement=doc.getRootElement();
            //����һ��Element���ڱ���
            Element fooElement;
            //�����������С�VideoId���Ľڵ�
            for(Iterator i=rootElement.elementIterator("VideoId");i.hasNext();){
                fooElement=(Element)i.next();
                System.out.println(fooElement.attributeValue("Name")+","+fooElement.attributeValue("Duration"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

}