import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @org.junit.jupiter.api.Test
    void addOnePage() {
        Book BookTest = new Book ("Roee","GoodLock",1,1);
        BookTest.addOnePage();
        assertEquals(2,BookTest.getNumOfPages());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        Book BookTest = new Book ("Roee","GoodLock",1,1);
        assertEquals(1,BookTest.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getAuthor() {
        Book BookTest = new Book ("Roee","GoodLock",1,1);
        assertEquals("Roee",BookTest.getAuthor());
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
        Book BookTest = new Book ("Roee","GoodLock",1,1);
        assertEquals("GoodLock",BookTest.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setPrice() {
        Book BookTest = new Book ("Roee","GoodLock",1,1);
        BookTest.setPrice(0);
        assertEquals(0,BookTest.getPrice());
    }
}