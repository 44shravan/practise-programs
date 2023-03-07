import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialiTest implements Serializable { 
    private static final long serialVersionUID = 1L; 
    private NonSerial nonSerial; 
    SerialiTest(Object  nonSerial){ 
    	this.nonSerial = (NonSerial) nonSerial;
     // this.nonSerial = nonSerial; 
    } 
    public static void main(String [] args)  { 
      NonSerial nonSer = new NonSerial(); 
      SerialiTest c = new SerialiTest(nonSer); 
      try { 
       FileOutputStream fs = new FileOutputStream("test1.ser"); 
       ObjectOutputStream os = new ObjectOutputStream(fs); 
       os.writeObject(c); 
       os.close(); 
      } catch (Exception e) {  e.printStackTrace(); } 
      try { 
        FileInputStream fis = new FileInputStream("test1.ser"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        c = (SerialiTest)  ois.readObject(); 
        ois.close(); 
      } catch (Exception e) { 
        e.printStackTrace(); 
      } 
     } 
    }   
	/*
	Q6) What happens if the object to be serialized includes the references to other serializable objects?
	
	Ans) If the object to be serialized includes references to the other objects, then all those object’s state also will be saved as the part of the serialized state of the object in question. The whole object graph of the object to be serialized will be saved during serialization automatically provided all the objects included in the object’s graph are serializable.
	
	Q7) What happens if an object is serializable but it includes a reference to a non-serializable object?
	
	Ans- If you try to serialize an object of a class which implements serializable, but the object includes a reference to an non-serializable class then a ‘NotSerializableException’ will be thrown at runtime.
	
	*/
