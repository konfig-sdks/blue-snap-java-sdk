# AgreementApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDebitForAusCan**](AgreementApi.md#createDebitForAusCan) | **POST** /agreements/debit/{region}/{type} | Create Debit Agreement |
| [**getDebit**](AgreementApi.md#getDebit) | **GET** /agreements/{agreementId} | Get Debit Agreement |


<a name="createDebitForAusCan"></a>
# **createDebitForAusCan**
> createDebitForAusCan(region, type).planid(planid).overriderecurringchargeamount(overriderecurringchargeamount).execute();

Create Debit Agreement

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
import com.konfigthis.client.api.AgreementApi;
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
    String region = "ca"; // Represents the country. Possible Values: `au`, `ca`
    String type = "onetime"; // Represents the mandate type. Possible Values: `onetime`,`recurring`, `ondemand`
    String planid = "planid_example"; // SKU number
    String overriderecurringchargeamount = "overriderecurringchargeamount_example"; // the amount which overrides recurring charge
    try {
      client
              .agreement
              .createDebitForAusCan(region, type)
              .planid(planid)
              .overriderecurringchargeamount(overriderecurringchargeamount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementApi#createDebitForAusCan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .agreement
              .createDebitForAusCan(region, type)
              .planid(planid)
              .overriderecurringchargeamount(overriderecurringchargeamount)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementApi#createDebitForAusCan");
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
| **region** | **String**| Represents the country. Possible Values: &#x60;au&#x60;, &#x60;ca&#x60; | [default to ca] |
| **type** | **String**| Represents the mandate type. Possible Values: &#x60;onetime&#x60;,&#x60;recurring&#x60;, &#x60;ondemand&#x60; | [default to onetime] |
| **planid** | **String**| SKU number | [optional] |
| **overriderecurringchargeamount** | **String**| the amount which overrides recurring charge | [optional] |

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

<a name="getDebit"></a>
# **getDebit**
> getDebit().agreementId(agreementId).execute();

Get Debit Agreement

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
import com.konfigthis.client.api.AgreementApi;
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
    String agreementId = "1065"; // Argument included in the response for the Create Debit Agreement request
    try {
      client
              .agreement
              .getDebit()
              .agreementId(agreementId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementApi#getDebit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .agreement
              .getDebit()
              .agreementId(agreementId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementApi#getDebit");
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
| **agreementId** | **String**| Argument included in the response for the Create Debit Agreement request | [optional] [default to 1065] |

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

