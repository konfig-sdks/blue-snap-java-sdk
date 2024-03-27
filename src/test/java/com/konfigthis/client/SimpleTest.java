package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://sandbox.bluesnap.com/services/2";
        
        // Configure HTTP basic authorization: sec0
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        
        configuration.sec1  = "YOUR API KEY";
        BlueSnap client = new BlueSnap(configuration);
        assertNotNull(client);
    }
}
