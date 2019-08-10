package synchronized_.test;

import lombok.Synchronized;
import lombok.ToString;

import java.io.*;
import java.rmi.server.ExportException;

/**
 * @author cuixin on 2019-08-10
 * 序列化，反序列化注意。
 **/
@ToString
public class Demo implements Serializable {
    /**
     * 加个序列化版本号，防止去掉@Synchronized无法区分版本。
     */
    private static final long serialVersionUID =  1314520L;

    private int count;
    @Synchronized
    public void addCount(){
        count ++;
    }

    public static void main(String[] args)  {
        Demo obj1 = new Demo();
        obj1.addCount();
        obj1.addCount();

        String fileName = "file.ser";
        //序列化
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj1);
            oos.close();
            fos.close();
        }
        catch (Exception e){
            System.err.println(e);
        }

        //反序列化
        Demo obj2 = null;
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            if(obj instanceof  Demo){
                obj2 = (Demo) obj;
                System.out.println(obj2);
            }

        }catch (Exception e){
            System.err.println(e);
        }


    }

}
