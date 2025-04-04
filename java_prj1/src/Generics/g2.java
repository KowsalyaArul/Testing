package Generics;

public class g2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datastore<Integer> instore =new Datastore<>();
		instore.setData(200);
		System.out.println(instore.getData());
		Datastore<String> stringinstore =new Datastore<>();
		stringinstore.setData("kowsi");
		System.out.println(stringinstore.getData());

	}

}
