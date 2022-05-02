package accessModifiers;

import org.junit.jupiter.api.Test;

public class Access1 {

    private String privateVar;
    public String publicVar;
    protected String protectedVar;
    String defaultVar;

    private void testPrivate(){

    }

    public void testPublic(){

    }

    protected void testProtected(){

    }

    void testDefault(){

    }

    @Test
    public void testAccess(){
        privateVar="123";
        testPrivate();

        publicVar="1234";
        testPublic();

        protectedVar="12345";
        testProtected();

        defaultVar="123456";
        testDefault();
    }

}

//Private can be accessed within same class only