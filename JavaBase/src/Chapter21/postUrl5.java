package Chapter21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.lang3.StringUtils;



public class postUrl5 {
	static int counter=0;

	public static void main(String[] args) throws IOException {
//		http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp
//		lsbh	04903399
//		verifycode	8107
//		backurl
       //发送 POST 请求

		int i=104,j=0;
		boolean check=false;
		
		String str="",str1="",str2="";
		str1=StringUtils.leftPad(""+i, 3,"0");

		File f=new File("D:/postUrl_"+str1+".test");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bf=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bf);
		Date now=new Date();
		
		
		int count=1;
		int anchor=0;
		String sr="";
        new Reminder();

		do {
			counter=0;
			sr="";

			str1=StringUtils.leftPad(""+i, 3,"0");
			str2=StringUtils.leftPad(""+j, 5,"0");
			str="lsbh="+ str1 + str2 +"&verifycode=" +str2+ "&backurl=";
			now=new Date();
			System.out.println("======================="+counter+"============================"+now+"====="+str1+str2+"=");
		
//		        String sr=sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=04903399&verifycode=8107&backurl=");
		        sr=sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", str);
		        check=!sr.contains("水费");
		        if(!check & (count <=20 | j < anchor)){
			        System.out.println("j="+j+", anchor="+anchor+", count="+count+", length="+sr.length());

		        	pw.println(sr);
//		        	System.out.println(sr);
		        	count=0;
		        	j++;
		        }else if(!check & count > 20){
			        System.out.println("j="+j+", anchor="+anchor+", count="+count+", length="+sr.length());

		        	anchor=j;
		        		j=anchor-count+20;
		        	count=0;
		        	j++;
		        	continue;
		        }else if(check & count ==0){
			        System.out.println("j="+j+", anchor="+anchor+", count="+count+", length="+sr.length());

		        	count=1;
		        	j++;
		        }else if(check & count > 0){
			        System.out.println("j="+j+", anchor="+anchor+", count="+count+", length="+sr.length());

		        	if(j < anchor){
		        		count++;
		        		j++;
		        	}else if(count < 20){
		        		count++;
		        		j++;
		        	}else if(count < 100){
		        		count+=5;
		        		j+=5;
		        	}else if(count <1000){
		        		count+=100;
		        		j+=100;
		        	}else{
		        		i++;
		        		j=0;
		        		count=0;
		        		anchor=0;
		        		pw.flush();
		        		pw.close();
		        		bf.close();
		        		fw.close();
		        		
		        		str1=StringUtils.leftPad(""+i, 3,"0");
		        		f=new File("D:/postUrl_"+str1+".log");
		        		fw=new FileWriter(f, true);
		        		bf=new BufferedWriter(fw);
		        		pw=new PrintWriter(bf);

		        	}
		        }else{
		        	System.out.println("Out of Control!!!!!");
			        System.out.println("j="+j+", anchor="+anchor+", count="+count+", length="+sr.length());

		        	continue;
		        }

		} while(i<1000);
		
		pw.flush();
		pw.close();
		fw.close();
	}
	
	
	
    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
            		"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }    
    
    
    public static class Reminder{
        Timer timer;
        
        public Reminder(){
            timer = new Timer();
            timer.schedule(new TimerTask(){
                public void run(){
                	counter++;
                	if(counter>10){
                		try {
                			counter=0;
							throw new Exception("Time out!");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                	}
                }
            }, 1000,1000);
        }
    } 


}
