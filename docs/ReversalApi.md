# ReversalApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authTransaction**](ReversalApi.md#authTransaction) | **PUT** /transactions | Auth Reversal |


<a name="authTransaction"></a>
# **authTransaction**
> authTransaction().reversalAuthTransactionRequest(reversalAuthTransactionRequest).execute();

Auth Reversal



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReversalApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.bluesnap.com/services/2";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    configuration.sec1  = "YOUR API KEY";
    BlueSnap client = new BlueSnap(configuration);
    String cardTransactionType = "AUTH_REVERSAL";
    Integer transactionId = 1011671987;
    try {
      client
              .reversal
              .authTransaction()
              .cardTransactionType(cardTransactionType)
              .transactionId(transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReversalApi#authTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reversal
              .authTransaction()
              .cardTransactionType(cardTransactionType)
              .transactionId(transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReversalApi#authTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reversalAuthTransactionRequest** | [**ReversalAuthTransactionRequest**](ReversalAuthTransactionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

