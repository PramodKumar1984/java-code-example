package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonSerializationTest {

	public static void main(String [] args) throws FileNotFoundException,IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BillSingleTon instance =  BillSingleTon.getInstance();
		
		ObjectOutput out =  new ObjectOutputStream(new FileOutputStream("file.ser"));
		out.writeObject(instance);
		out.close();
		
		ObjectInput in =  new ObjectInputStream(new FileInputStream("file.ser"));
		BillSingleTon instanceTow = (BillSingleTon)in.readObject();
		in.close();
		System.out.println(instance.hashCode());
		System.out.println(instanceTow.hashCode());
	
		
		Constructor[] constructors = BillSingleTon.class.getDeclaredConstructors();
		
		for(Constructor<BillSingleTon> cons : constructors) {
			cons.setAccessible(true);
			instanceTow = cons.newInstance();
			break;
			
		}
		
		System.out.print(instanceTow.hashCode());
		
	}
	
	
	
}
