package junit.monprojet;

public class SommeArgent {
    private int quantite;
    private String unite;
    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getUnite() {
        return unite;
    }
    public SommeArgent add(SommeArgent m) throws UniteDistincteException{
        if (!m.getUnite().equals(this.getUnite())) {
            throw new UniteDistincteException(this, m);
        }
        else
            return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + unite.hashCode();
        result = 31 * result + quantite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        SommeArgent sommeArgent = (SommeArgent) obj;
        if (!unite.equals(sommeArgent.unite)) return false;
        if (quantite != sommeArgent.quantite) return false;
        return true;
    }
}