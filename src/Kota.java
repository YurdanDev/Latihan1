public class Kota <E> {
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumKota = new Kota<Integer>(9);
        Kota<String> namKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di jawatimur : " + jumKota.getElement() + "kota");
        System.out.println("Salah satu kota di jawatimur : kota " + namKota.getElement());
    }
    
}
