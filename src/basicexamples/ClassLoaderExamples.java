package basicexamples;

public class ClassLoaderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class c = ClassLoaderExamples.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}

}
