# AuthorizationApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransaction**](AuthorizationApi.md#createTransaction) | **POST** /transactions | Auth Only |


<a name="createTransaction"></a>
# **createTransaction**
> createTransaction().authorizationCreateTransactionRequest(authorizationCreateTransactionRequest).execute();

Auth Only



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
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
    Float amount = 11F;
    String softDescriptor = "DescTest";
    AuthorizationCreateTransactionRequestCardHolderInfo cardHolderInfo = new AuthorizationCreateTransactionRequestCardHolderInfo();
    String currency = "USD";
    AuthorizationCreateTransactionRequestCreditCard creditCard = new AuthorizationCreateTransactionRequestCreditCard();
    String cardTransactionType = "AUTH_ONLY";
    try {
      client
              .authorization
              .createTransaction()
              .amount(amount)
              .softDescriptor(softDescriptor)
              .cardHolderInfo(cardHolderInfo)
              .currency(currency)
              .creditCard(creditCard)
              .cardTransactionType(cardTransactionType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#createTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorization
              .createTransaction()
              .amount(amount)
              .softDescriptor(softDescriptor)
              .cardHolderInfo(cardHolderInfo)
              .currency(currency)
              .creditCard(creditCard)
              .cardTransactionType(cardTransactionType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#createTransaction");
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
| **authorizationCreateTransactionRequest** | [**AuthorizationCreateTransactionRequest**](AuthorizationCreateTransactionRequest.md)|  | [optional] |

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

