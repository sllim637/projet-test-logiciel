package junit.monprojet;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PorteMonnaie {
    private HashMap<String, Integer> contenu;
    public HashMap<String, Integer> getContenu() {
        return contenu;
    }
    public PorteMonnaie() {

        contenu = new HashMap<String, Integer>();

    }

    public void ajouteSomme(SommeArgent sa) {
        if (this.contenu.containsKey(sa.getUnite())){
            int oldValue = this.contenu.get(sa.getUnite());
            this.contenu.put(sa.getUnite(), oldValue + sa.getQuantite());
        }else{
          this.contenu.put(sa.getUnite() , sa.getQuantite());
        }
    }

    public String toString(){
        String totalString ="";
        for (Map.Entry<String, Integer> entry : this.contenu.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            totalString += key + "" + value + "\n";
        }
        System.out.println("the returned value is :" + totalString);
        return totalString;
    }
    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        PorteMonnaie porteMonnaie = (PorteMonnaie) obj;
        for (Map.Entry<String, Integer> entry : porteMonnaie.contenu.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(!((this.contenu.containsKey(key)) && (this.contenu.get(key) == value)) ){
               return false;
            }
        }
        return true;
    }

}