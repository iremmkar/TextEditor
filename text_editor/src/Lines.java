
import java.util.ArrayList;
import java.util.Iterator;

public class Lines{ 

    private ArrayList<String> Lines; 
    private String temp;

    Lines(ArrayList<String> arrList) { //parametre olarak arraylist alıyor
        this.Lines = arrList;
    }

    public void add(String s) {//arraylist e ekleme
        Lines.add(s);
    }

    public void change(String searchWordString, String changeWordString) { 
        
        //aranan kelimeyi istenilen kelime ile değiştirme
        Iterator iWords = Lines.iterator();
        ArrayList<Integer> countersArrayList = new ArrayList<>();
        ArrayList<String> tempArrayList = new ArrayList<>();
        int counter = 0;
        while (iWords.hasNext()) { //listeyi dolaşma
            temp = iWords.next().toString();
            if (temp.contains(searchWordString)) {

                countersArrayList.add(counter); 
                //index numaralarının kaydını tutan liste
                tempArrayList.add(temp.replace(searchWordString, changeWordString)); 
                    
            }
            counter++; 
        }
        for (int i = 0; i < countersArrayList.size(); i++) {
            Lines.set(countersArrayList.get(i), tempArrayList.get(i));
        }
    }
    public void search(String searchWordString) {
        
        Iterator iWords = Lines.iterator();
        ArrayList<Integer> countersArrayList = new ArrayList<>();
        ArrayList<String> tempArrayList = new ArrayList<>();
        int counter = 0;
        while (iWords.hasNext()) { //dolaşma
            temp = iWords.next().toString();
            if (temp.contains(searchWordString)) {

                System.out.println(temp); //aranan kelime yazdırılır
            }
            counter++; 
        }
        for (int i = 0; i < countersArrayList.size(); i++) {
            Lines.set(countersArrayList.get(i), tempArrayList.get(i));
        }
    }
    public String get() { //panel e yazabilmek için string e çevirme
        StringBuilder sb = new StringBuilder();
        for (String s : Lines) {
            sb.append(s);
            sb.append("\r\n");
        }
        return sb.toString();
    }

}
