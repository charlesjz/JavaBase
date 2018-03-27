package files;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

//import lombok.Data;

public class ReadAllFileFromParentCatalog {  
    
    //��ȡһ���ļ����������ļ������ļ����µ������ļ�  
    public void ReadAllFile(String filePath) {  
    	ArrayList<FileInfo> fileInfos = new ArrayList<FileInfo>();
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
        
        int idx=0;
        for(File file : files) {  
        	if(file.length()>1000000){
        		FileInfo fi=new FileInfo(asList((0,0)));
        		fi.setFilePath(file.getAbsolutePath());
        		fi.setLen((int)file.length());
        		fileInfos.add(idx, fi);
        		idx++;
//	            System.out.println(file.getAbsolutePath()+", "+file.length()+" for "+map.);  
        	}
        }
//        humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
//        fileInfos.sort((f1, f2) -> f1.getLen() - f2.getLen());
        fileInfos.forEach(fileInfo -> System.out.println(fileInfo));

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

//@Data
class FileInfo {
	private String filePath;
	private int len;
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public long getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	
}