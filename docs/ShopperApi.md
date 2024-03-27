# ShopperApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVaultedShopper**](ShopperApi.md#createVaultedShopper) | **POST** /vaulted-shoppers | Create Vaulted Shopper |
| [**deleteVaultedShopper**](ShopperApi.md#deleteVaultedShopper) | **DELETE** /vaulted-shoppers/{vaultedShopperId} | Delete Vaulted Shopper |
| [**get**](ShopperApi.md#get) | **GET** /vaulted-shoppers/{vaultedShopperId} | Retrieve Vaulted Shopper |
| [**updateVaultedShopper**](ShopperApi.md#updateVaultedShopper) | **PUT** /vaulted-shoppers/{vaultedShopperId} | Update Vaulted Shopper |


<a name="createVaultedShopper"></a>
# **createVaultedShopper**
> createVaultedShopper().shopperCreateVaultedShopperRequest(shopperCreateVaultedShopperRequest).execute();

Create Vaulted Shopper



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShopperApi;
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
    ShopperCreateVaultedShopperRequestPaymentSources paymentSources = new ShopperCreateVaultedShopperRequestPaymentSources();
    String firstName = "FirstName";
    String lastName = "LastName";
    try {
      client
              .shopper
              .createVaultedShopper()
              .paymentSources(paymentSources)
              .firstName(firstName)
              .lastName(lastName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#createVaultedShopper");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shopper
              .createVaultedShopper()
              .paymentSources(paymentSources)
              .firstName(firstName)
              .lastName(lastName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#createVaultedShopper");
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
| **shopperCreateVaultedShopperRequest** | [**ShopperCreateVaultedShopperRequest**](ShopperCreateVaultedShopperRequest.md)|  | [optional] |

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

<a name="deleteVaultedShopper"></a>
# **deleteVaultedShopper**
> deleteVaultedShopper(vaultedShopperId).execute();

Delete Vaulted Shopper



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShopperApi;
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
    String vaultedShopperId = "20769005"; // vaultedShopperId received from BlueSnap
    try {
      client
              .shopper
              .deleteVaultedShopper(vaultedShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#deleteVaultedShopper");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shopper
              .deleteVaultedShopper(vaultedShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#deleteVaultedShopper");
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
| **vaultedShopperId** | **String**| vaultedShopperId received from BlueSnap | [default to 20769005] |

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

<a name="get"></a>
# **get**
> get(vaultedShopperId).execute();

Retrieve Vaulted Shopper



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShopperApi;
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
    String vaultedShopperId = "20769005"; // vaultedShopperId received from BlueSnap
    try {
      client
              .shopper
              .get(vaultedShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shopper
              .get(vaultedShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#get");
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
| **vaultedShopperId** | **String**| vaultedShopperId received from BlueSnap | [default to 20769005] |

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

<a name="updateVaultedShopper"></a>
# **updateVaultedShopper**
> updateVaultedShopper(vaultedShopperId).shopperUpdateVaultedShopperRequest(shopperUpdateVaultedShopperRequest).execute();

Update Vaulted Shopper



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShopperApi;
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
    String vaultedShopperId = "40444721"; // vaultedShopperId received from BlueSnap
    ShopperUpdateVaultedShopperRequestPaymentSources paymentSources = new ShopperUpdateVaultedShopperRequestPaymentSources();
    String firstName = "FirstName";
    String lastName = "LastName";
    try {
      client
              .shopper
              .updateVaultedShopper(vaultedShopperId)
              .paymentSources(paymentSources)
              .firstName(firstName)
              .lastName(lastName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#updateVaultedShopper");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shopper
              .updateVaultedShopper(vaultedShopperId)
              .paymentSources(paymentSources)
              .firstName(firstName)
              .lastName(lastName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopperApi#updateVaultedShopper");
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
| **vaultedShopperId** | **String**| vaultedShopperId received from BlueSnap | [default to 40444721] |
| **shopperUpdateVaultedShopperRequest** | [**ShopperUpdateVaultedShopperRequest**](ShopperUpdateVaultedShopperRequest.md)|  | [optional] |

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

