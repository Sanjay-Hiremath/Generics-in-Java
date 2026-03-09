package CollectionsGenerics;

class DisplayAnyType{
	public <T> void display(T elem) {
		System.out.println(elem);
	}
}

public class Ex10 {
public static void main(String[] args) {
	DisplayAnyType disp= new DisplayAnyType();
	disp.display("Sanjay");
	disp.display(123);
	disp.display(23.333);
	disp.display(true);
}
}


