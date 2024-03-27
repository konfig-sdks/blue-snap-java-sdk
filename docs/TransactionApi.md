# TransactionApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveMerchantTransaction**](TransactionApi.md#approveMerchantTransaction) | **PUT** /transactions/approval | Merchant Approve Transaction |
| [**cancelPendingRefund**](TransactionApi.md#cancelPendingRefund) | **DELETE** /transactions/pending-refund/{transactionId} | Cancel Pending Refund |
| [**createBatchTransaction**](TransactionApi.md#createBatchTransaction) | **POST** /batch-transactions | Create Batch Transaction |
| [**createSofortTransaction**](TransactionApi.md#createSofortTransaction) | **POST** /alt-transactions | Create Sofort Transaction |
| [**getBatchTransaction**](TransactionApi.md#getBatchTransaction) | **GET** /batch-transactions/{batchId} | Retrieve Batch Transaction |
| [**getById**](TransactionApi.md#getById) | **GET** /transactions/{transactionId} | Retrieve |
| [**getPaypalTransaction**](TransactionApi.md#getPaypalTransaction) | **GET** /alt-transactions/resolve?orderId&#x3D;{orderId} | Retrieve PayPal Transaction |
| [**getPreNotificationDebitAgreement**](TransactionApi.md#getPreNotificationDebitAgreement) | **GET** /agreements/prenotification/{transactionId} | Get Pre-Notification Debit Agreement |
| [**getSepaDd**](TransactionApi.md#getSepaDd) | **GET** /alt-transactions/{transactionId} | Retrieve SEPA DD Transaction |
| [**getSofortTransaction**](TransactionApi.md#getSofortTransaction) | **GET** /alt-transactions/resolve | Retrieve Sofort Transaction |
| [**initiateRefund**](TransactionApi.md#initiateRefund) | **POST** /transactions/refund/{transactionId} | Refund |
| [**updatePaypalTransaction**](TransactionApi.md#updatePaypalTransaction) | **PUT** /alt-transactions | Update PayPal Transaction |


<a name="approveMerchantTransaction"></a>
# **approveMerchantTransaction**
> approveMerchantTransaction().transactionid(transactionid).approvetransaction(approvetransaction).execute();

Merchant Approve Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionid = "38612140"; // either `transactionid` or `merchanttransactionid` <b>is required</b> <br />ID of the transaction to be approved/declined
    Boolean approvetransaction = true; // Set to `true` to approve the transaction or to `false` to decline the transaction. Default value is `true`.
    try {
      client
              .transaction
              .approveMerchantTransaction()
              .transactionid(transactionid)
              .approvetransaction(approvetransaction)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#approveMerchantTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .approveMerchantTransaction()
              .transactionid(transactionid)
              .approvetransaction(approvetransaction)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#approveMerchantTransaction");
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
| **transactionid** | **String**| either &#x60;transactionid&#x60; or &#x60;merchanttransactionid&#x60; &lt;b&gt;is required&lt;/b&gt; &lt;br /&gt;ID of the transaction to be approved/declined | [optional] [default to 38612140] |
| **approvetransaction** | **Boolean**| Set to &#x60;true&#x60; to approve the transaction or to &#x60;false&#x60; to decline the transaction. Default value is &#x60;true&#x60;. | [optional] [default to true] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="cancelPendingRefund"></a>
# **cancelPendingRefund**
> cancelPendingRefund(transactionId).execute();

Cancel Pending Refund



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionId = "1109144995"; // transactionId received from BlueSnap
    try {
      client
              .transaction
              .cancelPendingRefund(transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#cancelPendingRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .cancelPendingRefund(transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#cancelPendingRefund");
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
| **transactionId** | **String**| transactionId received from BlueSnap | [default to 1109144995] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createBatchTransaction"></a>
# **createBatchTransaction**
> createBatchTransaction().transactionCreateBatchTransactionRequest(transactionCreateBatchTransactionRequest).execute();

Create Batch Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    TransactionCreateBatchTransactionRequestBatchTransaction batchTransaction = new TransactionCreateBatchTransactionRequestBatchTransaction();
    try {
      client
              .transaction
              .createBatchTransaction()
              .batchTransaction(batchTransaction)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createBatchTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .createBatchTransaction()
              .batchTransaction(batchTransaction)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createBatchTransaction");
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
| **transactionCreateBatchTransactionRequest** | [**TransactionCreateBatchTransactionRequest**](TransactionCreateBatchTransactionRequest.md)|  | [optional] |

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

<a name="createSofortTransaction"></a>
# **createSofortTransaction**
> createSofortTransaction().transactionCreateSofortTransactionRequest(transactionCreateSofortTransactionRequest).execute();

Create Sofort Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    TransactionCreateSofortTransactionRequestEcpTransaction ecpTransaction = new TransactionCreateSofortTransactionRequestEcpTransaction();
    Float amount = 42F;
    TransactionCreateSofortTransactionRequestPayerInfo payerInfo = new TransactionCreateSofortTransactionRequestPayerInfo();
    String softDescriptor = "ABC COMPANY";
    String currency = "GBP";
    Boolean authorizedByShopper = true;
    TransactionCreateSofortTransactionRequestBecsDirectDebitTransaction becsDirectDebitTransaction = new TransactionCreateSofortTransactionRequestBecsDirectDebitTransaction();
    TransactionCreateSofortTransactionRequestIdealTransaction idealTransaction = new TransactionCreateSofortTransactionRequestIdealTransaction();
    TransactionCreateSofortTransactionRequestLocalBankTransferTransaction localBankTransferTransaction = new TransactionCreateSofortTransactionRequestLocalBankTransferTransaction();
    TransactionCreateSofortTransactionRequestPaypalTransaction paypalTransaction = new TransactionCreateSofortTransactionRequestPaypalTransaction();
    TransactionCreateSofortTransactionRequestAcssDirectDebitTransaction acssDirectDebitTransaction = new TransactionCreateSofortTransactionRequestAcssDirectDebitTransaction();
    TransactionCreateSofortTransactionRequestSepaDirectDebitTransaction sepaDirectDebitTransaction = new TransactionCreateSofortTransactionRequestSepaDirectDebitTransaction();
    TransactionCreateSofortTransactionRequestSofortTransaction sofortTransaction = new TransactionCreateSofortTransactionRequestSofortTransaction();
    try {
      client
              .transaction
              .createSofortTransaction()
              .ecpTransaction(ecpTransaction)
              .amount(amount)
              .payerInfo(payerInfo)
              .softDescriptor(softDescriptor)
              .currency(currency)
              .authorizedByShopper(authorizedByShopper)
              .becsDirectDebitTransaction(becsDirectDebitTransaction)
              .idealTransaction(idealTransaction)
              .localBankTransferTransaction(localBankTransferTransaction)
              .paypalTransaction(paypalTransaction)
              .acssDirectDebitTransaction(acssDirectDebitTransaction)
              .sepaDirectDebitTransaction(sepaDirectDebitTransaction)
              .sofortTransaction(sofortTransaction)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createSofortTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .createSofortTransaction()
              .ecpTransaction(ecpTransaction)
              .amount(amount)
              .payerInfo(payerInfo)
              .softDescriptor(softDescriptor)
              .currency(currency)
              .authorizedByShopper(authorizedByShopper)
              .becsDirectDebitTransaction(becsDirectDebitTransaction)
              .idealTransaction(idealTransaction)
              .localBankTransferTransaction(localBankTransferTransaction)
              .paypalTransaction(paypalTransaction)
              .acssDirectDebitTransaction(acssDirectDebitTransaction)
              .sepaDirectDebitTransaction(sepaDirectDebitTransaction)
              .sofortTransaction(sofortTransaction)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createSofortTransaction");
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
| **transactionCreateSofortTransactionRequest** | [**TransactionCreateSofortTransactionRequest**](TransactionCreateSofortTransactionRequest.md)|  | [optional] |

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

<a name="getBatchTransaction"></a>
# **getBatchTransaction**
> getBatchTransaction(batchId).execute();

Retrieve Batch Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String batchId = "567890"; // batch ID sent in the Create Batch Transaction request
    try {
      client
              .transaction
              .getBatchTransaction(batchId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getBatchTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getBatchTransaction(batchId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getBatchTransaction");
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
| **batchId** | **String**| batch ID sent in the Create Batch Transaction request | [default to 567890] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> getById(transactionId).execute();

Retrieve



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionId = "1011582369"; // transaction ID received in the response from BlueSnap
    try {
      client
              .transaction
              .getById(transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getById(transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getById");
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
| **transactionId** | **String**| transaction ID received in the response from BlueSnap | [default to 1011582369] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPaypalTransaction"></a>
# **getPaypalTransaction**
> getPaypalTransaction(orderId).execute();

Retrieve PayPal Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String orderId = "5666625"; // order ID received in the response
    try {
      client
              .transaction
              .getPaypalTransaction(orderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getPaypalTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getPaypalTransaction(orderId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getPaypalTransaction");
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
| **orderId** | **String**| order ID received in the response | [default to 5666625] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPreNotificationDebitAgreement"></a>
# **getPreNotificationDebitAgreement**
> getPreNotificationDebitAgreement().transactionId(transactionId).execute();

Get Pre-Notification Debit Agreement

for Australia and Canada

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionId = "38943468"; // Argument included in the response for the Create Debit Agreement request
    try {
      client
              .transaction
              .getPreNotificationDebitAgreement()
              .transactionId(transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getPreNotificationDebitAgreement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getPreNotificationDebitAgreement()
              .transactionId(transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getPreNotificationDebitAgreement");
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
| **transactionId** | **String**| Argument included in the response for the Create Debit Agreement request | [optional] [default to 38943468] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSepaDd"></a>
# **getSepaDd**
> getSepaDd(transactionId).execute();

Retrieve SEPA DD Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionId = "1014672453"; // transaction ID received in the response from BlueSnap
    try {
      client
              .transaction
              .getSepaDd(transactionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getSepaDd");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getSepaDd(transactionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getSepaDd");
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
| **transactionId** | **String**| transaction ID received in the response from BlueSnap | [default to 1014672453] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSofortTransaction"></a>
# **getSofortTransaction**
> getSofortTransaction(orderId).execute();

Retrieve Sofort Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    Integer orderId = 20922493; // Order ID received in the Create Sofort Transaction response from BlueSnap
    try {
      client
              .transaction
              .getSofortTransaction(orderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getSofortTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .getSofortTransaction(orderId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getSofortTransaction");
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
| **orderId** | **Integer**| Order ID received in the Create Sofort Transaction response from BlueSnap | [default to 20922493] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="initiateRefund"></a>
# **initiateRefund**
> initiateRefund(transactionId).transactionInitiateRefundRequest(transactionInitiateRefundRequest).execute();

Refund



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionId = "1095710747"; // ID of the transaction to be refunded <br> Required if not using `merchantTransactionId`
    String reason = "Refund for order #1992";
    Boolean cancelSubscriptions = false;
    TransactionInitiateRefundRequestTransactionMetaData transactionMetaData = new TransactionInitiateRefundRequestTransactionMetaData();
    try {
      client
              .transaction
              .initiateRefund(transactionId)
              .reason(reason)
              .cancelSubscriptions(cancelSubscriptions)
              .transactionMetaData(transactionMetaData)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#initiateRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .initiateRefund(transactionId)
              .reason(reason)
              .cancelSubscriptions(cancelSubscriptions)
              .transactionMetaData(transactionMetaData)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#initiateRefund");
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
| **transactionId** | **String**| ID of the transaction to be refunded &lt;br&gt; Required if not using &#x60;merchantTransactionId&#x60; | [default to 1095710747] |
| **transactionInitiateRefundRequest** | [**TransactionInitiateRefundRequest**](TransactionInitiateRefundRequest.md)|  | [optional] |

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

<a name="updatePaypalTransaction"></a>
# **updatePaypalTransaction**
> updatePaypalTransaction().transactionUpdatePaypalTransactionRequest(transactionUpdatePaypalTransactionRequest).execute();

Update PayPal Transaction



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    Float amount = 105F;
    String currency = "USD";
    TransactionUpdatePaypalTransactionRequestPaypalTransaction paypalTransaction = new TransactionUpdatePaypalTransactionRequestPaypalTransaction();
    try {
      client
              .transaction
              .updatePaypalTransaction()
              .amount(amount)
              .currency(currency)
              .paypalTransaction(paypalTransaction)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#updatePaypalTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transaction
              .updatePaypalTransaction()
              .amount(amount)
              .currency(currency)
              .paypalTransaction(paypalTransaction)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#updatePaypalTransaction");
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
| **transactionUpdatePaypalTransactionRequest** | [**TransactionUpdatePaypalTransactionRequest**](TransactionUpdatePaypalTransactionRequest.md)|  | [optional] |

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

