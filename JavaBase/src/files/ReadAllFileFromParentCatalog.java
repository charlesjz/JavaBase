package files;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ReadAllFileFromParentCatalog {  
    
    //��ȡһ���ļ����������ļ������ļ����µ������ļ�  
    public void ReadAllFile(String filePath) {  
    	List<String> results = new ArrayList<String>();
        File f = null;  
        f = new File(filePath);  
        File[] files = f.listFiles(); // �õ�f�ļ�������������ļ���  
        List<File> list = new ArrayList<File>();  
        for (File file : files) {  
            if(file.isDirectory()) {  
                //��ε�ǰ·�����ļ��У���ѭ����ȡ����ļ����µ������ļ�  
                ReadAllFile(file.getAbsolutePath());  
            } else {  
                list.add(file);  
            }  
        }  
        for(File file : files) {  
        	if(file.length()>1000000){
	        	results.add(StringUtils.leftPad(""+file.length(),11,"0")+" "+file.getAbsolutePath());
//	            System.out.println(file.getAbsolutePath()+", "+file.length()+" for "+map.);  
        	}
        }
        results.sort(Comparator.naturalOrder());
        for(String result:results){
        	System.out.println(result);
        }
    }  
      
    //��ȡһ���ļ����µ������ļ��к��ļ�  
    public void ReadFile(String filePath) {  
        File f = null;  
        f = new File(filePath);  
        File[] files = f.listFiles(); // �õ�f�ļ�������������ļ���  
        List<File> list = new ArrayList<File>();  
        for (File file : files) {  
            list.add(file);  
        }  
        for(File file : files) {  
            System.out.println(file.getAbsolutePath());  
        }  
    }  
      
    public static void main(String[] args) {  
        String filePath = "D:/�����ѧϰ";  
        new ReadAllFileFromParentCatalog().ReadAllFile(filePath);  
    }  
} 