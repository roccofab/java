public class libreria {
    Book[] b;

    public libreria(Book[] b) {
        this.b = b;
    }

    public int trova(String a, int k) {
        int contatore = 0;
        for (Book book : b) {
            if (book.getAutore().equalsIgnoreCase(a) && book.getPrezzo() > k) {
                contatore++;
            }
        }
        return contatore;
    }

    public String[] titoliAutore(String a) {
        int contatore = 0;
        for (Book book : b) {
            if (book.getAutore().equalsIgnoreCase(a)) {
                contatore++;
            }
        }
        String[] titoli = new String[contatore];
        int index = 0;
        for (Book book : b) {
            if (book.getAutore().equalsIgnoreCase(a)) {
                index++;
                titoli[index - 1] = book.getTitolo();
            }
        }
        return titoli;
    }
}
