package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private ProxyDatabase database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new ProxyDatabase("abcd");
    }

    @Test
    void testGetSearchResults() {
    	assertNull(this.database.getSearchResults("select * from comics where id=1"));
    	
    	this.database.iniciarSesión("abcd");
    	
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	assertEquals(0,this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    	
    	this.database.iniciarSesión("abcd");
    	
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
}