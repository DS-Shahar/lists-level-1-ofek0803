package listt;
import java.util.Random;
public class shior1 {
	public static Node<Integer> rand(int n,int x,int y){
		Random rand=new Random();
		Node<Integer> a=new Node<Integer>(-1);
		Node<Integer> first=a;
		Node<Integer> b;
		for (int i=0;i<n;i++) {
			b=new Node<Integer>(rand.nextInt(x-y+1)+y);
			a.setNext(b);
			a=a.getNext();
		}
		return first.getNext();
	}
	
	public static int Howmany(Node<Integer>a, int n) {
		int count=0;
		Node<Integer>first=a;
		while(a!=null) {
			if (a.getValue()==n) {
				count++;
				a=a.getNext();
			}
		}
		return count;
	}
