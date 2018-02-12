package timer;

import java.util.Timer;
import java.util.TimerTask;

public class Timer1 {
	public static void main(String[] args) {
		Clock clock = new Clock();//��������ʱ��
		clock.start(10);//��ʼ10��ĵ���ʱ
	}
}
class Clock{//����ʱʱ�ӣ�������������ʼ����ʱ
	Timer timer = new Timer();
	int sec;//�ڲ�����Թ����ⲿ����Դsec
	public void start(int sec){//��ʼ����ʱ�ķ���
		this.sec = sec;
		timer.schedule(new Task(), 0, 1000);
		timer.schedule(new CancelTask(), 1000*sec+100);
	}
	private class CancelTask extends TimerTask{
		public void run(){timer.cancel();};
	}
	private class Task extends TimerTask{//�ڲ���
		public void run() {System.out.println(sec--);}
	}
}