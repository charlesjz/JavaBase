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


public class postUrl3 {

	public static void main(String[] args) throws IOException {
//		http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp
//		lsbh	04903399
//		verifycode	8107
//		backurl
        //���� POST ����
		String str="",str1="",str2="";
		File f=new File("D:/postUrl.log");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bf=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bf);
		
		
		int i=12,j=1514;
		int count=0;
		int count_item=0;
		int loop;
		String item[] = new String[100];
		
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201510&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201511&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201512&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201513&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201514&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201515&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201516&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201517&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201518&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201519&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201520&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201521&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201522&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201523&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201524&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201525&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201526&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201527&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201528&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201529&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201530&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201531&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201532&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201533&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201534&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201535&verifycode=8107&backurl="));}}).start();
		new Thread(new Runnable(){ public void run(){
    	  	System.out.println(sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201536&verifycode=8107&backurl="));}}).start();



		
//		        String sr1=sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", "lsbh=01201514&verifycode=8107&backurl=");
//		        String sr=sendPost("http://www.dalian-jw.gov.cn:8080/lhsfc/querycx.asp", str);
		        
		pw.flush();
		pw.close();
		fw.close();
	}
	
	
	
    /**
     * ��ָ�� URL ����POST����������
     * 
     * @param url
     *            ��������� URL
     * @param param
     *            ����������������Ӧ���� name1=value1&name2=value2 ����ʽ��
     * @return ������Զ����Դ����Ӧ���
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // �򿪺�URL֮�������
            URLConnection conn = realUrl.openConnection();
            // ����ͨ�õ���������
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
            		"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0");
            // ����POST�������������������
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // ��ȡURLConnection�����Ӧ�������
            out = new PrintWriter(conn.getOutputStream());
            // �����������
            out.print(param);
            // flush������Ļ���
            out.flush();
            // ����BufferedReader����������ȡURL����Ӧ
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("���� POST ��������쳣��"+e);
            e.printStackTrace();
        }
        //ʹ��finally�����ر��������������
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

}
