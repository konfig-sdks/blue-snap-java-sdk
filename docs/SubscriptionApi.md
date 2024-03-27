# SubscriptionApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMerchantManagedCharge**](SubscriptionApi.md#createMerchantManagedCharge) | **POST** /recurring/ondemand/{subscriptionId} | Create Merchant-Managed Subscription Charge |
| [**createMerchantManagedSubscription**](SubscriptionApi.md#createMerchantManagedSubscription) | **POST** /recurring/ondemand | Create Merchant-Managed Subscription |
| [**createNew**](SubscriptionApi.md#createNew) | **POST** /recurring/subscriptions | Create Subscription |
| [**getSpecific**](SubscriptionApi.md#getSpecific) | **GET** /recurring/subscriptions/{subscriptionId} | Retrieve Specific Subscription |
| [**getSwitchChargeAmount**](SubscriptionApi.md#getSwitchChargeAmount) | **GET** /recurring/subscriptions/:subscriptionId/switch-charge-amount | Retrieve Subscription Switch Charge Amount |
| [**listAllSubscriptions**](SubscriptionApi.md#listAllSubscriptions) | **GET** /recurring/subscriptions?{parameters} | Retrieve All Subscriptions |
| [**listCharges**](SubscriptionApi.md#listCharges) | **GET** /:subscriptionId/charges?{parameters} | Retrieve All Charges for a Subscription |
| [**updateSubscription**](SubscriptionApi.md#updateSubscription) | **PUT** /recurring/subscriptions/{subscriptionId} | Update Subscription |


<a name="createMerchantManagedCharge"></a>
# **createMerchantManagedCharge**
> createMerchantManagedCharge(subscriptionId).subscriptionCreateMerchantManagedChargeRequest(subscriptionCreateMerchantManagedChargeRequest).execute();

Create Merchant-Managed Subscription Charge



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Integer subscriptionId = 10543419; // BlueSnap identifier for the subscription.
    Float amount = 45F;
    String currency = "USD";
    String merchantTransactionId = "MyUniqueOnDemandSubscription";
    String taxReference = "048deff0-a285-47e1-bc39-42f79bf0095b";
    try {
      client
              .subscription
              .createMerchantManagedCharge(subscriptionId)
              .amount(amount)
              .currency(currency)
              .merchantTransactionId(merchantTransactionId)
              .taxReference(taxReference)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createMerchantManagedCharge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .createMerchantManagedCharge(subscriptionId)
              .amount(amount)
              .currency(currency)
              .merchantTransactionId(merchantTransactionId)
              .taxReference(taxReference)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createMerchantManagedCharge");
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
| **subscriptionId** | **Integer**| BlueSnap identifier for the subscription. | [default to 10543419] |
| **subscriptionCreateMerchantManagedChargeRequest** | [**SubscriptionCreateMerchantManagedChargeRequest**](SubscriptionCreateMerchantManagedChargeRequest.md)|  | [optional] |

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

<a name="createMerchantManagedSubscription"></a>
# **createMerchantManagedSubscription**
> createMerchantManagedSubscription().subscriptionCreateMerchantManagedSubscriptionRequest(subscriptionCreateMerchantManagedSubscriptionRequest).execute();

Create Merchant-Managed Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Float amount = 45F;
    String currency = "USD";
    SubscriptionCreateMerchantManagedSubscriptionRequestPayerInfo payerInfo = new SubscriptionCreateMerchantManagedSubscriptionRequestPayerInfo();
    SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSource paymentSource = new SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSource();
    try {
      client
              .subscription
              .createMerchantManagedSubscription()
              .amount(amount)
              .currency(currency)
              .payerInfo(payerInfo)
              .paymentSource(paymentSource)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createMerchantManagedSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .createMerchantManagedSubscription()
              .amount(amount)
              .currency(currency)
              .payerInfo(payerInfo)
              .paymentSource(paymentSource)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createMerchantManagedSubscription");
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
| **subscriptionCreateMerchantManagedSubscriptionRequest** | [**SubscriptionCreateMerchantManagedSubscriptionRequest**](SubscriptionCreateMerchantManagedSubscriptionRequest.md)|  | [optional] |

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

<a name="createNew"></a>
# **createNew**
> createNew().subscriptionCreateNewRequest(subscriptionCreateNewRequest).execute();

Create Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    SubscriptionCreateNewRequestPayerInfo payerInfo = new SubscriptionCreateNewRequestPayerInfo();
    SubscriptionCreateNewRequestPaymentSource paymentSource = new SubscriptionCreateNewRequestPaymentSource();
    Integer planId = 2283845;
    try {
      client
              .subscription
              .createNew()
              .payerInfo(payerInfo)
              .paymentSource(paymentSource)
              .planId(planId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .createNew()
              .payerInfo(payerInfo)
              .paymentSource(paymentSource)
              .planId(planId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createNew");
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
| **subscriptionCreateNewRequest** | [**SubscriptionCreateNewRequest**](SubscriptionCreateNewRequest.md)|  | [optional] |

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

<a name="getSpecific"></a>
# **getSpecific**
> getSpecific(subscriptionId).execute();

Retrieve Specific Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Integer subscriptionId = 8491535; // BlueSnap identifier for the subscription.
    try {
      client
              .subscription
              .getSpecific(subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .getSpecific(subscriptionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSpecific");
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
| **subscriptionId** | **Integer**| BlueSnap identifier for the subscription. | [default to 8491535] |

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

<a name="getSwitchChargeAmount"></a>
# **getSwitchChargeAmount**
> getSwitchChargeAmount().newplanid(newplanid).newquantity(newquantity).execute();

Retrieve Subscription Switch Charge Amount



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String newplanid = "111111";
    String newquantity = "2";
    try {
      client
              .subscription
              .getSwitchChargeAmount()
              .newplanid(newplanid)
              .newquantity(newquantity)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSwitchChargeAmount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .getSwitchChargeAmount()
              .newplanid(newplanid)
              .newquantity(newquantity)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSwitchChargeAmount");
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
| **newplanid** | **String**|  | [optional] [default to 111111] |
| **newquantity** | **String**|  | [optional] [default to 2] |

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

<a name="listAllSubscriptions"></a>
# **listAllSubscriptions**
> listAllSubscriptions().pagesize(pagesize).after(after).gettotal(gettotal).fulldescription(fulldescription).execute();

Retrieve All Subscriptions



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String pagesize = "5";
    String after = "34567";
    Boolean gettotal = true;
    Boolean fulldescription = false;
    try {
      client
              .subscription
              .listAllSubscriptions()
              .pagesize(pagesize)
              .after(after)
              .gettotal(gettotal)
              .fulldescription(fulldescription)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listAllSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .listAllSubscriptions()
              .pagesize(pagesize)
              .after(after)
              .gettotal(gettotal)
              .fulldescription(fulldescription)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listAllSubscriptions");
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
| **pagesize** | **String**|  | [optional] [default to 5] |
| **after** | **String**|  | [optional] [default to 34567] |
| **gettotal** | **Boolean**|  | [optional] [default to true] |
| **fulldescription** | **Boolean**|  | [optional] [default to false] |

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

<a name="listCharges"></a>
# **listCharges**
> listCharges().pagesize(pagesize).after(after).fulldescription(fulldescription).execute();

Retrieve All Charges for a Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    String pagesize = "3";
    String after = "163193";
    Boolean fulldescription = false;
    try {
      client
              .subscription
              .listCharges()
              .pagesize(pagesize)
              .after(after)
              .fulldescription(fulldescription)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listCharges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .listCharges()
              .pagesize(pagesize)
              .after(after)
              .fulldescription(fulldescription)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listCharges");
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
| **pagesize** | **String**|  | [optional] [default to 3] |
| **after** | **String**|  | [optional] [default to 163193] |
| **fulldescription** | **Boolean**|  | [optional] [default to false] |

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

<a name="updateSubscription"></a>
# **updateSubscription**
> updateSubscription(subscriptionId).subscriptionUpdateSubscriptionRequest(subscriptionUpdateSubscriptionRequest).execute();

Update Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
    Integer subscriptionId = 8491543; // BlueSnap identifier for the subscription.
    String planId = "2283849";
    try {
      client
              .subscription
              .updateSubscription(subscriptionId)
              .planId(planId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .updateSubscription(subscriptionId)
              .planId(planId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscription");
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
| **subscriptionId** | **Integer**| BlueSnap identifier for the subscription. | [default to 8491543] |
| **subscriptionUpdateSubscriptionRequest** | [**SubscriptionUpdateSubscriptionRequest**](SubscriptionUpdateSubscriptionRequest.md)|  | [optional] |

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

