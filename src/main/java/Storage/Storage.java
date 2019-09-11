package Storage;

import com.BubbleTea.Shop.BubbleTea;

import java.io.*;
import java.util.ArrayList;

public class Storage {
    public ArrayList<BubbleTea> loadFile() throws IOException {
        File f = new File("storage.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        try{
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream oi = new ObjectInputStream(fi);
            ArrayList<BubbleTea> bubble_bag = (ArrayList<BubbleTea>) oi.readObject();
            fi.close();
            oi.close();
            if (bubble_bag.isEmpty()){
                return new ArrayList<BubbleTea>();
            }
            return bubble_bag;
        }catch (Exception e){
            System.out.println(e);
        }
        return new ArrayList<BubbleTea>();
    }
    public void saveFile(ArrayList<BubbleTea> bb){
        try{
            System.out.println("Saving");
            FileOutputStream f = new FileOutputStream(new File("storage.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(bb);
            f.close();
            o.close();
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }
    }
}

