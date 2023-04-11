
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String output = "The collection " + this.name;
        
        if(this.elements.isEmpty()){
            return output + " is empty.";
        }
        
        String pplonelements = "";
        
        for(String element: elements){
            pplonelements = pplonelements + "\n"+ element;
        }
        
        if(this.elements.size()==1){
            return output + " has " + elements.size() +
               " element:" + pplonelements;
        }
        
        return output + " has " + elements.size() +
               " elements:" + pplonelements;
    }
    
}
